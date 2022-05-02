package com.alphaville.coffeeapplication;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.alphaville.coffeeapplication.model.CoffeeProduct;

import java.util.List;

// Denna viewmodel borde användas av både searchlistan & searchbaren/filter
//
public class SearchListViewModel extends ViewModel {

    // Gör senare om till en lista av kaffeproduktobjekt, denna lista ska sorteras baseras
    // på sök / filter
    private final MutableLiveData<List<CoffeeProduct>> filteredList = new MutableLiveData<List<CoffeeProduct>>();

    public LiveData<List<CoffeeProduct>> getFilteredList() {
        return filteredList;
    }
    // Fixa via modellen att filteredList uppdateras baserat på filter & sök
}
