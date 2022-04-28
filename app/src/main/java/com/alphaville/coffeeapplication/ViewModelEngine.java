package com.alphaville.coffeeapplication;

import androidx.lifecycle.ViewModel;

/**
 * Abstract ViewModel-class that generates a single instance of the model for all its subclasses.
 */
public abstract class ViewModelEngine extends ViewModel {

    private static final ModelFacade model = new ModelFacade();

    protected final ModelFacade getModel() {
        return model;
    }
}
