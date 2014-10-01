package com.jousterlabs.Jsonparsingvolley.commonutils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;

public class AlertDialogBoxClass {
	Activity activity;

	public AlertDialogBoxClass(Activity mActivity) {
		this.activity = mActivity;

	}

	@SuppressLint({ "InlinedApi", "NewApi" })
	@SuppressWarnings("deprecation")
	public void AlertDialogBoxCheck(String stringTitle, String alertMsg) {

		final AlertDialog alertDialog;

		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			alertDialog = new AlertDialog.Builder(activity,
					AlertDialog.THEME_DEVICE_DEFAULT_LIGHT).create();
		} else {
			alertDialog = new AlertDialog.Builder(activity).create();
		}

		// Setting Dialog Title
		alertDialog.setTitle(stringTitle);
		// alertDialog.setIcon(R.drawable.ic_delete);

		// Setting Dialog Message
		alertDialog.setMessage(alertMsg);

		// --- Set Yes Button

		alertDialog.setButton("ok", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {

				alertDialog.cancel();
				activity.finish();

			}
		});

		alertDialog.show();
	}

}
