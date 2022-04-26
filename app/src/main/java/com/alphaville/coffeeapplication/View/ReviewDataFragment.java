package com.alphaville.coffeeapplication.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.alphaville.coffeeapplication.R;
//import com.alphaville.coffeeapplication.databinding.ReviewDataFragmentBinding;

import ViewModel.ReviewDataViewModel;

/**
 * ReviewDataFragment is the fragment for inputting and saving a text review
 */
public class ReviewDataFragment extends Fragment {

    //TODO Try to implement databinding for MVVM
    //ReviewDataFragmentBinding binding;
    private TextView inputBox;
    private Button textSaveButton;
    private ReviewDataViewModel viewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.review_data_fragment, container, false);

        viewModel = new ReviewDataViewModel();

        initInputBox(view);
        initSaveButton(view);

    return view;
    }

    /**
     * Initiates the input box for inputting text review
     */
    public void initInputBox(View view) {
        inputBox = view.findViewById(R.id.inputBox);
        inputBox.setHint("Enter your review");
    }

    /**
     * Initiates save button for text review
     */
    public void initSaveButton(View view) {
        textSaveButton = view.findViewById(R.id.textSaveButton);
        textSaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.createTextReview(inputBox.getText().toString());
            }
        });
    }

}
