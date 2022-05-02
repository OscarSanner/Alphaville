package com.alphaville.coffeeapplication.viewModels;

import static com.alphaville.coffeeapplication.CoffeeProduct.Process.dry;
import static com.alphaville.coffeeapplication.CoffeeProduct.Roast.light;

import androidx.lifecycle.ViewModel;

import com.alphaville.coffeeapplication.CoffeeProduct;
import com.alphaville.coffeeapplication.Model.Review;
import com.alphaville.coffeeapplication.Model.ReviewHandler;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * ReviewDataViewModel is the viewmodel responsible for communicating with the model and create
 * text reviews.
 */
public class ReviewDataViewModel extends ViewModel {

    //TODO Initialize review handler in main activity or implement separate viewmodel
    // that gives access to model etc.
    ReviewHandler reviewHandler = new ReviewHandler();

    /**
     * Creates a review for a specific coffee product
     * @param cp the {@link CoffeeProduct} that has been reviewed
     * @param textReview the text review
     * @param rating the rating
     * @param location the location where the coffee was drank
     * @param drinkCategory the type of drink the coffee was consumed as
     * @param creationTime the time the review was created
     */
    public void createReview(CoffeeProduct cp, String textReview,
                             double rating, String location, String drinkCategory, Timestamp creationTime){


        reviewHandler.createReview(cp, textReview, rating, "testLocation",
                "testCategory", new Timestamp(System.currentTimeMillis()));

    }
}
