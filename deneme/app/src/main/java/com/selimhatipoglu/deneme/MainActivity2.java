package com.selimhatipoglu.deneme;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity2 extends AppCompatActivity {


    private FirebaseAuth Auth;
    TextView properties;
    araba araba1 = new BMW("BMW", 2, 2, 6);
    araba araba2 = new audi("Audi", 1,5,4);
    araba araba3 =new mercedes("Mercedes", 2, 2, 8);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Auth =FirebaseAuth.getInstance();
        properties=findViewById(R.id.textView);

    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.option_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.signout){

            Auth.signOut();

            Intent intentToMain =new Intent(MainActivity2.this,MainActivity.class);
            startActivity(intentToMain);
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    public void bmwClicked(View view) {

        properties.setText("Model: "+araba1.getModel()+" Kapı: "+araba1.getKapı()+" Motor: "+araba1.getMotor()+" Teker: "+araba1.getTeker());


    }

    public void mercedesClicked(View view) {

        properties.setText("Model: "+araba2.getModel()+" Kapı: "+araba2.getKapı()+" Motor: "+araba2.getMotor()+" Teker: "+araba2.getTeker());


    }

    public void audiClicked(View view) {

        properties.setText("Model: "+araba3.getModel()+" Kapı: "+araba3.getKapı()+" Motor: "+araba3.getMotor()+" Teker: "+araba3.getTeker());

    }
}