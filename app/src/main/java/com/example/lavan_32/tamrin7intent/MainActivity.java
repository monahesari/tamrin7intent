package com.example.lavan_32.tamrin7intent;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Date;
public class MainActivity extends AppCompatActivity implements MediaPlayer.OnCompletionListener {

    private TextView hours, minute;
    private Button button1;
    private Button button2;
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
        setContentView(R.layout.activity_main);

        hours = (TextView) findViewById(R.id.ho);
        minute = (TextView) findViewById(R.id.minute);
        button1 = (Button) findViewById(R.id.b1);
        button2= (Button)findViewById(R.id.b2);

        Typeface t1 = Typeface.createFromAsset(getAssets(), "fonts/segment7.otf");
        hours.setTypeface(t1);
        minute.setTypeface(t1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Date d = new Date();
                int h = d.getHours();
                int m = d.getMinutes();
                String hs = String.format("%2d", h);
                String hm = String.format("%2d", m);
                hours.setText(hs);
                minute.setText(hm);

                if ((h == 0))
                    h = 12;
                else if (h > 12)
                    h = h - 12;

                int i = 0;

                voices[i++] = m == 0 ? voices1[h] : voices1o[h];
                if (m < 20)
                    voices[i++] = voices1[m];
                else {
                    int m10 = m / 10;
                    int m1 = m % 10;
                    voices[i++] = m1 == 0 ? voices10[m10] : voices10o[m10];
                    if ((m1 != 0))
                        voices[i++] = voices1[m1];
                }

                int j = 0;

                voicess[j++] = m == 0 ? voicess1[h] : voicess1o[h];
                if (m < 20)
                    voicess[j++] = voicess1[m];
                else {
                    int m10 = m / 10;
                    int m1 = m % 10;
                    voicess[j++] = m1 == 0 ? voicess10[m10] : voicess10o[m10];
                    if ((m1 != 0))
                        voicess[j++] = voicess1[m1];
                }




                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent GoActivity = new Intent (MainActivity.this,Main2Activity.class);
                        startActivity(GoActivity);


                    }
                });



                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.recordingsaat);
                mp.setOnCompletionListener(MainActivity.this);
                mp.start();



            }
        });


    }

    @Override
    public void onCompletion(MediaPlayer mp) {

        if (voices[index] != 0) {
            MediaPlayer mp2 = MediaPlayer.create(this, voices[index]);
            index++;
            mp2.setOnCompletionListener(this);
            mp2.start();

        }
    }
}


