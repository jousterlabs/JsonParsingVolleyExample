package com.jousterlabs.Jsonparsingvolley.commonutils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class CheckInterNetClass {

	Context context;

	public CheckInterNetClass(Context mContext) {
		this.context = mContext;
	}

	public boolean isConnectingToInternet() {

		try {
			ConnectivityManager connectivityManager = (ConnectivityManager) context
					.getSystemService(Context.CONNECTIVITY_SERVICE);
			if (connectivityManager != null) {
				NetworkInfo networkInfo[] = connectivityManager
						.getAllNetworkInfo();
				if (networkInfo != null) {
					for (int i = 0; i < networkInfo.length; i++) {
						if (networkInfo[i].getState() == NetworkInfo.State.CONNECTED) {
							return true;
						}
					}

				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}

		return false;

	}
}
