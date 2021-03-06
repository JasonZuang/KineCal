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

public class vivft
        extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vivft);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#321255")));

        Button cal = (Button) findViewById(R.id.calculate);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                EditText d = (EditText) findViewById(R.id.editText);
                EditText vf = (EditText) findViewById(R.id.editText2);
                EditText a = (EditText) findViewById(R.id.editText3);
                TextView vi = (TextView) findViewById(R.id.time);
                TextView t = (TextView) findViewById(R.id.textView5);
                double displacement = Double.parseDouble(d.getText().toString());
                double finalVelocity = Double.parseDouble(vf.getText().toString());
                double acceleration = Double.parseDouble(a.getText().toString());
                double initalVelocity = Math.sqrt((Math.pow(finalVelocity,2)-(2*acceleration*displacement)));
                double time = (2*displacement)/(initalVelocity+finalVelocity);
                vi.setText("Inital Velocity ="+Double.toString(initalVelocity)+" m/s");
                t.setText("Acceleration = "+Double.toString(time)+" m/s/s");

            }
        });
    }
}