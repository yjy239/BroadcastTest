package com.example.practiseforboardcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyBroadcast extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Log.e("receiver", "here");
		Toast.makeText(context, "receviced a broadcast", Toast.LENGTH_SHORT).show();
	}

}
