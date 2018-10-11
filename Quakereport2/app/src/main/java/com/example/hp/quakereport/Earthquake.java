package com.example.hp.quakereport;

public class Earthquake {

    private final long mTimeInMilliseconds;
    private double mMagnitude;

    private String mLocation;

    private String mDate;

    /** Website URL of the earthquake */
    private String mUrl;


    /**
     * Constructs a new {@link Earthquake} object.
     *  @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }
    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}

