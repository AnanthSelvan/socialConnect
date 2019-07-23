package com.example.socialconnect.dependency;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {AndroidSupportInjectionModule.class,ActivityBuilderModule.class})
public interface ApplicationCom extends AndroidInjector<ApplicationCom> {

}
