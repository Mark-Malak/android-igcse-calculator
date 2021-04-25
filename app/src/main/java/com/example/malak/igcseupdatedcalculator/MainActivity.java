package com.example.malak.igcseupdatedcalculator;

import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.math.RoundingMode;


import static java.lang.Math.round;

public class MainActivity extends AppCompatActivity {






    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }


    Button mbutt;
    // progress text view

    TextView total;

    //this is it
    TextView progtext1;
    TextView progtext2;
    TextView progtext3;
    TextView progtext4;
    TextView progtext5;
    TextView progtext6;
    TextView progtext7;
    TextView progtext8;
    TextView progtext9;
    TextView progtext10;
    TextView progtext11;
    TextView progtext12;
    TextView progtext13;




    //seek bar
    SeekBar prognum1 ;
    SeekBar prognum2 ;
    SeekBar prognum3 ;
    SeekBar prognum4 ;
    SeekBar prognum5 ;
    SeekBar prognum6 ;
    SeekBar prognum7 ;
    SeekBar prognum8 ;
    SeekBar prognum9 ;
    SeekBar prognum10 ;
    SeekBar prognum11 ;
    SeekBar prognum12 ;
    SeekBar prognum13 ;
    CheckBox chk ;


    //the double

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://tansik.egypt.gov.eg/application/Certificates/Mo3adla/Dalel/5.htm" ));
                startActivity(intent);


                // User chose the "Settings" item, show the app settings UI...
                return true;

            case R.id.action_favorite:
                // User chose the "Favorite" action, mark the current item
                // as a favorite...
                AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                dlgAlert.setMessage("*LONG CLICK ON CALCULATE FOR GOVERNMENT SCORE*" +
                        "we caclulate the grade according to the tansik 2018/2019 rules where  : \n" +
                        "A* = 100% , A = 95% , B = 85% ,C = 70% & D=60% and then divide over their no., for more info visit ig.academy or tansik website \n" +
                        "for the factor we multiply the AS by 1.5 and A2/AL by 2 factor\n" +
                        "*THIS CALCULATOR IS MADE BY AND FOR IGCSE SARCASM SOCIETY AND IG ACADEMY AND WAS MADE BY MARK MALAK*" +
                        "v1.0");
                dlgAlert.setTitle("How is the score calculated ? ");
                dlgAlert.setPositiveButton("OK", null);
                dlgAlert.setCancelable(true);
                dlgAlert.create().show();
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }
    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_starter);
        //action bar





        //addding action bar
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
//creating fields
        mbutt = findViewById(R.id.mbutt);
        total = findViewById(R.id.textView);
        prognum1 = findViewById(R.id.seekBar1);
        prognum2 = findViewById(R.id.seekBar2);
        prognum3 = findViewById(R.id.seekBar3);
        prognum4 = findViewById(R.id.seekBar4);
        prognum5 = findViewById(R.id.seekBar5);
        prognum6 = findViewById(R.id.seekBar6);
        prognum7 = findViewById(R.id.seekBar7);
        prognum8 = findViewById(R.id.seekBar8);
        prognum9 = findViewById(R.id.seekBar9);
        prognum10 = findViewById(R.id.seekBar10);
        prognum11= findViewById(R.id.seekBar11);
        prognum12 = findViewById(R.id.seekBar12);
        prognum13 = findViewById(R.id.seekBar13);


        // this is for text
        progtext1 = findViewById(R.id.prt1);
        progtext2 = findViewById(R.id.prt2);
        progtext3 = findViewById(R.id.prt3);
        progtext4 = findViewById(R.id.prt4);
        progtext5 = findViewById(R.id.prt5);
        progtext6 = findViewById(R.id.prt6);
        progtext7 = findViewById(R.id.prt7);
        progtext8 = findViewById(R.id.prt8);
        progtext9 = findViewById(R.id.prt9);
        progtext10 = findViewById(R.id.prt10);
        progtext11 = findViewById(R.id.prt11);
        progtext12 = findViewById(R.id.prt12);
        progtext13 = findViewById(R.id.prt13);
        chk = findViewById(R.id.checkBox);









        // this for setting the text
        prognum1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                progtext1.setText(String.valueOf(progress));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        prognum2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                progtext2.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

        prognum3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                progtext3.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

        prognum4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                progtext4.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

        prognum5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                progtext5.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

        prognum6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                progtext6.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

        prognum7.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                progtext7.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

        prognum8.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                progtext8.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

        prognum9.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                progtext9.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

        prognum10.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                progtext10.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

        prognum11.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                progtext11.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

        prognum12.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                progtext12.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });
        prognum13.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                progtext13.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });








        mbutt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View n) {


                //we will try to catch any exception that may happen here so we avoid app crashing
                String perc = "%";
                try {

                    //When the button is clicked, call the calculate method.
                    if (chk.isChecked()){
                        calculate2();
                    }
                    else {
                        calculate();
                    }
                } catch (Exception ex) {
                    System.out.println("u should input values to calculate!");
                    Context context = getApplicationContext();
                    CharSequence text = "Please enter valid values !";
                    int duration = Toast.LENGTH_SHORT;


                    Toast toast = Toast.makeText(context, text, duration);
                    toast.setGravity(Gravity.TOP | Gravity.LEFT, 250, 1200);
                    toast.show();
                    total.setText("0" + perc );

                }
            }
        });
        mbutt.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                //we will try to catch any exception that may happen here so we avoid app crashing
                String gov = "/410";
                try {

                    //When the button is clicked, call the calculate method.
                    if (chk.isChecked()){
                        calculate4();

                    }
                    else {
                        calculate3();
                    }
                } catch (Exception ex) {
                    System.out.println("u should input values to calculate!");
                    Context context = getApplicationContext();
                    CharSequence text = "Please enter valid values !";
                    int duration = Toast.LENGTH_SHORT;


                    Toast toast = Toast.makeText(context, text, duration);
                    toast.setGravity(Gravity.TOP | Gravity.LEFT, 250, 1200);
                    toast.show();
                    total.setText("0" + gov );

                }


                // TODO Auto-generated method stub
                return true;
            }
        });

    }




    //This is the calculating methods :

    public void calculate(){
        //get entered texts from the edittexts,and convert to integers.
        Double value1 = Double.parseDouble(progtext1.getText().toString());
        Double value2 = Double.parseDouble(progtext2.getText().toString());
        Double value3 = Double.parseDouble(progtext3.getText().toString());
        Double value4 = Double.parseDouble(progtext4.getText().toString());
        Double value5 = Double.parseDouble(progtext5.getText().toString());
        Double value6 = Double.parseDouble(progtext6.getText().toString());
        Double value7 = Double.parseDouble(progtext7.getText().toString());
        Double value8 = Double.parseDouble(progtext8.getText().toString());
        Double value9 = Double.parseDouble(progtext9.getText().toString());
        Double value10 = Double.parseDouble(progtext10.getText().toString());
        Double value11 = Double.parseDouble(progtext11.getText().toString());
        Double value12 = Double.parseDouble(progtext12.getText().toString());
        Double value13 = Double.parseDouble(progtext13.getText().toString());
        Double m  = value1 + value2 +value3 + value4 +value5 + value6+  value7 + value8  +value9 + value10 +value11 + value12 + value13;


        /*
        Double num = value1+ value2 +value3 + value4 +value5 + value6+  value7 + value8  +value9+ value10 +value11 + value12 ;
        */
        //do the calculation

        Double calculatedValue = ((value1*100 + value2*95 +value3*85 + value4*70 +value5*95 + value6*85+  value7*70 + value8*60  +value9*100 + value10*95 +value11*85 + value12*70 +value13*60) /m)   ;
        calculatedValue = round(calculatedValue, 2 );
        //set the value to the textview, to display on screen.
        String perc = "%";

        total.setText(calculatedValue.toString()+perc );

    }

    public void calculate2(){
        //get entered texts from the edittexts,and convert to integers.
        Double value1 = Double.parseDouble(progtext1.getText().toString());
        Double value2 = Double.parseDouble(progtext2.getText().toString());
        Double value3 = Double.parseDouble(progtext3.getText().toString());
        Double value4 = Double.parseDouble(progtext4.getText().toString());

        Double value5 = Double.parseDouble(progtext5.getText().toString());
        Double value6 = Double.parseDouble(progtext6.getText().toString());
        Double value7 = Double.parseDouble(progtext7.getText().toString());
        Double value8 = Double.parseDouble(progtext8.getText().toString());

        Double value9 = Double.parseDouble(progtext9.getText().toString());
        Double value10 = Double.parseDouble(progtext10.getText().toString());
        Double value11 = Double.parseDouble(progtext11.getText().toString());
        Double value12 = Double.parseDouble(progtext12.getText().toString());
        Double value13 = Double.parseDouble(progtext13.getText().toString());
        Double m  = value1 + value2 +value3 + value4 +value5 + value6+  value7 + value8  +value9 + value10 +value11 + value12 + value13;


        /*
        Double num = value1+ value2 +value3 + value4 +value5 + value6+  value7 + value8  +value9+ value10 +value11 + value12 ;
        */
        //do the calculation

        Double calculatedValue = ((value1*100 + value2*95 +value3*85 + value4*70 +value5*95*1.5 + value6*85*1.5+  value7*70*1.5 + value8*60*1.5  +value9*100*2 + value10*95*2 +value11*85*2 + value12*70*2+value13*60*2) /m)   ;
        calculatedValue = round(calculatedValue, 2 );
        //set the value to the textview, to display on screen.
        String perc = "%";

        total.setText(calculatedValue.toString()+perc );

    }
    public void calculate3(){
        //get entered texts from the edittexts,and convert to integers.
        Double value1 = Double.parseDouble(progtext1.getText().toString());
        Double value2 = Double.parseDouble(progtext2.getText().toString());
        Double value3 = Double.parseDouble(progtext3.getText().toString());
        Double value4 = Double.parseDouble(progtext4.getText().toString());
        Double value5 = Double.parseDouble(progtext5.getText().toString());
        Double value6 = Double.parseDouble(progtext6.getText().toString());
        Double value7 = Double.parseDouble(progtext7.getText().toString());
        Double value8 = Double.parseDouble(progtext8.getText().toString());
        Double value9 = Double.parseDouble(progtext9.getText().toString());
        Double value10 = Double.parseDouble(progtext10.getText().toString());
        Double value11 = Double.parseDouble(progtext11.getText().toString());
        Double value12 = Double.parseDouble(progtext12.getText().toString());
        Double value13 = Double.parseDouble(progtext13.getText().toString());
        Double m  = value1 + value2 +value3 + value4 +value5 + value6+  value7 + value8  +value9 + value10 +value11 + value12 + value13;


        /*
        Double num = value1+ value2 +value3 + value4 +value5 + value6+  value7 + value8  +value9+ value10 +value11 + value12 ;
        */
        //do the calculation

        Double calculatedValue = ((value1*100 + value2*95 +value3*85 + value4*70 +value5*95 + value6*85+  value7*70 + value8*60  +value9*100 + value10*95 +value11*85 + value12*70 +value13*60) /m)   ;
        calculatedValue = round(calculatedValue*4.10, 2 );
        //set the value to the textview, to display on screen.
        String gov = "/410";

        total.setText(calculatedValue.toString()+gov );

    }
    public void calculate4(){
        //get entered texts from the edittexts,and convert to integers.
        Double value1 = Double.parseDouble(progtext1.getText().toString());
        Double value2 = Double.parseDouble(progtext2.getText().toString());
        Double value3 = Double.parseDouble(progtext3.getText().toString());
        Double value4 = Double.parseDouble(progtext4.getText().toString());

        Double value5 = Double.parseDouble(progtext5.getText().toString());
        Double value6 = Double.parseDouble(progtext6.getText().toString());
        Double value7 = Double.parseDouble(progtext7.getText().toString());
        Double value8 = Double.parseDouble(progtext8.getText().toString());

        Double value9 = Double.parseDouble(progtext9.getText().toString());
        Double value10 = Double.parseDouble(progtext10.getText().toString());
        Double value11 = Double.parseDouble(progtext11.getText().toString());
        Double value12 = Double.parseDouble(progtext12.getText().toString());
        Double value13 = Double.parseDouble(progtext13.getText().toString());
        Double m  = value1 + value2 +value3 + value4 +value5 + value6+  value7 + value8  +value9 + value10 +value11 + value12 + value13;


        /*
        Double num = value1+ value2 +value3 + value4 +value5 + value6+  value7 + value8  +value9+ value10 +value11 + value12 ;
        */
        //do the calculation

        Double calculatedValue = ((value1*100 + value2*95 +value3*85 + value4*70 +value5*95*1.5 + value6*85*1.5+  value7*70*1.5 + value8*60*1.5  +value9*100*2 + value10*95*2 +value11*85*2 + value12*70*2+value13*60*2) /m)   ;
        calculatedValue = round(calculatedValue*4.10, 2 );
        //set the value to the textview, to display on screen.
        String gov = "/410";

        total.setText(calculatedValue.toString()+gov );

    }

}




