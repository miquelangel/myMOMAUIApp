package course.labs.mymomauiapp;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		SeekBar mySeekBar = ((SeekBar) findViewById(R.id.seekBar1));
		
		mySeekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener(){
			@Override
			public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2){
				TextView black1View = ((TextView) findViewById(R.id.black1));
				black1View.setBackgroundColor(Color.rgb(arg1, arg1, arg1));
				
				TextView white1View = ((TextView) findViewById(R.id.white1));
				white1View.setBackgroundColor(Color.rgb(255 - arg1, 255 - arg1, 255 - arg1));
				
				TextView black2View = ((TextView) findViewById(R.id.black2));
				black2View.setBackgroundColor(Color.rgb(arg1, arg1, arg1));
				TextView white2View = ((TextView) findViewById(R.id.white2));
				white2View.setBackgroundColor(Color.rgb(255 - arg1, 255 - arg1, 255 - arg1));
				TextView red1View = ((TextView) findViewById(R.id.red1));
				red1View.setBackgroundColor(Color.rgb(255 - arg1, arg1, arg1));
				TextView green1View = ((TextView) findViewById(R.id.green1));
				green1View.setBackgroundColor(Color.rgb(arg1, 255 - arg1, arg1));
				TextView blue1View = ((TextView) findViewById(R.id.blue1));
				blue1View.setBackgroundColor(Color.rgb(arg1, arg1, 255 - arg1));
				
			}
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
            }
			@Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
		});
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
			MyDialogFragment frag = new MyDialogFragment();
			frag.show(getFragmentManager(), "MyDialogFragment" );
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
}
