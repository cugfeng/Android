package com.example.myhelloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	private EditText mDiameterEdit1;
	private EditText mDiameterEdit2;
	private TextView mResultView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mDiameterEdit1 = (EditText)findViewById(R.id.diameter_edit1);
        mDiameterEdit2 = (EditText)findViewById(R.id.diameter_edit2);
        mResultView = (TextView)findViewById(R.id.result_view);
    }
    
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    
    public void calculateArea(View v) {
    	Double diameter1 = Double.valueOf(mDiameterEdit1.getText().toString());
    	Double diameter2 = Double.valueOf(mDiameterEdit2.getText().toString());
    	Double area1 = diameter1 * diameter1 * Math.PI / 4;
    	Double area2 = diameter2 * diameter2 * Math.PI / 4;
    	Double area = area1 + area2;
    	mResultView.setText(area.toString());
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void startActivityChooseWireNumber(View v) {
        Intent intent = new Intent(MainActivity.this, ChooseWireNumberActivity.class);
        startActivity(intent);
    }
}
