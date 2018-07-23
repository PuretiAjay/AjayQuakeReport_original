package com.example.android.quakereport;

/**
 * Created by simha on 23/7/18.
 */

public class Earthquake {
    /** Magnitude of the earthquake*/
    private String mMagnitude;

    /** Location of the earthquake*/
    private String mLocation;

    /** Date of the earthquake*/
    private String mDate;

    /**
     * constructs a new {@link Earthquake} object
     *
     * @param magnitude is the magnitude of the earthquake
     * @param location is the city location of the earthquake
     * @param date is the date the earthquake happened
     */
    public Earthquake(String magnitude, String location, String date)
    {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    /**
     *
     * @return magnitude of the earthquake
     */
    public String getMagnitude()
    {
        return mMagnitude;
    }

    /**
     *
     * @return location of the earthquake
     */
    public String getLocation()
    {
        return mLocation;
    }

    /**
     *
     * @return date on which earthquake took place
     */
    public String getDate()
    {
        return mDate;
    }
}
