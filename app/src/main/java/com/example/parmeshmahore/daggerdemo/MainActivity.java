package com.example.parmeshmahore.daggerdemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import com.example.parmeshmahore.daggerdemo.injection.DaggerAppComponent;
import com.example.parmeshmahore.daggerdemo.injection.context.ContextModule;
import com.example.parmeshmahore.daggerdemo.injection.sharepref.SharedPrefModule;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    SharedPreferences sharedPreferences;

    @Inject Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*HumanComponent component = DaggerHumanComponent.builder().build();
        Human human = component.getHuman();

        human.canWork();
        human.think();

        component.getHinduHuman().canThink();
        component.getMuslimHuman().canWork();*/

        Button button = findViewById(R.id.bind);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bindDIData();
            }
        });
    }

    void bindDIData() {

        DaggerAppComponent.builder().sharedPrefModule(new SharedPrefModule(this))
                .contextModule(new ContextModule(this))
                .build().inject(this);

        Log.d("MAIN_ACTIVITY", "Context:" + mContext);
        Log.d("MAIN_ACTIVITY", "sharedPreferences:" + sharedPreferences);

    }
}
