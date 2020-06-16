package com.example.food_preserver;

public class Methods {
    private String name;
    private String canningMethod;
    private String freezingMethod;
    private String dryingMethod;
    private String type;

    public Methods() {

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
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

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Methods{" +
                "name='" + name + '\'' +
                ", canningMethod='" + canningMethod + '\'' +
                ", freezingMethod='" + freezingMethod + '\'' +
                ", dryingMethod='" + dryingMethod + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
