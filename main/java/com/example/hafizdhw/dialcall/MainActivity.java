package com.example.hafizdhw.dialcall;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnspb,btnptt,btnsqw;
    TextView tvSpongebob,tvPattrick,tvSquidward;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnspb = (Button) findViewById(R.id.btnspb);
        btnptt = (Button) findViewById(R.id.btnptt);
        btnsqw = (Button) findViewById(R.id.btnsqw);
        tvSpongebob = (TextView) findViewById(R.id.tvspb);
        tvPattrick = (TextView) findViewById(R.id.tvptt);
        tvSquidward = (TextView) findViewById(R.id.tvsqw);

        btnspb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numbspb = tvSpongebob.getText().toString();
                Uri nomorSpongebob = Uri.parse("tel:"+numbspb);
                Intent activitySpb = new Intent(Intent.ACTION_DIAL,nomorSpongebob);
                startActivity(activitySpb);
            }
        });

        btnptt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numbptt = tvPattrick.getText().toString();
                Uri nomorPattrick = Uri.parse("tel:"+numbptt);
                Intent activityPattrick = new Intent(Intent.ACTION_DIAL,nomorPattrick);
                startActivity(activityPattrick);
            }
        });

        btnsqw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numsqw = tvSquidward.getText().toString();
                Uri nomoSquidward = Uri.parse("tel:"+numsqw);
                Intent activitySquidward = new Intent(Intent.ACTION_DIAL,nomoSquidward);
                startActivity(activitySquidward);
            }
        });
    }
}
