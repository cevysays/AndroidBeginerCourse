package com.cevysays.androidbeginercourse;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

// Activity
// ActionBarActivity -> secara default sudah memiliki actionbar
// 22.2 -> AppCompatActivity

public class MainActivity extends AppCompatActivity {


    // method itu adalah fungsi
    // fungsi ada yang mengembalikan nilai dan ada yang tidak mengembalikan nilai

    Button btnCall;
    EditText inputPhoneNumber;
    TextView textPhone;
    TextView resultPhone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize
        // agar bisa digunakan view harus di TypeCasring sesuai dengan objecnya
        btnCall = (Button) findViewById(R.id.call);
        inputPhoneNumber = (EditText) findViewById(R.id.inputPhoneNumber);
        textPhone = (TextView) findViewById(R.id.textPhone);
        resultPhone = (TextView) findViewById(R.id.textPhone);

        // event Listener
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(inputPhoneNumber.getText().toString())) {

                    //if numbernya kosong
                    Toast.makeText(MainActivity.this, "Phone number field require", Toast.LENGTH_SHORT).show();
                }else if(inputPhoneNumber.getText().toString().equals("147")){

                    Toast.makeText(MainActivity.this, "Laporan Speedy Rusak", Toast.LENGTH_SHORT).show();
                }else {
                    // untuk mengambil phone number yang berada di editText
                    String phoneNumber = inputPhoneNumber.getText().toString();

                    // set phone number to textView
                    resultPhone.setText(phoneNumber);
                }




            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
