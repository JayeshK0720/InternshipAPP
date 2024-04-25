package com.jktech.edutransit_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class navigationdrawer  extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    androidx.appcompat.widget.Toolbar toolbar;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigationdrawer);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationView);
        toolbar = findViewById(R.id.toolbar);

        // Step 1

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
//                    loadFragment(new AFragment());
                    Toast.makeText(navigationdrawer.this, "Home", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.optProfile){
                    startActivity(new Intent(navigationdrawer.this, UserProfileActivity.class));
                    Toast.makeText(navigationdrawer.this, "Profile", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.optTerms){
                    startActivity(new Intent(navigationdrawer.this, termcondi.class));
                    Toast.makeText(navigationdrawer.this, "Terms & Conditions", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.optShare){
                    startActivity(new Intent(navigationdrawer.this, shareapp.class));
                    Toast.makeText(navigationdrawer.this, "Share with Friends", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.optFAQ){
                    Toast.makeText(navigationdrawer.this, "FAQ about APP", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.optContactUs){
                    startActivity(new Intent(navigationdrawer.this, contactus.class));
                    Toast.makeText(navigationdrawer.this, "Contact Us", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.optAbtus){
                    startActivity(new Intent(navigationdrawer.this, aboutus.class));
                    Toast.makeText(navigationdrawer.this, "About Us", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(navigationdrawer.this, "Settings", Toast.LENGTH_SHORT).show();
                }

                drawerLayout.closeDrawer(GravityCompat.START);

                return false;
            }
        });
    }



    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        } else{
            super.onBackPressed();
        }
    }
    private void loadFragment(Fragment fragment) {

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.add(R.id.container, fragment);
        ft.commit();

    }
}