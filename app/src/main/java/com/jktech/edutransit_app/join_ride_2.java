package com.jktech.edutransit_app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class join_ride_2 extends AppCompatActivity {
    Button btnwhatsapp,btnmsg,btndial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_ride2);

        ImageView imgView = findViewById(R.id.image_view);
        TextView txtName = findViewById(R.id.text_name);
        TextView txtAddress = findViewById(R.id.text_address);
        btndial = findViewById(R.id.btndial);
        btnmsg = findViewById(R.id.btnmsg);
        btnwhatsapp  = findViewById(R.id.btnwhatsapp);

        // Receive the intent from RecyclerContactAdapter and update the views
        int imgId = getIntent().getIntExtra("img", -1); // Default value as -1 if no image provided
        String name = getIntent().getStringExtra("name");
        String address = getIntent().getStringExtra("address");

        // Update the ImageView and TextViews with the data
        if (imgId != -1) {
            imgView.setImageResource(imgId);
        }
        txtName.setText(name);
        txtAddress.setText(address);




        btndial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent idial = new Intent(Intent.ACTION_DIAL);
                idial.setData(Uri.parse("tel: +911234567890"));
                startActivity(idial);


            }
        });


        btnmsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent imsg = new Intent(Intent.ACTION_SENDTO);
                imsg.setData(Uri.parse("smsto:"+Uri.encode("+915555555555")));
                imsg.putExtra("sms_body"," Please solve this issue. ");
                startActivity(imsg);

            }
        });


        btnwhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String wpurl = "https://wa.me/+911234567890?text=Hello,I want to join a ride.";
                Intent iwp = new Intent(Intent.ACTION_VIEW);
                iwp.setData(Uri.parse(wpurl));
                startActivity(iwp);

            }
        });




    }



}