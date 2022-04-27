package com.alphaville.coffeeapplication;

import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.alphaville.coffeeapplication.databinding.CoffeeInfoViewFragmentBinding;

import org.jetbrains.annotations.NotNull;

public class CoffeeInfoViewFragment extends Fragment {

    private CoffeeInfoViewFragmentBinding binding;

    @Override
    public View onCreateView (LayoutInflater inflater,
                          ViewGroup container,
                          Bundle savedInstanceState) {
        binding = CoffeeInfoViewFragmentBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
        /*
        setCoffeeAttributes();
        setCoffeeInformation();
        setCoffeePicture();

        //listener for the review button
        binding.reviewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //viewmodel.openReviewPage();
            }
        });

        //listener for the heart button (the boolean value in model needs to reverse)
        binding.likeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //viewmodel.changeLikeStatus(binding.likeBtn.isChecked());
            }
        });
        */
    }

    private void setCoffeeInformation(String name, String info, String description){
        binding.coffeenameText.setText(name);
        binding.infoText.setText(info);
        binding.descriptionText.setText(description);
    }

    private void setCoffeeAttributes(String hight, String flavour, String country, String region,
                                     String process, String rostery, String brand){
        binding.hightText.setText(hight);
        binding.flavourText.setText(flavour);
        binding.countryText.setText(country);
        binding.regionText.setText(region);
        binding.processText.setText(process);
        binding.rosteryText.setText(rostery);
        binding.brandText.setText(brand);
    }

    //Don't know which setImage-method to use here
    @RequiresApi(api = Build.VERSION_CODES.M)
    private void setCoffeePicture(Icon image){
        binding.coffeepicture.setImageIcon(image);
    }

}