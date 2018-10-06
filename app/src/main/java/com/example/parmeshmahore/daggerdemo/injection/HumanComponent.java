package com.example.parmeshmahore.daggerdemo.injection;

import com.example.parmeshmahore.daggerdemo.injection.indian.HinduHuman;
import com.example.parmeshmahore.daggerdemo.injection.indian.MuslimHuman;

import dagger.Component;

@Component(modules = IndianHumansModule.class)
public interface HumanComponent {
    Human getHuman();

    HinduHuman getHinduHuman();
    MuslimHuman getMuslimHuman();
}
