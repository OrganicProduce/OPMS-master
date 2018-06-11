package com.priyanka.myapplication;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class home extends AppCompatActivity {
    EditText new_usrname,new_pass;
    ProgressDialog progressDialog;
    private FirebaseAuth mauth;
    AlertDialog.Builder builder=null;
    AlertDialog dialog=null;
    private FirebaseAuth.AuthStateListener authStateListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        progressDialog=new ProgressDialog(this);
        mauth= FirebaseAuth.getInstance();
        authStateListener=new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if(firebaseAuth.getCurrentUser()!=null)
                {
                    Toast.makeText(home.this, "Admin Welcome", Toast.LENGTH_LONG).show();
                 //   log.setVisibility(View.GONE);
                }
            }
        };
        mauth.addAuthStateListener(authStateListener);
        Button button=findViewById(R.id.b);
        Button geyzing=findViewById(R.id.c);
        Button namhci=findViewById(R.id.d);
        Button mangan=findViewById(R.id.e);
       // log=findViewById(R.id.log);
      /*  log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //AddUser();
            }
        });*/

        geyzing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(home.this, Vegetable.class);

                startActivity(i);
            }
        });        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Intent i = new Intent(MainActivity.this, Vegetable.class);
                //startActivity(i);
            }
        });
        namhci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent i = new Intent(MainActivity.this, Namchi.class);
               // startActivity(i);
            }
        });
        mangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent i = new Intent(MainActivity.this, Mangan.class);
              //  startActivity(i);
            }
        });
    }


    /*public void AddUser()
    {
        LayoutInflater linf=LayoutInflater.from(MainActivity.this);
        View inflator=linf.inflate(R.layout.update,null);
        builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Hey, Admin Login to Gain Access...");
        builder.setView(inflator);
        new_usrname=inflator.findViewById(R.id.new_usrname);
        new_pass=inflator.findViewById(R.id.new_pass);
        builder.setPositiveButton("Cancel",null);
        builder.setNegativeButton("Login",new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog,int which)
            {

            }
        });
        dialog=builder.create();
        dialog.show();
        dialog.getButton(AlertDialog.BUTTON_NEGATIVE).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getusername=new_usrname.getText().toString().trim();
                String getuserpas=new_pass.getText().toString().trim();
                if (new_usrname.getText().toString().trim().equalsIgnoreCase("")) {
                    new_usrname.setError("This field can not be blank");}
                if (new_pass.getText().toString().trim().equalsIgnoreCase("")) {
                    new_pass.setError("This field can not be blank");}
                if(!TextUtils.isEmpty(getusername)&&!TextUtils.isEmpty(getuserpas)){
                    progressDialog.setMessage("Please Wait...");
                    progressDialog.show();
                    mauth.signInWithEmailAndPassword(getusername,getuserpas).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful())

                            {progressDialog.dismiss();

                                Toast.makeText(MainActivity.this, "Logged In...", Toast.LENGTH_LONG).show();

                                log.setVisibility(View.GONE);
                            }
                            else
                            {
                                Toast.makeText(MainActivity.this, "Something went wrong...", Toast.LENGTH_LONG).show();

                            }
                        }
                    });
                }
            }
        });
        //builder.show();
    }*/
}



