//package com.jktech.edutransit_app.slideshow;
//
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;
//
//import com.example.ride_home.R;
//
//import java.util.ArrayList;
//
//public class Admin_Request_Fragment extends Fragment {
//
//    private ArrayAdapter<String> adapter;
//    private ArrayList<String> requests;
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View rootView = inflater.inflate(R.layout.admin_requests_fragment, container, false);
//
//        // Initialize ListView and adapter
//        ListView requestListView = rootView.findViewById(R.id.requestListView);
//        requests = new ArrayList<>();
//        adapter = new ArrayAdapter<>(requireContext(), R.layout.list_item_request, R.id.requestTextView, requests);
//        requestListView.setAdapter(adapter);
//
//        // Add some example requests for demonstration
//        addExampleRequests();
//
//        // Set click listeners for accept and reject buttons
//        requestListView.setOnItemClickListener((parent, view, position, id) -> {
//            // Do nothing upon clicking on a request item
//        });
//
//        return rootView;
//    }
//
//    private void addExampleRequests() {
//        // Add example requests to the list
//        requests.add("Request 1");
//        requests.add("Request 2");
//        requests.add("Request 3");
//        adapter.notifyDataSetChanged(); // Notify adapter about data change
//    }
//
//    // Button click listener for accept button
//    public void onAcceptClick(View view) {
//        int position = (int) view.getTag();
//        handleAcceptRequest(position);
//    }
//
//    // Button click listener for reject button
//    public void onRejectClick(View view) {
//        int position = (int) view.getTag();
//        handleRejectRequest(position);
//    }
//
//    private void handleAcceptRequest(int position) {
//        // Handle acceptance of the request at the specified position
//        String acceptedRequest = requests.get(position);
//        requests.remove(position); // Remove the request from the list
//        adapter.notifyDataSetChanged(); // Notify adapter about data change
//        showToast("Request \"" + acceptedRequest + "\" accepted.");
//    }
//
//    private void handleRejectRequest(int position) {
//        // Handle rejection of the request at the specified position
//        String rejectedRequest = requests.get(position);
//        requests.remove(position); // Remove the request from the list
//        adapter.notifyDataSetChanged(); // Notify adapter about data change
//        showToast("Request \"" + rejectedRequest + "\" rejected.");
//    }
//
//    private void showToast(String message) {
//        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show();
//    }
//}
