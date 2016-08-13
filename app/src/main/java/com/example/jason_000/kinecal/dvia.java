package com.example.jason_000.kinecal;

/**
 * Created by jason_000 on 1/7/2016.
 */

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class dvia extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dvia);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#321255")));

        Button cal = (Button) findViewById(R.id.calculate);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                EditText d = (EditText) findViewById(R.id.editText);
                EditText vi = (EditText) findViewById(R.id.editText2);
                EditText a = (EditText) findViewById(R.id.editText3);
                TextView t = (TextView) findViewById(R.id.time);
                TextView vf = (TextView) findViewById(R.id.textView5);
                double displacement = Double.parseDouble(d.getText().toString());
                double initialVelocity = Double.parseDouble(vi.getText().toString());
                double acceleration = Double.parseDouble(a.getText().toString());
                double finalVelocity = Math.sqrt((Math.pow(initialVelocity,2))+(2*acceleration*displacement));
                double time = (finalVelocity-initialVelocity)/acceleration;
                t.setText("Time ="+Double.toString(time)+" s");
                vf.setText("Final Velocity is = "+Double.toString(finalVelocity)+" m/s");

            }
        });
    }
}
