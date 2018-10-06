package com.example.parmeshmahore.daggerdemo.injection;

import javax.inject.Inject;

import dagger.Provides;

public class Human {

    private NormalHumans mNormalHumans;
    private AbnormalHumans mAbnormalHumans;

    @Inject
    public Human(NormalHumans mNormalHumans, AbnormalHumans mAbnormalHumans) {
        this.mNormalHumans = mNormalHumans;
        this.mAbnormalHumans = mAbnormalHumans;
    }

    public void think() {
        mNormalHumans.canThink();
        mAbnormalHumans.canThink();
    }

    public void canWork() {
        mNormalHumans.canWork();
        mAbnormalHumans.canWork();
    }
}

