package com.danicc.myfirstapp;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends Activity {

	public final static String EXTRA_MESSAGE = "com.danicc.myfirstapp.MESSAGE";
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity_actions, menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	public void sendMessage(View vista) {
		Intent iA1 = new Intent(this, DisplayMessageActivity.class);
		EditText editText = (EditText) findViewById(R.id.editText1);
		String message = editText.getText().toString();
		iA1.putExtra(EXTRA_MESSAGE, message);
		startActivity(iA1);
	};
	
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()){
		case R.id.action_search:
			openSearch();
			return true;
		case R.id.action_settings :
			openSettings();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
	
	
	public void openSearch(){
		System.out.println("buscando");
	}

	public void openSettings(){
		System.out.println("setiando");
	}
	
}
