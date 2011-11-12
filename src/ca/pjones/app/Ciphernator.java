package ca.pjones.app;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.content.Intent;
import java.util.ArrayList;

enum CipherTypes {
	Reverser, CaeserShifter;
	public static CipherTypes find(int index) {
		return values()[index];
	}
};

public class Ciphernator extends ListActivity {
	String[] menulist;
	ArrayAdapter<String> arrayAdapter;
	Bundle bundle;
	ArrayList<String> als;
	int _menuItem;
	String _toastString;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildMenuList();
		arrayAdapter = new ArrayAdapter<String>(this, R.layout.menu, R.id.label, menulist);
		setListAdapter(arrayAdapter);
		bundle = new Bundle();
    }
    
    @Override
	protected void onListItemClick(ListView listview, View view, int location, long id) {
    	_menuItem = (int)id;
    	_toastString = CipherTypes.find(_menuItem).toString();
    	toastMe(_toastString + " Chosen");
    	bundle.putString("cipherType", _toastString);
    	Intent form = new Intent(Ciphernator.this, Form.class);
    	form.putExtras(bundle);
    	startActivity(form);
	}
    
    private void buildMenuList()
    {
    	als = new ArrayList<String>();
    	for(CipherTypes ct : CipherTypes.values()) { als.add(ct.toString());}
    	menulist = new String[als.size()];
    	for(int i = 0; i < als.size(); i++) {
    		menulist[i] = als.get(i);
    	}
    }
    
    private void toastMe(String message)
    {
    	Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
