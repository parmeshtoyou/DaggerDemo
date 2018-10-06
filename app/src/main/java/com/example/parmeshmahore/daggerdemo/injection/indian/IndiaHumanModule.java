package com.example.parmeshmahore.daggerdemo.injection.indian;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class IndiaHumanModule {

    private HinduHuman hinduHuman;
    private MuslimHuman muslimHuman;

    @Inject
    public IndiaHumanModule(HinduHuman hinduHuman, MuslimHuman muslimHuman) {
        this.hinduHuman = hinduHuman;
        this.muslimHuman = muslimHuman;
    }

    @Provides
    public HinduHuman provideHinduHuman() {
        return hinduHuman;
    }

    @Provides
    public MuslimHuman provideMuslimHuman() {
        return muslimHuman;
    }
}
