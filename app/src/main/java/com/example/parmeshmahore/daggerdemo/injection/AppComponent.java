package com.example.parmeshmahore.daggerdemo.injection;

import android.app.Activity;

import com.example.parmeshmahore.daggerdemo.MainActivity;
import com.example.parmeshmahore.daggerdemo.injection.context.ContextModule;
import com.example.parmeshmahore.daggerdemo.injection.sharepref.SharedPrefModule;

import dagger.Component;

@Component(modules = {SharedPrefModule.class, ContextModule.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);
    void inject(Activity activity);
}
