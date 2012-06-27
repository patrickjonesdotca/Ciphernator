package ca.pjones.ciphernator;

import ca.pjones.app.Ciphernator;
import ca.pjones.app.R;
import ca.pjones.app.R.layout;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Splash extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        
        Thread splashThread = new Thread() {
        	public void run() {
        		try {
        			int wait = 0;
        			while(wait < 50) {
        				sleep(5);
        				wait += 10;
        			}
        		} catch (InterruptedException e)  {
        			
        		} finally {
        			finish();
        			moveOn();
        		}
        	}
        };
        splashThread.start();
    }
    
    public void startNow(View view)
    {
    	moveOn();
    }
    
    private void moveOn()
    {
    	Intent i = new Intent(Splash.this, Ciphernator.class);
		startActivity(i);
    }
}