package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.AndroidCharacter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by jungh on 2/14/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int listBackgroundColor;

    public WordAdapter(Context context, ArrayList<Word> array, int listBackgroundColor) {
        super(context, 0, array);
        this.listBackgroundColor = listBackgroundColor;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word wordLists = getItem(position);

        ImageView listImageView = (ImageView) listItemView.findViewById(R.id.list_image);
        if (wordLists.getmImage() != 0)
            listImageView.setImageResource(wordLists.getmImage());
        else listImageView.setVisibility(View.GONE);

        TextView miwokTextVIEW = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextVIEW.setText(wordLists.getmMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(wordLists.getDefaultTranslation());

        LinearLayout listLinear = (LinearLayout) listItemView.findViewById(R.id.list_item_background);
        listLinear.setBackgroundResource(listBackgroundColor);

        return listItemView;
    }
}
