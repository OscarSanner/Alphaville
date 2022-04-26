package com.alphaville.coffeeapplication.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.alphaville.coffeeapplication.R;
import com.alphaville.coffeeapplication.databinding.ReviewDataFragmentBinding;


public class ReviewDataFragment extends Fragment {

    ReviewDataFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.review_data_fragment, container, false);

    return binding.getRoot();
    }

    public void initInputBox(final ReviewDataFragmentBinding binding) {

        EditText inputBox = binding.inputBox;
        inputBox.setHint("Enter your review");
    }
}
