package com.example.okutech.radiobuttoncustomebutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    ToggleButtonGroupTableLayout radGroup1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radGroup1 = (ToggleButtonGroupTableLayout) findViewById(R.id.radGroup1);
        radGroup1.getCheckedRadioButtonId();
        Log.e("radGroup1", "" + radGroup1.toString());
    }
}
