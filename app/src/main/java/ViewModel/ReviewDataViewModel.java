package ViewModel;

import androidx.lifecycle.ViewModel;

import com.alphaville.coffeeapplication.Model.Review;

public class ReviewDataViewModel extends ViewModel {

    public void createTextReview(String reviewText) {
        Review newReview = new Review(reviewText);
    }
}
