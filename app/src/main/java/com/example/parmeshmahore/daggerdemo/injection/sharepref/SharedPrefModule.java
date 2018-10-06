package com.example.parmeshmahore.daggerdemo.injection.sharepref;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.parmeshmahore.daggerdemo.injection.annotations.ApplicationContext;
import com.example.parmeshmahore.daggerdemo.injection.context.ContextModule;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class SharedPrefModule {

    @Inject
    public Context mContext;

    @Inject
    public SharedPrefModule(Context context) {
        mContext = context;
    }

    @Provides
    SharedPreferences getSharedPreference() {
        return mContext.getSharedPreferences("APP_PREF", Context.MODE_PRIVATE);
    }
}
