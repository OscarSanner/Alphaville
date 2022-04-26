package com.alphaville.coffeeapplication;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

        /*//listener for the review button
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
        });*/
    }
}