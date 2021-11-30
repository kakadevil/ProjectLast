package com.example.projectlast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class QR_Scan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IntentIntegrator intentIntegrator = new IntentIntegrator(QR_Scan.this);
        intentIntegrator.setPrompt("For flash use volume up key, use volume down key to turn off");
        //set beep
        intentIntegrator.setBeepEnabled(true);
        //locked orientation
        intentIntegrator.setOrientationLocked(true);
        //set capture activity
        intentIntegrator.setCaptureActivity(Capture.class);
        //initiate scan
        intentIntegrator.initiateScan();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        IntentResult intentResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        //check condition
        if(intentResult.getContents() != null){
            //When result content is not null
            //Initialize alert dialog
            Intent intent = new Intent(QR_Scan.this,Webb.class);
            intent.putExtra("key1" , intentResult.getContents());
            startActivity(intent);

        }else{
            //when result content is null
            //display toast
            Toast.makeText(getApplicationContext(),"oop... chua scan j ca",Toast.LENGTH_SHORT).show();
            onDestroy();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}