package com.shadyboshra2012.android.udacitytourguideappproject.ui.theaters;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TheatersViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TheatersViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is theaters fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}