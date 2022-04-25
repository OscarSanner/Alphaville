package com.alphaville.coffeeapplication.Model;

public class Review {

    //CoffeeProduct coffeeProduct;
    private String textReview;
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
