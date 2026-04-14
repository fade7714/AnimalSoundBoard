package com.bartoszarcab.zwierzecydzwiek;

import android.content.Context;
import android.media.MediaPlayer;

public class Dog implements Animal {
    @Override
    public String getName() { return "Pies"; }

    @Override
    public void makeSound(Context context) {
        MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.dog_bark);
        if (mediaPlayer != null) {
            mediaPlayer.setOnCompletionListener(MediaPlayer::release);
            mediaPlayer.start();
        }
    }

    @Override
    public int getImageResource() {
        return R.drawable.ic_dog;
    }
}