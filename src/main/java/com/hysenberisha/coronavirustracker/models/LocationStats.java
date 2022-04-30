package com.hysenberisha.coronavirustracker.models;

public class LocationStats {

    public String state;
    public String country;
    public int totalCases;
    public int todayCases;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return totalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.totalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + totalCases +
                '}';
    }


    public int getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(int todayCases) {
        this.todayCases = todayCases;
    }
}
