package com.example.parmeshmahore.daggerdemo.injection.indian;

import com.example.parmeshmahore.daggerdemo.injection.INature;

import javax.inject.Inject;

public class MuslimHuman implements INature {

    @Inject
    public MuslimHuman() {}

    @Override
    public void canThink() {
        System.out.println("MuslimHuman.canThink");
    }

    @Override
    public void canWork() {
        System.out.println("MuslimHuman.canWork");
    }
}
