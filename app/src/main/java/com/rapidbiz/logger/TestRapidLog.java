package com.rapidbiz.logger;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class TestRapidLog extends Activity {
	
	private static final String TAG = "RAPID/LOG";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		RapidAppLog log = new RapidAppLog(this);
		log.d(TAG, "test debug");
		
		log.i(TAG, "test info");
		log.w(TAG, "test warn");
		log.v(TAG, "test verbose");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
