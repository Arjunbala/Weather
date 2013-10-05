package com.example.weatherapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {
	final Context context = this;
	String change_city = new String();
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton ref = (ImageButton) findViewById(R.id.refresh);
        ref.setOnClickListener(ref_func);
        Button change = (Button) findViewById(R.id.change);
        change.setOnClickListener(change_func);
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

View.OnClickListener change_func = new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
		alertDialogBuilder.setTitle("Change City");
		alertDialogBuilder.setMessage("Enter the name of the city");
		final EditText input = new EditText(context);
		alertDialogBuilder.setView(input);
		alertDialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog,int id) {
				change_city = input.getText().toString();
			}
		  });
		}
};


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
