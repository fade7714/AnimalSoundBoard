package com.bartoszarcab.zwierzecydzwiek;

import android.content.Context;

public interface Animal {
    String getName();
    void makeSound(Context context);
    int getImageResource();
}