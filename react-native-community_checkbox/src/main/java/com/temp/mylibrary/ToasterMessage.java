package com.temp.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void message(Context c, String message) {

        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();

    }
}