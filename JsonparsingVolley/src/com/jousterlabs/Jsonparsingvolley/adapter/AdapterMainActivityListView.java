package com.jousterlabs.Jsonparsingvolley.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import com.jousterlabs.Jsonparsingvolley.SplashScreenActivity;
import com.jousterlabs.Jsonparsingvolley.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AdapterMainActivityListView extends BaseAdapter {

	Context context;
	LayoutInflater layoutInflater;
	LinearLayout linearLayout_buttomLay;
	ArrayList<HashMap<String, String>>arrayList_hHashMaps;

	public AdapterMainActivityListView(Context mContext,ArrayList<HashMap<String, String>>mArrayList_hHashMaps) {
		this.context = mContext;
		this.arrayList_hHashMaps=mArrayList_hHashMaps;
		this.layoutInflater = LayoutInflater.from(mContext);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return arrayList_hHashMaps.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		// string=""+position;
		return arrayList_hHashMaps.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		// boolean_Clicked=true;
		final ViewHolder viewHolder;
		convertView = layoutInflater.inflate(R.layout.mainactivity_list_items,
				null);

		if (convertView != null) {
			viewHolder = new ViewHolder();
			viewHolder.textView_Name = (TextView) convertView
					.findViewById(R.id.txt_MainActivity_list_items_name);
			viewHolder.textView_Email = (TextView) convertView
					.findViewById(R.id.txt_MainActivity_list_items_email);
			viewHolder.textView_Phone = (TextView) convertView
					.findViewById(R.id.txt_MainActivity_list_items_phone);
			viewHolder.textView_Gender = (TextView) convertView
					.findViewById(R.id.txt_MainActivity_list_items_gender);

			viewHolder.textView_Name.setText(arrayList_hHashMaps.get(position).get(SplashScreenActivity.TAG_NAME));
			viewHolder.textView_Email.setText(arrayList_hHashMaps.get(position).get(SplashScreenActivity.TAG_EMAIL));
			viewHolder.textView_Phone.setText(arrayList_hHashMaps.get(position).get(SplashScreenActivity.TAG_MOBILE));
			viewHolder.textView_Gender.setText(arrayList_hHashMaps.get(position).get(SplashScreenActivity.TAG_GENDER));

		}

		return convertView;
	}

	public class ViewHolder {

		TextView textView_Name, textView_Email, textView_Phone,
				textView_Gender;
	}

}
