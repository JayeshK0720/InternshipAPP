//package com.jktech.edutransit_app;
//
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;
//
//public class ContentMainFragment extends Fragment {
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View rootView = inflater.inflate(R.layout.fragment_content_main, container, false);
//
//        // Find the "Create Ride" button and set its click listener
//        Button createRideButton = rootView.findViewById(R.id.button_create);
//        createRideButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Replace current fragment with CreateRideFragment
//                getParentFragmentManager().beginTransaction()
//                        .replace(R.id.fragment_container, new CreateRideFragment())
//                        .addToBackStack(null)
//                        .commit();
//            }
//        });
//
//        // Find the "Join Ride" button and set its click listener
//        Button joinRideButton = rootView.findViewById(R.id.button_join);
//        joinRideButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Replace current fragment with JoinRideFragment
//                getParentFragmentManager().beginTransaction()
//                        .replace(R.id.fragment_container, new JoinRideFragment())
//                        .addToBackStack(null)
//                        .commit();
//            }
//        });
//
//        return rootView;
//    }
//}
