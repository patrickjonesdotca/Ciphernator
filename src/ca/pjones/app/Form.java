package ca.pjones.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import android.content.Intent;

public class Form extends Activity {
	Bundle bundle;
	String cipherType;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);
        bundle = getIntent().getExtras();
        cipherType = bundle.getString("cipherType");
        toastMe("CipherType is " + cipherType);
    }
    
    private void toastMe(String message)
    {
    	Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}