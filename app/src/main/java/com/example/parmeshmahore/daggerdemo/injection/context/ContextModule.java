package com.example.parmeshmahore.daggerdemo.injection.context;

import android.app.Activity;
import android.content.Context;

import com.example.parmeshmahore.daggerdemo.injection.annotations.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {

    public Activity activity;

    public ContextModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    Context getContext() {
        return activity.getApplicationContext();
    }
}
