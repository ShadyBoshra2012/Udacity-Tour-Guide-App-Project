package com.shadyboshra2012.android.udacitytourguideappproject.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.shadyboshra2012.android.udacitytourguideappproject.R;
import com.shadyboshra2012.android.udacitytourguideappproject.objects.Location;

import java.util.ArrayList;

public class LocationsAdapter extends ArrayAdapter<Location> {

    private Context mContext;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param Locations   A List of AndroidFlavor objects to display in a list
     */
    public LocationsAdapter(Context context, ArrayList<Location> Locations) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, Locations);
        mContext = context;
    }



    @Override
    public View getView(final int position, final View convertView, final ViewGroup parent) {
        View listItemView;
        ImageView locationImageView;
        TextView locationNameTextView;
        TextView locationAddressTextView;
        TextView locationPhoneTextView;

        listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.location_list_item, parent, false);
        }

        final Location currentLocation = getItem(position);

        locationNameTextView = listItemView.findViewById(R.id.location_name_text);
        locationNameTextView.setText(currentLocation.getName());

        locationAddressTextView = listItemView.findViewById(R.id.location_address_text);
        locationAddressTextView.setText(currentLocation.getAddress());

        locationPhoneTextView = listItemView.findViewById(R.id.location_phone_text);
        locationPhoneTextView.setText(currentLocation.getPhone());

        locationImageView =  listItemView.findViewById(R.id.location_image_view);
        int resourceId = mContext.getResources().getIdentifier(currentLocation.getImage(), "drawable",
                "com.shadyboshra2012.android.udacitytourguideappproject");
        locationImageView.setImageResource(resourceId);

        if(locationImageView.getDrawable() == null){
            locationImageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
