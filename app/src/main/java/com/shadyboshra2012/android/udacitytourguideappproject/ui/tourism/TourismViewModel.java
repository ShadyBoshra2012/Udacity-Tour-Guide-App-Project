package com.shadyboshra2012.android.udacitytourguideappproject.ui.tourism;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TourismViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TourismViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is tourism fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}