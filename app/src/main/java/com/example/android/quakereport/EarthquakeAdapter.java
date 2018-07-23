package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by simha on 23/7/18.
 */

/**
 * An {@link EarthquakeAdapter} knows how to create a list item for earthquake
 * in the data source {a list of {@link Earthquake} objects}
 *
 * These list item layouts are given to an adapter view like ListView to be displayed to the user
 */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    /**
     * constructs a new (@link EarthquakeAdapter)
     *
     * @param context of the app
     * @param earthquakes is the list of earthquakes which is the datasource of the adapter
     */
    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    /**
     * @return the list item view that displays information about the earthquake at the given
     * position in the list of earthquakes
     */
    @Override
     public View getView(int position, View convertView, ViewGroup parent)
    {
        /**
         * check if there is an existing list item view {called convertView} that we can reuse,
         * otherwise(if convertView is null), then inflate a new list item view
         */
        View listItemView = convertView;
        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, parent, false);
        }

        //find the earthquake at the given position in the list of earthquakes
        Earthquake currentEarthquake = getItem(position);

        // find the TextView with View Id magnitude
        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        // Display the magnitude of the current earthquake in that TextView
        magnitudeView.setText(currentEarthquake.getMagnitude());

        // find the TextView with View Id location
        TextView locationView = (TextView) listItemView.findViewById(R.id.location);
        // Display the lcoation of the current earthquake in that TextView
        locationView.setText(currentEarthquake.getLocation());

        // find the TextView with View Id date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Display the date of the current earthquake in that TextView
        dateView.setText(currentEarthquake.getDate());

        return listItemView;
    }
}
