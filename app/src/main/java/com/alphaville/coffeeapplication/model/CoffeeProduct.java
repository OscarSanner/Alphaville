package com.alphaville.coffeeapplication.model;

import java.util.ArrayList;
import java.util.List;

/**
 * An object of the CoffeeProduct type represents a type of coffee bean and describes all its properties, along with whether the user likes it or not.
 *
 * Mostly immutable except for its isLiked attribute, which can be set.
 */
public class CoffeeProduct
{
    /** Possible ways for a coffee product to be processed. */
    public enum Process { dry, wet, honey, anaerobic, carbonic_maceration, giling_basah }
    /** Possible tastes for a coffee product. */
    public enum Taste { floral, fruity, sour_fermented, green_vegetative, roasted, spices, nutty_cocoa, sweet, other }

    /** The name of the coffee product */
    private final String name;
    /** The name of the roastery from which the product originates. */
    private final String roastery;
    /** The name of the country from which the product originates. */
    private final String country;

    /** Elevation above sea level of the product's roastery. */
    private final int elevation;
    /** The way this product has been processed. */
    private final Process process;
    /** A list of all taste profiles that this product matches. */
    private final List<Taste> tastes;

    /** Short description of the product. */
    private final String description;

    /** Whether the user likes the coffeeproduct. */
    private boolean isLiked;

    public CoffeeProduct(String name, String roastery, String country, int elevation, Process process, List<Taste> tastes, String description){
        this.name = name;
        this.roastery = roastery;
        this. country = country;

        this.elevation = elevation;
        this.process = process;
        this.tastes = new ArrayList<>(tastes);

        this.description = description;
        this.isLiked = false;
    }

    // Getters ------------

    public String getName() { return name; }

    public String getRoastery() { return roastery; }

    public String getCountry() { return country; }

    public int getElevation() { return elevation; }

    public Process getProcess() { return process; }

    public List<Taste> getTastes() { return tastes; }

    public String getDescription() { return description; }

    public boolean isLiked() { return isLiked; }


    // Setters ------------

    public void setLiked(boolean isLiked){
        this.isLiked = isLiked;
    }


}
