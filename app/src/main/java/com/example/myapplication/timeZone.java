package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class timeZone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timezone);

        final Spinner time_from =  (Spinner) findViewById(R.id.spinner_from);
        final Spinner time_to =  (Spinner) findViewById(R.id.spinner_to);
        time_to.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                timeZone2 timefrom = new timeZone2();
                // Temperature2 tempto = new Temperature2();
                EditText Weight_value = findViewById(R.id.editText);
                TextView res = findViewById(R.id.res);

                if (!(Weight_value.getText().toString().equals(""))) {
                    String selectOption_from = time_from.getSelectedItem().toString();
                    String selectOption_to = time_to.getSelectedItem().toString();
                    if (selectOption_from.equals("cairo")) {
                        if (selectOption_to.equals("mexico")) {
                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            timefrom.setTim(leng);
                            String result = String.valueOf(timefrom.egy_to_mexico(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("riyadh")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            timefrom.setTim(leng);
                            String result = String.valueOf(timefrom.egy_to_suadia(leng));
                            res.setText(result);

                        }
                        else if (selectOption_to.equals("tokyo")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            timefrom.setTim(leng);
                            String result = String.valueOf(timefrom.egy_to_tokyo(leng));
                            res.setText(result);

                        }

                    } else if (selectOption_from.equals("riyadh")) {
                        if (selectOption_to.equals("cairo")) {
                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            timefrom.setTim(leng);
                            String result = String.valueOf(timefrom.suadia_to_egy(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("mexico")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            timefrom.setTim(leng);
                            String result = String.valueOf(timefrom.sauida_to_mixico(leng));
                            res.setText(result);

                        }
                        else if (selectOption_to.equals("tokyo")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            timefrom.setTim(leng);
                            String result = String.valueOf(timefrom.sauida_to_tokyo(leng));
                            res.setText(result);

                        }

                    } else if (selectOption_from.equals("mexico")) {
                        if (selectOption_to.equals("riyadh")) {
                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            timefrom.setTim(leng);
                            String result = String.valueOf(timefrom.mexico_to_saudia(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("cairo")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            timefrom.setTim(leng);
                            String result = String.valueOf(timefrom.mexico_to_egy(leng));
                            res.setText(result);

                        }
                        else if (selectOption_to.equals("tokyo")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            timefrom.setTim(leng);
                            String result = String.valueOf(timefrom.mexico_to_tokyo(leng));
                            res.setText(result);

                        }

                    }
                    else if (selectOption_from.equals("tokyo")) {
                        if (selectOption_to.equals("riyadh")) {
                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            timefrom.setTim(leng);
                            String result = String.valueOf(timefrom.tokyo_to_saudia(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("cairo")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            timefrom.setTim(leng);
                            String result = String.valueOf(timefrom.tokyo_to_egy(leng));
                            res.setText(result);

                        } else if (selectOption_to.equals("mexico")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            timefrom.setTim(leng);
                            String result = String.valueOf(timefrom.tokyo_to_mixico(leng));
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