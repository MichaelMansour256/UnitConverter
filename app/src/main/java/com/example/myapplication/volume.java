package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class volume extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volume);

        final Spinner volume_from =  (Spinner) findViewById(R.id.spinner_from);
        final Spinner volume_to =  (Spinner) findViewById(R.id.spinner_to);
        volume_to.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                volume2 volumefrom = new volume2();
                // Temperature2 tempto = new Temperature2();
                EditText volume_value = findViewById(R.id.editText);
                TextView res = findViewById(R.id.res);

                if (!(volume_value.getText().toString().equals(""))) {
                    String selectOption_from = volume_from.getSelectedItem().toString();
                    String selectOption_to = volume_to.getSelectedItem().toString();
                    if (selectOption_from.equals("cm3")) {
                        if (selectOption_to.equals("m3")) {
                            float leng = Float.parseFloat(volume_value.getText().toString());
                            volumefrom.setVol(leng);
                            String result = String.valueOf(volumefrom.cm_to_meter(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("km3")) {

                            float leng = Float.parseFloat(volume_value.getText().toString());
                            volumefrom.setVol(leng);
                            String result = String.valueOf(volumefrom.cm_to_kilo(leng));
                            res.setText(result);

                        }
                        else if (selectOption_to.equals("mm3")) {

                            float leng = Float.parseFloat(volume_value.getText().toString());
                            volumefrom.setVol(leng);
                            String result = String.valueOf(volumefrom.cm_to_mm(leng));
                            res.setText(result);

                        }

                    } else if (selectOption_from.equals("mm3")) {
                        if (selectOption_to.equals("cm3")) {
                            float leng = Float.parseFloat(volume_value.getText().toString());
                            volumefrom.setVol(leng);
                            String result = String.valueOf(volumefrom.mm_to_cm(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("m3")) {

                            float leng = Float.parseFloat(volume_value.getText().toString());
                            volumefrom.setVol(leng);
                            String result = String.valueOf(volumefrom.mm_to_meter(leng));
                            res.setText(result);

                        }
                        else if (selectOption_to.equals("km3")) {

                            float leng = Float.parseFloat(volume_value.getText().toString());
                            volumefrom.setVol(leng);
                            String result = String.valueOf(volumefrom.mm_to_kilo(leng));
                            res.setText(result);

                        }

                    } else if (selectOption_from.equals("m3")) {
                        if (selectOption_to.equals("cm3")) {
                            float leng = Float.parseFloat(volume_value.getText().toString());
                            volumefrom.setVol(leng);
                            String result = String.valueOf(volumefrom.meter_to_cm(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("km3")) {

                            float leng = Float.parseFloat(volume_value.getText().toString());
                            volumefrom.setVol(leng);
                            String result = String.valueOf(volumefrom.meter_to_kilo(leng));
                            res.setText(result);

                        }
                        else if (selectOption_to.equals("mm3")) {

                            float leng = Float.parseFloat(volume_value.getText().toString());
                            volumefrom.setVol(leng);
                            String result = String.valueOf(volumefrom.meter_to_mm(leng));
                            res.setText(result);

                        }

                    }
                    else if (selectOption_from.equals("km3")) {
                        if (selectOption_to.equals("cm3")) {
                            float leng = Float.parseFloat(volume_value.getText().toString());
                            volumefrom.setVol(leng);
                            String result = String.valueOf(volumefrom.kilo_to_cm(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("m3")) {

                            float leng = Float.parseFloat(volume_value.getText().toString());
                            volumefrom.setVol(leng);
                            String result = String.valueOf(volumefrom.kilo_to_meter(leng));
                            res.setText(result);

                        } else if (selectOption_to.equals("mm3")) {

                            float leng = Float.parseFloat(volume_value.getText().toString());
                            volumefrom.setVol(leng);
                            String result = String.valueOf(volumefrom.kilo_to_mm(leng));
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