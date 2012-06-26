package ca.pjones.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import ca.pjones.ciphernator.*;


public class Form extends Activity {
	private Bundle bundle;
	private String cipherType;
	private ca.pjones.ciphernator.Ciphernator cr;
	private Boolean isEncrypting = null;
	private EditText et;
	private TextView tv;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);
        et = (EditText) findViewById(R.id.editText1);
        tv = (TextView) findViewById(R.id.textView2);
        bundle = getIntent().getExtras();       
    }
    
    public void buttonClicked(View view)
    {
    	String message = null;
    	cipherType = bundle.getString("cipherType");
        cr = CipherTypes.valueOf(cipherType).build();
    	cr.inputString = Form.this.et.getText().toString();
    	if(isEncrypting == false) {
    		cr.decryptString();
    	} else {
    		cr.encryptString();
    	}
    	tv.setText(cr.getOutputString());
    }
    
    public void encryptButtonClicked(View view)
    {
    	isEncrypting = true; 
    }
    
    public void decryptButtonClicked(View view)
    {
    	isEncrypting = false;     	
    }
    
    private void toastMe(String message)
    {
    	Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
