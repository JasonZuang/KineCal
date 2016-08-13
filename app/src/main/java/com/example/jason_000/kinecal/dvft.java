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

public class dvft extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dvft);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#321255")));

        Button cal = (Button) findViewById(R.id.calculate);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                EditText d = (EditText) findViewById(R.id.editText);
                EditText vf = (EditText) findViewById(R.id.editText2);
                EditText t = (EditText) findViewById(R.id.editText3);
                TextView vi = (TextView) findViewById(R.id.time);
                TextView a = (TextView) findViewById(R.id.textView5);
                double displacement = Double.parseDouble(d.getText().toString());
                double finalVelocity = Double.parseDouble(vf.getText().toString());
                double time = Double.parseDouble(t.getText().toString());
                double initalVelocity = ((2*displacement)/(time))-finalVelocity;
                double acceleration = (finalVelocity-initalVelocity)/time;;
                vi.setText("Inital Velocity ="+Double.toString(initalVelocity)+" m/s");
                a.setText("Acceleration = "+Double.toString(acceleration)+" m/s/s");

            }
        });
    }
}
