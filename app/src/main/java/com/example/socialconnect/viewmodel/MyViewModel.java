package com.example.socialconnect.viewmodel;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModel;


import com.example.socialconnect.R;
import com.example.socialconnect.recyclerAdapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class MyViewModel extends ViewModel implements LifecycleObserver {

List<ItemViewModel> itemViewModelList = new ArrayList<>();

ItemViewModel itemViewModel;
RecyclerViewAdapter recyclerViewAdapter;

    public MyViewModel(ItemViewModel itemViewModel, RecyclerViewAdapter recyclerViewAdapter) {
        this.itemViewModel = itemViewModel;
        this.recyclerViewAdapter = recyclerViewAdapter;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void init() {
        contactInfo();
    }


public RecyclerViewAdapter getRecyclerAdapter(){
return recyclerViewAdapter = new RecyclerViewAdapter(itemViewModelList);
}

public void contactInfo() {

ItemViewModel itemViewModel1 = new ItemViewModel();
itemViewModel1.setName("Ram");
itemViewModel1.setId("00326");
itemViewModel1.setLastSeen("Thu, 12.30pm");
itemViewModel1.setProfilepic(R.drawable.ic_launcher_background);
itemViewModelList.add(itemViewModel1);

ItemViewModel itemViewModel2 = new ItemViewModel();
    itemViewModel2.setName("Ramesh");
    itemViewModel2.setEmail("abcde@gmail.com");
    itemViewModelList.add(itemViewModel2);

    ItemViewModel itemViewModel3 = new ItemViewModel();
    itemViewModel3.setName("Suresh");
    itemViewModel3.setProfilepic(R.drawable.ic_launcher_background);
    itemViewModelList.add(itemViewModel3);

}


}
