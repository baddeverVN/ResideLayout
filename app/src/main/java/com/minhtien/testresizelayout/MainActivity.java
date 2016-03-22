package com.minhtien.testresizelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ResideLayout resideLayout = (ResideLayout) findViewById(R.id.reside_layout);
    }
}
