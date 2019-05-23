package com.example.fisherman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class DiaplayTapOnMeActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diaplay_tap_on_me);

        editText = (EditText) findViewById(R.id.editText);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String seq = s.toString();
                if(seq.length() > 4 && seq.matches("[0-9]+")) {
                    Intent intent = new Intent(getBaseContext(), MainActivity.class );
                    intent.putExtra("digits", seq);
                    startActivity(intent);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}
