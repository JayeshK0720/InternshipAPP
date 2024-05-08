package com.jktech.edutransit_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;

public class design extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);

        drawerLayout = findViewById(R.id.main);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);
        recyclerView = findViewById(R.id.recycler_view_rides);

        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        toolbar.setNavigationIcon(R.drawable.baseline_menu_24);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.optHome) {
                    Toast.makeText(design.this, "Home", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.optProfile) {
                    startActivity(new Intent(design.this, UserProfileActivity.class));
                    Toast.makeText(design.this, "Profile", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.optTerms) {
                    startActivity(new Intent(design.this, termcondi.class));
                    Toast.makeText(design.this, "Terms & Conditions", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.optShare) {
                    startActivity(new Intent(design.this, shareapp.class));
                    Toast.makeText(design.this, "Share with Friends", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.optFAQ) {
                    Toast.makeText(design.this, "FAQ about APP", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.optContactUs) {
                    startActivity(new Intent(design.this, contactus.class));
                    Toast.makeText(design.this, "Contact Us", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.optAbtus) {
                    startActivity(new Intent(design.this, aboutus.class));
                    Toast.makeText(design.this, "About Us", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(design.this, "Settings", Toast.LENGTH_SHORT).show();
                }

                drawerLayout.closeDrawer(GravityCompat.START);

                return true;
            }
        });

        TextView createRideTextView = findViewById(R.id.create_ride_textview);
        TextView joinRideTextView = findViewById(R.id.join_ride_textview);

        createRideTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(design.this, CreateRideActivity.class));
            }
        });

        joinRideTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(design.this, JoinRideActivity.class));
                recyclerView.setVisibility(View.VISIBLE); // Make RecyclerView visible when "Join Ride" is clicked
                // You can also populate the RecyclerView with data here if needed
            }
        });
    }

    public void onCreateRideClick(View view) {
        startActivity(new Intent(this, CreateRideActivity.class));
    }

    public void onJoinRideClick(View view) {
        recyclerView.setVisibility(View.VISIBLE); // Make RecyclerView visible when "Join Ride" is clicked
        // You can also populate the RecyclerView with data here if needed
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
