package com.example.lavan_32.tamrin7intent;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Date;

public  class Main2Activity extends AppCompatActivity implements MediaPlayer.OnCompletionListener {
    private int[] voices = {R.raw.recordingsaat, R.raw.recording2o, R.raw.recording50, R.raw.recordingdaghighe, 0};
    private int index = 0;

    int[] voices1 = {

            0,
            R.raw.recording1, R.raw.recording2, R.raw.recording3, R.raw.recording4,
            R.raw.recording5, R.raw.recording6, R.raw.recording7, R.raw.recording8,
            R.raw.recording9, R.raw.recording10, R.raw.recording11, R.raw.recording12,
            R.raw.recording13, R.raw.recording14, R.raw.recording15, R.raw.recording16,
            R.raw.recording17, R.raw.recording18, R.raw.recording19, R.raw.recording20,

    };

    int[] voices1o = {

            0,
            R.raw.recording1o, R.raw.recording2o, R.raw.recording3o, R.raw.recording4o,
            R.raw.recording5o, R.raw.recording6o, R.raw.recording7o, R.raw.recording8o,
            R.raw.recording9o, R.raw.recording10o, R.raw.recording11o, R.raw.recording12o,
            R.raw.recording13o, R.raw.recording14o, R.raw.recording15o, R.raw.recording16o,
            R.raw.recording17o, R.raw.recording18o, R.raw.recording19o, R.raw.recording20o,


    };
    int[] voices10o = {

            0,
            R.raw.recording10o, R.raw.recording20o, R.raw.recording30o, R.raw.recording40o,
            R.raw.recording50o
    };
    int[] voices10 = {

            0,
            R.raw.recording10, R.raw.recording20, R.raw.recording30, R.raw.recording40,
            R.raw.recording50
    };


    /*saat system
     */

    private int[] voicess = {R.raw.saat, R.raw.r2o, R.raw.r50, R.raw.daghigheh, 0};
    private int indexx = 0;
    int[] voicess1 = {

            0,
            R.raw.r1, R.raw.r2, R.raw.r3, R.raw.r4,
            R.raw.r5, R.raw.r6, R.raw.r7, R.raw.r8,
            R.raw.r9, R.raw.r10, R.raw.r11, R.raw.r12,
            R.raw.r13, R.raw.r14, R.raw.r15, R.raw.r16,
            R.raw.r17, R.raw.r18, R.raw.r19, R.raw.r20,

    };

    int[] voicess1o = {

            0,
            R.raw.r1o, R.raw.r2o, R.raw.r3o, R.raw.r4o,
            R.raw.r5o, R.raw.r6o, R.raw.r7o, R.raw.r8o,
            R.raw.r9o, R.raw.r10o, R.raw.r11o, R.raw.r12o,
            R.raw.r13o, R.raw.r14o, R.raw.r15o, R.raw.r16o,
            R.raw.r17o, R.raw.r18o, R.raw.r19o, R.raw.r20o,


    };

    int[] voicess10o = {

            0,
            R.raw.r10o, R.raw.r20o, R.raw.r30o, R.raw.r40o,
            R.raw.r50o
    };
    int[] voicess10 = {

            0,
            R.raw.r10, R.raw.r20, R.raw.r30, R.raw.r40,
            R.raw.r50
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        RadioButton rbn1 = (RadioButton) findViewById(R.id.rb1);
        RadioButton rbn2 = (RadioButton) findViewById(R.id.rb2);
        RadioGroup rg1=(RadioGroup)findViewById(R.id.rg);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId)
                {

                    case R.id.rb1:


                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.recordingsaat);
                        mp.setOnCompletionListener(Main2Activity.this);
                        mp.start();

                        break;


                    case  R.id.rb2:

                        MediaPlayer mpp = MediaPlayer.create(Main2Activity.this, R.raw.saat);
                        mpp.setOnCompletionListener(Main2Activity.this);
                        mpp.start();

                        break;


                }
            }
        });

    }


    public void onCompletion(MediaPlayer mp) {


        if ((voices[index] != 0)) {
            MediaPlayer mp2 = MediaPlayer.create(this, voices[index]);
            index++;
            mp2.setOnCompletionListener(this);
            mp2.start();
        }
    }
        }




