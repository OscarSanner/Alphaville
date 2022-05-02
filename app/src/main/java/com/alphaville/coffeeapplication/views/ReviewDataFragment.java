package com.alphaville.coffeeapplication.views;

import static com.alphaville.coffeeapplication.CoffeeProduct.Process.dry;
import static com.alphaville.coffeeapplication.CoffeeProduct.Roast.light;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

//import com.alphaville.coffeeapplication.databinding.ReviewDataFragmentBinding;

import com.alphaville.coffeeapplication.CoffeeProduct;
import com.alphaville.coffeeapplication.databinding.ReviewDataFragmentBinding;

import com.alphaville.coffeeapplication.viewModels.ReviewDataViewModel;

import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * ReviewDataFragment is the fragment for inputting and saving a text review
 */
public class ReviewDataFragment extends Fragment {

    //TODO Try to implement databinding for MVVM
    private ReviewDataFragmentBinding binding;
    private ReviewDataViewModel viewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = ReviewDataFragmentBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        viewModel = new ReviewDataViewModel();

        //initRatingbar();
        initInputBox();
        initSaveButton();

    return view;
    }

    /**
     * Initiates the input box for inputting text review
     */
    public void initInputBox() {
        binding.inputBox.setHint("Enter your review");
    }

   /* public void initRatingbar(View view){
        ratingBar = view.findViewById(R.id.ratingBar);
   }*/

    /**
     * Initiates save button for text review
     */
    //TODO Remove test coffeeProduct
    public void initSaveButton() {
        binding.textSaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("pressed");

                //Test object
                CoffeeProduct cp = new CoffeeProduct("placeHolder", "testCountry",
                        99999, light, dry, new ArrayList<>(), "testDesc", true);

                viewModel.createReview(cp, binding.inputBox.getText().toString(),
                        binding.ratingBar.getRating(), "testLocation",
                        "testCategory", new Timestamp(System.currentTimeMillis())
                        );
            }
        });
    }

}
