package com.example.alertdialog;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void showDialog(View view){
    	MyAlert myAlert =new MyAlert();
    	//metemos tag para mais tarde poder ser encontrada por findFragemntByTag
    	myAlert.show(getFragmentManager(), "My Alert");
    }
}
