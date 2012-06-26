package ca.pjones.utils;

import android.widget.Toast;
import android.content.Context;

public class Utils {
    public void toastMe(Context c, String message)
    {
    	Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
    }
}
