package com.example.rainbow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

private LinearLayout mLnrFinish;
private LinearLayout mLnrRed;
private LinearLayout mLnrOrange;
private LinearLayout mLrYellow;
private LinearLayout mLrLightGreen;
private LinearLayout mLrDarkGreen;
private LinearLayout mLrLightBlue;
private LinearLayout mLrDarkBlue;
private LinearLayout mLrViolet;
private LinearLayout mLrDarkViolet;
private TextView mTxtRed;
private TextView mTxtOrange;
private TextView mTxtYellow;
private TextView mTxtLightBlue;
private TextView mTxtDarkBlue;
private TextView mTxtLightGreen;
private TextView mTxtDarkGreen;
private TextView mTxtViolet;
private TextView mTxtDarkViolet;
private int cnt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListenersForLayouts();



    }
//*************************************************************************************************
    private void setListenersForLayouts() {
        mLnrRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLnrRed.setVisibility(View.GONE);
                int resIdString=R.string.red;
                changeColorText(resIdString);
                refreshTexts();
                finishScreen();

            }


        });
        mLnrOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLnrOrange.setVisibility(View.GONE);
                int resIdString=R.string.orange;
                changeColorText(resIdString);
                refreshTexts();
                finishScreen();

            }
        });
        mLrYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLrYellow.setVisibility(View.GONE);
                int resIdString=R.string.yellow;
                changeColorText(resIdString);
                refreshTexts();
                finishScreen();
            }
        });
        mLrLightGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLrLightGreen.setVisibility(View.GONE);
                int resIdString=R.string.light_green;
                changeColorText(resIdString);
                refreshTexts();
                finishScreen();
            }
        });
        mLrDarkGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLrDarkGreen.setVisibility(View.GONE);
                int resIdString=R.string.dark_green;
                changeColorText(resIdString);
                refreshTexts();
                finishScreen();
            }
        });
        mLrLightBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLrLightBlue.setVisibility(View.GONE);
                int resIdString=R.string.light_blue;
                changeColorText(resIdString);
                refreshTexts();
                finishScreen();
            }
        });
        mLrDarkBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLrDarkBlue.setVisibility(View.GONE);
                int resIdString=R.string.dark_blue;
                changeColorText(resIdString);
                refreshTexts();
                finishScreen();
            }
        });
        mLrViolet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mLrViolet.setVisibility(View.GONE);
                int resIdString=R.string.violet;
                changeColorText(resIdString);
                refreshTexts();
                finishScreen();
            }
        });
        mLrDarkViolet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mLrDarkViolet.setVisibility(View.GONE);
                int resIdString=R.string.dark_violet;
                changeColorText(resIdString);
                refreshTexts();
                finishScreen();
            }
        });
    }
    //********************************************************************************************

    private void findViews() {
     //   mLnrFinish=findViewById(R.id.lnr_main_finish);
        mLnrRed =findViewById(R.id.lnr_main_red);
        mLnrOrange =findViewById(R.id.lnr_main_orange);
        mLrYellow =findViewById(R.id.lnr_main_yellow);
        mLrLightGreen =findViewById(R.id.lnr_main_lightGreen);
        mLrDarkGreen =findViewById(R.id.lnr_main_darkGreen);
        mLrLightBlue =findViewById(R.id.lnr_main_lightBlue);
        mLrDarkBlue =findViewById(R.id.lnr_main_darkBlue);
        mLrViolet =findViewById(R.id.lnr_main_violet);
        mLrDarkViolet =findViewById(R.id.lnr_main_darkViolet);
        mTxtRed =findViewById(R.id.txt_main_red);
        mTxtOrange =findViewById(R.id.txt_main_orange);
        mTxtYellow =findViewById(R.id.txt_main_yellow);
        mTxtLightGreen =findViewById(R.id.txt_main_lightGreen);
        mTxtDarkGreen =findViewById(R.id.txt_main_darkGreen);
        mTxtLightBlue =findViewById(R.id.txt_main_lightBlue);
        mTxtDarkBlue =findViewById(R.id.txt_main_darkBlue);
        mTxtViolet =findViewById(R.id.txt_main_violet);
        mTxtDarkViolet =findViewById(R.id.txt_main_darkViolet);
    }
    private void changeColorText(int resIdString){
        cnt++;
        mTxtRed.setText(resIdString);
        mTxtOrange.setText(resIdString);
        mTxtYellow.setText(resIdString);
        mTxtLightGreen.setText(resIdString);
        mTxtDarkGreen.setText(resIdString);
        mTxtLightBlue.setText(resIdString);
        mTxtDarkBlue.setText(resIdString);
        mTxtViolet.setText(resIdString);
        mTxtDarkViolet.setText(resIdString);
    }
    private void refreshTexts(){
        mTxtOrange.postDelayed(new Runnable() {
            @Override
            public void run() {
                mTxtOrange.setText(R.string.orange);

            }
        },5000);
        mTxtRed.postDelayed(new Runnable() {
            @Override
            public void run() {
                mTxtRed.setText(R.string.red);
            }
        },5000);
        mTxtYellow.postDelayed(new Runnable() {
            @Override
            public void run() {
                mTxtYellow.setText(R.string.yellow);
            }
        },5000);

        mTxtLightGreen.postDelayed(new Runnable() {
            @Override
            public void run() {

                mTxtLightGreen.setText(R.string.light_green);

            }
        },5000);
        mTxtDarkGreen.postDelayed(new Runnable() {
            @Override
            public void run() {
                mTxtDarkGreen.setText(R.string.dark_green);
            }
        },5000);
        mTxtLightBlue.postDelayed(new Runnable() {
            @Override
            public void run() {

                mTxtLightBlue.setText(R.string.light_blue);

            }
        },5000);
        mTxtDarkBlue.postDelayed(new Runnable() {
            @Override
            public void run() {
                mTxtDarkBlue.setText(R.string.dark_blue);
            }
        },5000);
        mTxtViolet.postDelayed(new Runnable() {
            @Override
            public void run() {
                mTxtViolet.setText(R.string.violet);
            }
        },5000);
        mTxtDarkViolet.postDelayed(new Runnable() {
            @Override
            public void run() {

                mTxtDarkViolet.setText(R.string.dark_violet);
            }
        },5000);

    }
    private void finishScreen(){
        if (cnt==9){
            mLnrFinish.setVisibility(View.VISIBLE);

        }
    }

}