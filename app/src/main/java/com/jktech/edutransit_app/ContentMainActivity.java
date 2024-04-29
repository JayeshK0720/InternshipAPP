package com.jktech.edutransit_app;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.jktech.edutransit_app.ContentMainFragment;

public class ContentMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new ContentMainFragment())
                    .commit();
        }
    }
}
