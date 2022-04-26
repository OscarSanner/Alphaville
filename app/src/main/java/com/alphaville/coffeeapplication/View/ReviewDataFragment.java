package com.alphaville.coffeeapplication.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.alphaville.coffeeapplication.R;
import com.alphaville.coffeeapplication.databinding.ReviewDataFragmentBinding;


public class ReviewDataFragment extends Fragment {

    //ReviewDataFragmentBinding binding;
    private TextView inputBox;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.review_data_fragment, container, false);

        inputBox = view.findViewById(R.id.inputBox);

    return view;
    }

    public void initInputBox() {

        inputBox.setHint("Enter your review");
    }
}
