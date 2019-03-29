package com.example.day2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtUseremail;
    private EditText edtPassword;
    private Button btnLogin;
    private  Button btnClear;
    private TextView txtMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtUseremail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        txtMsg = findViewById(R.id.lblMessage);

        btnLogin = findViewById(R.id.btnLogin);
        btnClear = findViewById(R.id.btnClear);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = edtUseremail.getText().toString();
                String password = edtPassword.getText().toString();

                if (email.equals("gur") && password.equals("123")){

                    txtMsg.setText("login succesfully");
                    //txtMsg.setTextColor();

                }else{
                    txtMsg.setText("Username and password is wrong");
                }
                Toast.makeText(MainActivity.this,email+ " " + password,Toast.LENGTH_SHORT).show();
                //Toast.makeText(getApplicationContext(),email,Toast.LENGTH_SHORT).show();

            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtUseremail.setText("");
                edtPassword.setText("");
                txtMsg.setText("Enter Message");
            }
        });
    }
}
