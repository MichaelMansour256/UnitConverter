package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class speed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speed);
        final Spinner speed_from =  (Spinner) findViewById(R.id.spinner_from);
        final Spinner speed_to =  (Spinner) findViewById(R.id.spinner_to);
        speed_to.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                speed2 speedfrom = new speed2();
                // Temperature2 tempto = new Temperature2();
                EditText Speed_value = findViewById(R.id.editText);
                TextView res = findViewById(R.id.res);

                if (!(Speed_value.getText().toString().equals(""))) {
                    String selectOption_from = speed_from.getSelectedItem().toString();
                    String selectOption_to = speed_to.getSelectedItem().toString();
                    if (selectOption_from.equals("mps")) {
                        if (selectOption_to.equals("mph")) {
                            float leng = Float.parseFloat(Speed_value.getText().toString());
                            speedfrom.setSped(leng);
                            String result = String.valueOf(speedfrom.mps_mph(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("kmph")) {

                            float leng = Float.parseFloat(Speed_value.getText().toString());
                            speedfrom.setSped(leng);
                            String result = String.valueOf(speedfrom.mps_kmph(leng));
                            res.setText(result);

                        }
                        else if (selectOption_to.equals("fps")) {

                            float leng = Float.parseFloat(Speed_value.getText().toString());
                            speedfrom.setSped(leng);
                            String result = String.valueOf(speedfrom.mps_fps(leng));
                            res.setText(result);

                        }

                    } else if (selectOption_from.equals("mph")) {
                        if (selectOption_to.equals("mps")) {
                            float leng = Float.parseFloat(Speed_value.getText().toString());
                            speedfrom.setSped(leng);
                            String result = String.valueOf(speedfrom.mph_mps(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("fps")) {

                            float leng = Float.parseFloat(Speed_value.getText().toString());
                            speedfrom.setSped(leng);
                            String result = String.valueOf(speedfrom.mph_fps(leng));
                            res.setText(result);

                        }
                        else if (selectOption_to.equals("kmph")) {

                            float leng = Float.parseFloat(Speed_value.getText().toString());
                            speedfrom.setSped(leng);
                            String result = String.valueOf(speedfrom.mph_kmph(leng));
                            res.setText(result);

                        }

                    } else if (selectOption_from.equals("fps")) {
                        if (selectOption_to.equals("mps")) {
                            float leng = Float.parseFloat(Speed_value.getText().toString());
                            speedfrom.setSped(leng);
                            String result = String.valueOf(speedfrom.fps_mps(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("kmph")) {

                            float leng = Float.parseFloat(Speed_value.getText().toString());
                            speedfrom.setSped(leng);
                            String result = String.valueOf(speedfrom.fps_kmph(leng));
                            res.setText(result);

                        }
                        else if (selectOption_to.equals("mph")) {

                            float leng = Float.parseFloat(Speed_value.getText().toString());
                            speedfrom.setSped(leng);
                            String result = String.valueOf(speedfrom.fps_mph(leng));
                            res.setText(result);

                        }

                    }
                    else if (selectOption_from.equals("kmph")) {
                        if (selectOption_to.equals("mps")) {
                            float leng = Float.parseFloat(Speed_value.getText().toString());
                            speedfrom.setSped(leng);
                            String result = String.valueOf(speedfrom.kmph_mps(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("mph")) {

                            float leng = Float.parseFloat(Speed_value.getText().toString());
                            speedfrom.setSped(leng);
                            String result = String.valueOf(speedfrom.kmph_mph(leng));
                            res.setText(result);

                        } else if (selectOption_to.equals("fps")) {

                            float leng = Float.parseFloat(Speed_value.getText().toString());
                            speedfrom.setSped(leng);
                            String result = String.valueOf(speedfrom.kmph_fps(leng));
                            res.setText(result);

                        }
                    }


                } else {
                    Toast.makeText(getApplicationContext(), "enter valid value", Toast.LENGTH_LONG);
                }

            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}