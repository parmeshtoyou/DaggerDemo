package com.example.parmeshmahore.daggerdemo.injection.context;

import android.app.Activity;
import android.content.Context;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityContextModule {

    private final Context activity;

    public ActivityContextModule(Activity activity) {
        this.activity = activity;
    }

    @Named("activity_context")
    @Provides
    public Context context() {
        return activity;
    }

}
