package com.example.parmeshmahore.daggerdemo.injection;

import javax.inject.Inject;

public class AbnormalHumans implements INature {

    @Inject
    public AbnormalHumans() {

    }

    @Override
    public void canThink() {
        System.out.println("AbnormalHumans.canThink");
    }

    @Override
    public void canWork() {
        System.out.println("AbnormalHumans.canWork");
    }
}
