package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

//  you'll fill in those lists with list items, populated using a custom adapter
//  Custom WordAdapter object

public class WordAdapter extends ArrayAdapter<Word> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    private int backgrountColor;

    //    Custom listItemView acts as a container for list items in words_list
    private View listItemView;

//  Custom WordAdapter constructor

    public WordAdapter(Context context, List<Word> words, int backgrountColor) {
        super(context, 0, words);
        this.backgrountColor = backgrountColor;
    }

//    By default BaseAdapter expects that the provided resource id references a single TextView.
//    To use something other than TextViews for the array display, for instance, ImageViews,
//    override getView(int, View, ViewGroup) to return the type of custom view - listItemView

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
//  Get current Word object.
        final Word currentWord = getItem(position);
        int color = ContextCompat.getColor(getContext(), backgrountColor);

//        Inflate TextView of the current listItem and fill this with corresponding text
//  and background color
        TextView miwokTranslationTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTranslationTextView.setText(currentWord.getmMiwokTranslation());
        miwokTranslationTextView.setBackgroundColor(color);

        TextView defaultTranslationTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTranslationTextView.setText(currentWord.getmDefaultTranslation());
        defaultTranslationTextView.setBackgroundColor(color);

        ImageView listImageView = (ImageView) listItemView.findViewById(R.id.image);
        ImageView playImageView = (ImageView) listItemView.findViewById(R.id.playImage);
        playImageView.setBackgroundColor(color);
        playImageView.setImageResource(R.drawable.ic_play_arrow_white_24dp);

//        Make decision to set listImageView with image or not
        if (currentWord.hasmImage()) {
            listImageView.setImageResource(currentWord.getmImageResourceId());
        } else {
            listImageView.setVisibility(View.GONE);
        }

//        Return current listImageView filled up with actual information in the corresponding views
// of the listItemView.
        return listItemView;
    }
}
