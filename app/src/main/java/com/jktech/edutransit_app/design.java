package com.jktech.edutransit_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class design extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);

        // Find the TextViews
        TextView createRideTextView = findViewById(R.id.create_ride_textview);
        TextView joinRideTextView = findViewById(R.id.join_ride_textview);

        // Set click listeners for the TextViews
        createRideTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click for creating a ride
                startActivity(new Intent(design.this, CreateRideActivity.class));
            }
        });

        joinRideTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click for joining a ride
                startActivity(new Intent(design.this, JoinRideActivity.class));
            }
        });
    }

    // Method to handle click for creating a ride
    public void onCreateRideClick(View view) {
        startActivity(new Intent(this, CreateRideActivity.class));
    }

    // Method to handle click for joining a ride
    public void onJoinRideClick(View view) {
        startActivity(new Intent(this, JoinRideActivity.class));
    }
}
