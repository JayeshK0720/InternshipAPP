package com.jktech.edutransit_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

public class JoinRideActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<book_ride_1_model> rideList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_ride);

        recyclerView = findViewById(R.id.recycler_view_rides);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Sample ride data (replace with your actual data)
        rideList = new ArrayList<>(Arrays.asList(
                new book_ride_1_model(R.drawable.usericon, "A", "College Road"),
                new book_ride_1_model(R.drawable.usericon, "B", "College Road"),
                new book_ride_1_model(R.drawable.usericon, "C", "College Road"),
                new book_ride_1_model(R.drawable.usericon, "D", "College Road"),
                new book_ride_1_model(R.drawable.usericon, "E", "College Road"),
                new book_ride_1_model(R.drawable.usericon, "F", "College Road"),
                new book_ride_1_model(R.drawable.usericon, "G", "College Road"),
                new book_ride_1_model(R.drawable.usericon, "H", "College Road"),
                new book_ride_1_model(R.drawable.usericon, "I", "College Road"),
                new book_ride_1_model(R.drawable.usericon, "J", "College Road"),
                new book_ride_1_model(R.drawable.usericon, "K", "College Road"),
                new book_ride_1_model(R.drawable.usericon, "L", "College Road"),
                new book_ride_1_model(R.drawable.usericon, "M", "College Road"),
                new book_ride_1_model(R.drawable.usericon, "N", "College Road"),
                new book_ride_1_model(R.drawable.usericon, "O", "College Road"),
                new book_ride_1_model(R.drawable.usericon, "P", "College Road"),
                new book_ride_1_model(R.drawable.usericon, "Q", "College Road")
        ));

        // Create and set the adapter
        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, rideList);
        recyclerView.setAdapter(adapter);
    }
}
