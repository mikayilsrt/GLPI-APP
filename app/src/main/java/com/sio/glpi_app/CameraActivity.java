package com.sio.glpi_app;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.zxing.Result;

import java.util.Date;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class CameraActivity extends AppCompatActivity implements ZXingScannerView.ResultHandler {

    private ZXingScannerView cammera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        cammera = new ZXingScannerView(this);
        setContentView(cammera);
    }
    @Override
    public void onResume() {
        super.onResume();
        cammera.setResultHandler(this); // Register ourselves as a handler for scan results.
        cammera.startCamera();          // Start camera on resume
    }

    @Override
    public void onPause() {
        super.onPause();
        cammera.stopCamera();           // Stop camera on pause
    }

    @Override
    public void handleResult(Result rawResult) {
        // Do something with the result here
        // Log.v(TAG, rawResult.getText()); // Prints scan results
        // Log.v(TAG, rawResult.getBarcodeFormat().toString()); // Prints the scan format (qrcode, pdf417 etc.)

        // If you would like to resume scanning, call this method below:
        cammera.resumeCameraPreview(this);

        AlertDialog.Builder builder1 = new AlertDialog.Builder(this );
        builder1.setMessage(rawResult.getText());
        AlertDialog alert11 = builder1.create();
        alert11.show();

        long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        Reception uneReception = new Reception(1, date, rawResult.getText(), "null000");
    }
}
