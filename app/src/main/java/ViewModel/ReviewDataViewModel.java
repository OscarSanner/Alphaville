package ViewModel;

import androidx.lifecycle.ViewModel;

import com.alphaville.coffeeapplication.Model.Review;
import com.alphaville.coffeeapplication.Model.ReviewHandler;

/**
 * ReviewDataViewModel is the viewmodel responsible for communicating with the model and create
 * text reviews.
 */
public class ReviewDataViewModel extends ViewModel {

    //TODO Initialize review handler in main activity or implement separate viewmodel
    // that gives access to model (see ModelEngineViewModel in Deptify project
    // (https://github.com/OlofSjogren/GoAyo/blob/master/app/src/main/java/com/goayo/debtify/viewmodel/ModelEngineViewModel.java))
    ReviewHandler reviewHandler = new ReviewHandler();

    public void createTextReview(String reviewText) {
       reviewHandler.createTextReview(reviewText);
    }
    public void createTextAndRatingReview(String reviewText, double rating){
        reviewHandler.createTextAndRatingReview(reviewText,rating);
    }
}
