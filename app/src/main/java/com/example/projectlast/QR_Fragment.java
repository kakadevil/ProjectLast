package com.example.projectlast;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class QR_Fragment extends Fragment {
    Button btScan;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_qr_scan, container, false);
        btScan =  v.findViewById(R.id.bt_scan);
        btScan.setOnClickListener(view -> startActivity(new Intent (getActivity(),QR_Scan.class)));
        return v;
    }
}