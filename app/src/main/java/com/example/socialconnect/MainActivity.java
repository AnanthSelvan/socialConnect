package com.example.socialconnect;

import android.arch.lifecycle.LifecycleOwner;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.example.socialconnect.databinding.ActivityMainBinding;
import com.example.socialconnect.viewmodel.MyViewModel;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity  implements LifecycleOwner {

    @Inject
    MyViewModel myViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        this.getLifecycle().addObserver(myViewModel);
        activityMainBinding.setViewModel(myViewModel);
        activityMainBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
