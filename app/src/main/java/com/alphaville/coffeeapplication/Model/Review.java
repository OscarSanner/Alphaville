package com.alphaville.coffeeapplication.Model;

import com.alphaville.coffeeapplication.CoffeeProduct;

import java.sql.Timestamp;

/**
 * The Review class is a data class representing a review of a CoffeeProduct
 */
public class Review {

    CoffeeProduct coffeeProduct;
    /**
     * Free form text review of coffeeProduct
     */
    private final String textReview;
    private final double rating;
    private final String location;
    private final String drinkCategory;
    private final Timestamp creationTime;

    //TODO possibly add taste clock attributes


    public Review(CoffeeProduct coffeeProduct, String textReview, double rating, String location, String drinkCategory, Timestamp creationTime) {
        this.coffeeProduct = coffeeProduct;
        this.textReview = textReview;
        this.rating = rating;
        this.location = location;
        this.drinkCategory = drinkCategory;
        this.creationTime = creationTime;
    }

    public String getTextReview() {
        return textReview;
    }

}
