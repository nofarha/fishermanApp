package com.example.fisherman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent2= getIntent();
        Bundle b = intent2.getExtras();
        TextView textView = (TextView) findViewById(R.id.TapOnMeTXTV);

        if(b!=null)
        {
            String digits =(String) b.get("digits");
            textView.setText("you have entered:" + digits);
        }


    }

            /** Called when the user taps the Send button */
        public void sendMessage(View view) {
            Intent intent = new Intent(this, DiaplayGoFishActivity.class);
            startActivity(intent);
        }

        public void TapOnMe(View view) {
        Intent intent = new Intent(this, DiaplayTapOnMeActivity.class);
        startActivity(intent);
    }


}
