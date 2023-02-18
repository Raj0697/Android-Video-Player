package com.example.video_player;

import android.support.v7.app.ActionBarActivity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class MainActivity extends ActionBarActivity implements OnClickListener {
	VideoView v;
	MediaPlayer m1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		try {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
			Toast.makeText(this, "created by Raj", Toast.LENGTH_SHORT).show();
			
			v = (VideoView)findViewById(R.id.videoView1);
			m1 = MediaPlayer.create(this, R.raw.tokyo);
			
			MediaController m = new MediaController(this);
			m.setAnchorView(v);
			Uri u = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.speed);
			Uri ur = Uri.parse(Environment.getExternalStorageDirectory().getPath()+"D://videos/speed.mp4");
			v.setMediaController(m);
			v.setVideoURI(u);
			v.requestFocus();
			v.start();
		}
		catch(Exception e) {
			Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
			}
}
