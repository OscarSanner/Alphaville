package com.alphaville.coffeeapplication.Model;

/**
 * The Review class is a data class representing a review of a CoffeeProduct
 */
public class Review {

    //CoffeeProduct coffeeProduct;
    /**
     * Free form text review of coffeeProduct
     */
    private String textReview;
    private enum Rating {
        ONE(1),TWO(2),THREE(3),FOUR(4),FIVE(5);



        Rating(int i) {
        }
    }
    //TODO Add more attributes


    public Review(String textReview) {
        this.textReview = textReview;
    }

    public String getTextReview() {
        return textReview;
    }

    public void setTextReview(String textReview) {
        this.textReview = textReview;
    }
}
