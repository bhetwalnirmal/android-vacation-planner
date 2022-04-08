package com.nirmalbhetwal.vacationplanner;

import java.io.Serializable;

public class Place implements Serializable {
    private String name;
    private double costOfVisit;
    private int[] image;

    public Place(String name, double costOfVisit, int[] image) {
        this.name = name;
        this.costOfVisit = costOfVisit;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostOfVisit() {
        return costOfVisit;
    }

    public void setCostOfVisit(double costOfVisit) {
        this.costOfVisit = costOfVisit;
    }

    public int[] getImage() {
        return image;
    }

    public void setImage(int[] image) {
        this.image = image;
    }
}
