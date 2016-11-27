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

/**
 * Created by YB on 20.11.2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    private int backgrountColor;
    private View listItemView;

    public WordAdapter(Context context, List<Word> words, int backgrountColor) {
        super(context, 0, words);
        this.backgrountColor = backgrountColor;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Word currentWord = getItem(position);
        int color = ContextCompat.getColor(getContext(),backgrountColor);

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

        if (currentWord.hasmImage()) {
            listImageView.setImageResource(currentWord.getmImageResourceId());
        } else {
            listImageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
