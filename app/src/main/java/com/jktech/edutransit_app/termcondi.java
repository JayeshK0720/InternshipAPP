package com.jktech.edutransit_app;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class termcondi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.termsandcon);

        // Find the toolbar view
        Toolbar toolbar = findViewById(R.id.my_toolbar);

        // Set the toolbar as the app bar for the activity
        setSupportActionBar(toolbar);

        // You can further customize the toolbar here, such as setting a title or adding menu items
    }
}
