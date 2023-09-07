package com.example.voting_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tv_coke_count;
    TextView tv_pepsi_count;
    Button btn_coke_vote;
    Button  btn_pepsi_vote ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv_coke_count = findViewById(R.id.tv_coke_count);
        tv_pepsi_count = findViewById(R.id.tv_pepsi_count);
        btn_coke_vote = findViewById(R.id.btn_coke_vote);
        btn_pepsi_vote= findViewById(R.id.btn_pepsi_vote);


    }


    public void  onCokeClicked(View v){
        String cokeCount = tv_coke_count.getText().toString().trim();
        int count = Integer.parseInt(cokeCount);
        count++;
        tv_coke_count.setText(String.valueOf(count));

    }

    public  void onPepsiClicked(View v){

        String pepsiCount = tv_pepsi_count.getText().toString().trim();
         int count = Integer.parseInt(pepsiCount);
         count++;

         tv_pepsi_count.setText(String.valueOf(count));

    }
}