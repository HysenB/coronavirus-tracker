package com.hysenberisha.coronavirustracker.models;

public class LocationStats {

    public String state;
    public String country;
    public int latestTotalCases;
    public int differnceFromPreviousDay;


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
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }


    public int getDiffernceFromPreviousDay() {
        return differnceFromPreviousDay;
    }

    public void setDiffernceFromPreviousDay(int differnceFromPreviousDay) {
        this.differnceFromPreviousDay = differnceFromPreviousDay;
    }
}
