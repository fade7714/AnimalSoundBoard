package com.bartoszarcab.zwierzecydzwiek;

import android.content.Context;
import android.media.MediaPlayer;

public class Cat implements Animal {
    @Override
    public String getName() { return "Kot"; }

    @Override
    public void makeSound(Context context) {
        MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.cat_meow);
        if (mediaPlayer != null) {
            mediaPlayer.setOnCompletionListener(MediaPlayer::release);
            mediaPlayer.start();
        }
    }

    @Override
    public int getImageResource() {
        return R.drawable.ic_cat;
    }
}