package com.example.programinginterview;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Category extends Activity {
	public static final String TAG = "PI";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_category);
	}
	public void callNewActivity(View v){
		int viewId = v.getId();
		Button b = (Button) findViewById(viewId);
		String categoryRead = (String) b.getText();
		Log.i(TAG, "DDDDDD:"+categoryRead);
		Intent showTheRule = new Intent(this,QuestionActivity.class);
		showTheRule.putExtra("category", categoryRead);
		startActivity(showTheRule);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.category, menu);
		return true;
	}

}
