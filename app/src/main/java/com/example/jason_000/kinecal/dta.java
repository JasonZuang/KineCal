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

public class dta
        extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dta);
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
                double time = Double.parseDouble(vf.getText().toString());
                double acceleration = Double.parseDouble(a.getText().toString());
                double initalVelocity = (displacement-(0.5*acceleration*(Math.pow(time,2))))/time;
                double finalVelocity = ((2*displacement)/time)-initalVelocity;
                vi.setText("Inital Velocity ="+Double.toString(initalVelocity)+" m/s");
                t.setText("Final Velocity= "+Double.toString(finalVelocity)+" m/s");

            }
        });
    }
}