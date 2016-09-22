package com.example.recycleview.recycleviewapi.model;

/**
 * Created by STR01587 on 20/9/2559.
 */

public class Country {

    private String imagesFlagContinent;
    private String imagesFlagCountry;
    private String nameContinent;
    private String nameCountry;
    private String nameCapital;
    private String currency;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getImagesFlagContinent() {
        return imagesFlagContinent;
    }

    public void setImagesFlagContinent(String imagesFlagContinent) {
        this.imagesFlagContinent = imagesFlagContinent;
    }

    public String getImagesFlagCountry() {
        return imagesFlagCountry;
    }

    public void setImagesFlagCountry(String imagesFlagCountry) {
        this.imagesFlagCountry = imagesFlagCountry;
    }

    public String getNameCapital() {
        return nameCapital;
    }

    public void setNameCapital(String nameCapital) {
        this.nameCapital = nameCapital;
    }

    public String getNameContinent() {
        return nameContinent;
    }

    public void setNameContinent(String nameContinent) {
        this.nameContinent = nameContinent;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

}