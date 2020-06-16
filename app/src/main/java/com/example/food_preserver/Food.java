package com.example.food_preserver;

public class Food {
    private String name;
    private String canningMethod;
    private String freezingMethod;
    private String dryingMethod;
    private String canningUrl;
    private String freezingUrl;
    private String dryingUrl;
    private String foodName;
    private String description;
    private int image;
    private String imageURL;
    private String type;

    public Food() {
        this.foodName = foodName;
        this.description = description;
        this.image = image;
    }


    //Constructors shouldn't be needed
    /* public Food() {
        name = "Not entered";
        canningMethod = "Not entered";
        freezingMethod = "Not entered";
        dryingMethod = "Not entered";
        canningUrl = "Not entered";
        freezingUrl = "Not entered";
        dryingUrl = "Not entered";
    }

    public Food(String name, String canningMethod, String dryingMethod, String freezingMethod, String canningUrl, String freezingUrl, String dryingUrl) {
        this.name = name;
        this.canningMethod = canningMethod;
        this.freezingMethod = freezingMethod;
        this.dryingMethod = dryingMethod;
        this.canningUrl = canningUrl;
        this.freezingUrl = freezingUrl;
        this.freezingUrl = dryingUrl;
    } */

    public String getName() {
        return name;
    }
    public String getCanningMethod() {
        return canningMethod;
    }

    public String getFreezingMethod() {
        return freezingMethod;
    }

    public String getDryingMethod() {
        return dryingMethod;
    }

    public String getCanningUrl() {
        return canningUrl;
    }

    public String getFreezingUrl() {
        return freezingUrl;
    }

    public String getDryingUrl() {
        return dryingUrl;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

    public String getimageURL() {return imageURL; }

    public String getType() { return type; }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCanningMethod(String canningMethod) {
        this.canningMethod = canningMethod;
    }

    public void setFreezingMethod(String freezingMethod) {
        this.freezingMethod = freezingMethod;
    }

    public void setDryingMethod(String dryingMethod) {
        this.dryingMethod = dryingMethod;
    }

    //Set methods shouldn't be needed
    /* public void setName(String name) {
        this.name = name;
    }

    public void setCanningMethod(String canningMethod) {
        this.canningMethod = canningMethod;
    }

    public void setFreezingMethod(String freezingMethod) {
        this.freezingMethod = freezingMethod;
    }

    public void setDryingMethod(String dryingMethod) {
        this.dryingMethod = dryingMethod;
    }

    public void setCanningUrl(String canningUrl) {
        this.canningUrl = canningUrl;
    }

    public void setFreezingUrl(String freezingUrl) {
        this.freezingUrl = freezingUrl;
    }

    public void setDryingUrl(String dryingUrl) {
        this.dryingUrl = dryingUrl;
    } */

    //toString will need redone if its needed in future
    public String toString() {
        return name + canningMethod + freezingMethod + dryingMethod + canningUrl + freezingUrl + dryingUrl;
    }


}
