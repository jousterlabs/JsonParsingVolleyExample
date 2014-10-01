package com.jousterlabs.Jsonparsingvolley;

import com.jousterlabs.Jsonparsingvolley.adapter.AdapterMainActivityListView;
import com.jousterlabs.Jsonparsingvolley.R;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

	ListView listView_MainActivity;
	AdapterMainActivityListView adapterMainActivityListView;
	TextView textView_MainActivity_empty;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainactivity);

		listView_MainActivity = (ListView) findViewById(R.id.listView_MainActivity);
		textView_MainActivity_empty = (TextView) findViewById(R.id.txt_MainActivity_empty);
		adapterMainActivityListView = new AdapterMainActivityListView(
				getApplicationContext(), SplashScreenActivity.arrayList_addData);
		listView_MainActivity.setAdapter(adapterMainActivityListView);
		listView_MainActivity.setEmptyView(textView_MainActivity_empty);
	}

}
