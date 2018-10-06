package com.example.parmeshmahore.daggerdemo.injection;

import javax.inject.Inject;

public class NormalHumans implements INature {

    @Inject
    public NormalHumans() {

    }

    @Override
    public void canThink() {
        System.out.println("NormalHumans.canThink");
    }

    @Override
    public void canWork() {
        System.out.println("NormalHumans.canWork");
    }
}
