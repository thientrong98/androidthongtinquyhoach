package com.thongtinquyhoach.mymap;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.Toast;

public class MToast {
    public static void show(Context context, String message) {
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        View view = toast.getView();
        view.setBackgroundColor(Color.BLUE);
        toast.show();
    }
}
