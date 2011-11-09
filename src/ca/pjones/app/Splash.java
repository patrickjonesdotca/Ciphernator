package ca.pjones.app;

import android.app.Activity;
import android.os.Bundle;
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
        			while(wait < 5000) {
        				sleep(100);
        				wait += 100;
        			}
        		} catch (InterruptedException e)  {
        			
        		} finally {
        			finish();
        			Intent i = new Intent(Splash.this, Ciphernator.class);
        			startActivity(i);
        		}
        	}
        };
        splashThread.start();
    }
}