package com.example.parmeshmahore.daggerdemo.injection.indian;

import com.example.parmeshmahore.daggerdemo.injection.INature;

import javax.inject.Inject;

public class HinduHuman implements INature {

    @Inject
    public HinduHuman() { }

    @Override
    public void canThink() {
        System.out.println("HinduHuman.canThink");
    }

    @Override
    public void canWork() {
        System.out.println("HinduHuman.canWork");
    }
}
