package com.example.customdailogboxui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class robocor_landing_activity extends AppCompatActivity {

    Button register;
    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robocor_landing_activity);

        models = new ArrayList<>();
        models.add(new Model(R.drawable.arduinoclash,"Unleash your potential. Move over the hard levels and get your brain sweat a little. It's a brain storming challenge where you are supposed to do instant projects on arduino.","Arduino Clash"));
        models.add(new Model(R.drawable.situation,"Fumble and it's all over!! Trace it and track the prize. Master the code and win! It is the chance to prove the worth of your bot.  YOU DON'T FALL OUT OF TRACK AND YOU SHALL EMERGE VICTERIOUS ","Situation 2.0"));
        models.add(new Model(R.drawable.decoders,"The most important part of Robotics is Coding. This event encourages students from all branches to participate and improve their coding and critical thinking skills.","D-Code"));
        models.add(new Model(R.drawable.ruggedrage,"Design a wired robot within the specified dimensions that can be operated manually and can travel through all turns of the track adorned with mud, hurdles, bumps and breakers.","Rugged Rage"));
        models.add(new Model(R.drawable.crossroads,"Gear up for rumbling engines, flamboyant wireless cars and adrenaline packed races at the all new Cross-Roads. It's all about speed, control, accuracy and size of the bot.","Cross Roads"));
        models.add(new Model(R.drawable.paperpresentation,"Putting pen to paper and allowing your mind to speak is what adds to the glory of technical event. It's all about how innovative your idea is. How much you've researched on it and how you present it.","Paper Presentation"));
        models.add(new Model(R.drawable.robosoccer,"The objective is to design a manual robot which can compete on an arena specially designed for robotic soccer match. Aim to push the ball into opponent's goal post.","Robosoccer"));
        models.add(new Model(R.drawable.projectsymposium,"A great platform to build, develop and showcase your ideas and take the enormous knowledge with you while going back!!","Project Symposium"));

        adapter = new Adapter(models,this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(100,200,100,0);

        Integer[] colors_temp = {
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color4),
                getResources().getColor(R.color.color5),
                getResources().getColor(R.color.color6),
                getResources().getColor(R.color.color7),
                getResources().getColor(R.color.color8)
        };

        colors = colors_temp;

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position < (adapter.getCount()-1) && position < (colors.length - 1)){
                    viewPager.setBackgroundColor((Integer) argbEvaluator.evaluate(positionOffset,colors[position],colors[position+1]));
                }
                else{
                    viewPager.setBackgroundColor(colors[colors.length - 1]);
                }
            }

            @Override
            public void onPageSelected(final int position) {

                pos = position;

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    public void click(View view){
        if(pos == 0){
            Intent i = new Intent(robocor_landing_activity.this,arduinoclashRegistration.class);
            startActivity(i);
        }
        if(pos == 1){
            Intent i = new Intent(robocor_landing_activity.this,situationRegistration.class);
            startActivity(i);
        }
        if(pos == 2){
            Intent i = new Intent(robocor_landing_activity.this,decodeRegistration.class);
            startActivity(i);
        }
        if(pos == 3){
            Intent i = new Intent(robocor_landing_activity.this,RuggedRageRegistration.class);
            startActivity(i);
        }
        if(pos == 4){
            Intent i = new Intent(robocor_landing_activity.this,CrossRoadsRegistration.class);
            startActivity(i);
        }
        if(pos == 5){
            Intent i = new Intent(robocor_landing_activity.this,PaperPresentationRegistration.class);
            startActivity(i);
        }
        if(pos == 6){
            Intent i = new Intent(robocor_landing_activity.this,Robosoccer.class);
            startActivity(i);
        }
        if(pos == 7){
            Intent i = new Intent(robocor_landing_activity.this,ProjectSymposium.class);
            startActivity(i);
        }

    }

}