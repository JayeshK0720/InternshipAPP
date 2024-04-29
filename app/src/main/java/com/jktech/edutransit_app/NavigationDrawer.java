package com.jktech.edutransit_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

public class NavigationDrawer extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    androidx.appcompat.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigationdrawer);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationView);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer
        );
        drawerLayout.addDrawerListener(toggle);

        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id==R.id.optHome) {
                    // Handle Home action
                    Toast.makeText(NavigationDrawer.this, "Home", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.optProfile){
                    // Handle Profile action
                    startActivity(new Intent(NavigationDrawer.this, UserProfileActivity.class));
                    Toast.makeText(NavigationDrawer.this, "Profile", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.optTerms){
                    // Handle Terms and Conditions action
                    startActivity(new Intent(NavigationDrawer.this, termcondi.class));
                    Toast.makeText(NavigationDrawer.this, "Terms & Conditions", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.optShare){
                    // Handle Share with Friends action
                    startActivity(new Intent(NavigationDrawer.this, shareapp.class));
                    Toast.makeText(NavigationDrawer.this, "Share with Friends", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.optFAQ){
                    // Handle FAQ action
                    Toast.makeText(NavigationDrawer.this, "FAQ about APP", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.optContactUs){
                    // Handle Contact Us action
                    startActivity(new Intent(NavigationDrawer.this, contactus.class));
                    Toast.makeText(NavigationDrawer.this, "Contact Us", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.optAbtus){
                    // Handle About Us action
                    startActivity(new Intent(NavigationDrawer.this, aboutus.class));
                    Toast.makeText(NavigationDrawer.this, "About Us", Toast.LENGTH_SHORT).show();
                } else{
                    // Handle Settings action
                    Toast.makeText(NavigationDrawer.this, "Settings", Toast.LENGTH_SHORT).show();
                }

                drawerLayout.closeDrawer(GravityCompat.START);

                return false;
            }
        });
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
