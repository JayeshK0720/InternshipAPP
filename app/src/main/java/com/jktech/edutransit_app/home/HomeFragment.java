package com.jktech.edutransit_app.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.NavController;


import com.airbnb.lottie.LottieAnimationView;
import com.jktech.edutransit_app.R;

public class HomeFragment extends Fragment {

    private LottieAnimationView laview;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        Button buttonFragmentA = root.findViewById(R.id.button_fragment_a);
        Button buttonFragmentB = root.findViewById(R.id.button_fragment_b);

        buttonFragmentA.setOnClickListener(v -> {
            // Navigate to FragmentA using NavController
            Navigation.findNavController(v).navigate(R.id.action_nav_home_to_fragmentA);
        });

        buttonFragmentB.setOnClickListener(v -> {
            // Navigate to FragmentB using NavController
            Navigation.findNavController(v).navigate(R.id.action_nav_home_to_fragmentB);
        });


        return root;
    }

}
