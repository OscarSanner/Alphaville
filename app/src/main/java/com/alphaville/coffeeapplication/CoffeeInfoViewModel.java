package com.alphaville.coffeeapplication;

import androidx.lifecycle.ViewModel;

public class CoffeeInfoViewModel extends ViewModelEngine {

    public void changeLikeStatus(boolean value){
        getModel().changeLikeStatus(value);
    }
}
