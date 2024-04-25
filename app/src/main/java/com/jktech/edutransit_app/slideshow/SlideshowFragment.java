//package com.jktech.edutransit_app.slideshow;
//
//import android.os.Bundle;
//import android.text.TextUtils;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.fragment.app.Fragment;
//import androidx.navigation.Navigation;
//
//import com.example.ride_home.R;
//
//public class SlideshowFragment extends Fragment {
//
//    private EditText editTextUsername;
//    private EditText editTextPassword;
//
//    // Hardcoded admin credentials for demonstration purposes
//    private static final String ADMIN_USERNAME = "admin";
//    private static final String ADMIN_PASSWORD = "admin123";
//
//    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
//
//        // Initialize views
//        editTextUsername = root.findViewById(R.id.editTextUsername);
//        editTextPassword = root.findViewById(R.id.editTextPassword);
//        Button buttonLogin = root.findViewById(R.id.buttonLogin);
//
//        // Set click listener for login button
//        buttonLogin.setOnClickListener(v -> {
//            // Validate credentials
//            if (validateCredentials()) {
//                // Check if the entered credentials match the admin credentials
//                String username = editTextUsername.getText().toString().trim();
//                String password = editTextPassword.getText().toString().trim();
//                if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
//                    // Navigate to Admin Request Fragment
//                    Navigation.findNavController(v).navigate(R.id.action_nav_adminlogin_to_adminreq);
//                } else {
//                    // Display error message for invalid credentials
//                    Toast.makeText(requireContext(), "Invalid username or password", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        return root;
//    }
//
//    // Method to validate username and password fields
//    private boolean validateCredentials() {
//        String username = editTextUsername.getText().toString().trim();
//        String password = editTextPassword.getText().toString().trim();
//
//        // Check if username is empty
//        if (TextUtils.isEmpty(username)) {
//            editTextUsername.setError("Enter username");
//            editTextUsername.requestFocus();
//            return false;
//        }
//
//        // Check if password is empty
//        if (TextUtils.isEmpty(password)) {
//            editTextPassword.setError("Enter password");
//            editTextPassword.requestFocus();
//            return false;
//        }
//
//        return true;
//    }
//}
