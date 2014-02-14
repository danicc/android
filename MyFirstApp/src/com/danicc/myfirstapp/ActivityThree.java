package com.danicc.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ActivityThree extends Activity {

	TextView Titulo;
	Button BReturnActivityMain;
	
	OnClickListener l3 = new OnClickListener() {
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent iA3 = new Intent(ActivityThree.this,MainActivity.class);
			startActivity(iA3);
		}
		
	};


	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_three);
		//this define the TextView of layout
		Titulo = (TextView) findViewById(R.id.Titulo);
		
		BReturnActivityMain = (Button) findViewById(R.id.BReturnActiviityMain);
		BReturnActivityMain.setOnClickListener(l3);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_three, menu);
		return true;
	}
	
	
}
