package ru.ifmo.md.lesson2;


import android.app.Activity;
import android.os.Bundle;

public class ActivityForImage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
	Log.i("HELLO", "hello world!");
    }
}
