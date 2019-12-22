package com.shadyboshra2012.android.udacitytourguideappproject.ui.tourism;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.shadyboshra2012.android.udacitytourguideappproject.R;
import com.shadyboshra2012.android.udacitytourguideappproject.adapters.LocationsAdapter;
import com.shadyboshra2012.android.udacitytourguideappproject.objects.Location;

import java.util.ArrayList;

public class TourismFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TourismViewModel tourismViewModel =
                ViewModelProviders.of(this).get(TourismViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tourism, container, false);

        // Initialize new ArrayList for locations.
        ArrayList<Location> locations = new ArrayList<>();

        // Array of Locations' names.
        String[] locationsName = new String[]{getString(R.string.tourism_location_name1),
                getString(R.string.tourism_location_name2), getString(R.string.tourism_location_name3),
                getString(R.string.tourism_location_name4), getString(R.string.tourism_location_name5)};

        // Loop to initialize new location
        // And add it to Locations array list.
        for (String locationName : locationsName) {
            String address = getString(R.string.location_address);
            String phone = getString(R.string.location_phone);
            String image = locationName.toLowerCase().replaceAll(" ", "_");
            Location location = new Location(locationName, address, phone, image);
            locations.add(location);
        }

        // Initialize adapter for locations.
        LocationsAdapter locationsAdapter = new LocationsAdapter(root.getContext(), locations);

        // Initialize locations list view and link it with adapter.
        ListView locationsListView = root.findViewById(R.id.locations_list_view);
        locationsListView.setAdapter(locationsAdapter);

        return root;
    }
}