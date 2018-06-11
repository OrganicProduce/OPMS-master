package com.priyanka.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CustomerSignup extends AppCompatActivity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_signup);
        b=findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "We will Review your Request and Soon Contact you. \n Cheers", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(CustomerSignup.this, home.class));

            }
        });
    }
}
