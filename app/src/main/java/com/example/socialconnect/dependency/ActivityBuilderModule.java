package com.example.socialconnect.dependency;

import com.example.socialconnect.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {


    @ContributesAndroidInjector
    abstract MainActivity mainActivityProvider();


}

