package com.bartoszarcab.zwierzecydzwiek;

import android.content.Context;
import android.media.MediaPlayer;

public class Cow implements Animal {
    @Override
    public String getName() { return "Krowa"; }

    @Override
    public void makeSound(Context context) {
        MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.cow_moo);
        if (mediaPlayer != null) {
            mediaPlayer.setOnCompletionListener(MediaPlayer::release);
            mediaPlayer.start();
        }
    }

    @Override
    public int getImageResource() {
        return R.drawable.ic_cow;
    }
}