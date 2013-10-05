package com.example.weatherapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton ref = (ImageButton) findViewById(R.id.refresh);
        ref.setOnClickListener(ref_func);
        }
  
 View.OnClickListener ref_func = new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		TextView time = (TextView)findViewById(R.id.time);
		TextView city = (TextView)findViewById(R.id.city);
		TextView status = (TextView)findViewById(R.id.status);
		TextView temp = (TextView)findViewById(R.id.temperature);
		time.setText("10:34");
		city.setText("Chennai");
		status.setText("Cloudy");
		temp.setText("30C");
		}
};


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
