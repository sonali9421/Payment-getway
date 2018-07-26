package com.kiaora.paymentgetwayapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kiaora.paypallibrary.PaypalActivity;
//import com.kiaora.payumonylibrary.PayuMoneyActivity;
import com.kiaora.rezorlibrary.RazorActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void payuClick(View view) {
     /*   Intent intent = new Intent(MainActivity.this, PayuMoneyActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);*/
    }

    public void paypalClick(View view) {
        Intent intent = new Intent(MainActivity.this, PaypalActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
    }
    public void razorClick(View view) {
        Intent intent = new Intent(MainActivity.this, RazorActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
    }
}
