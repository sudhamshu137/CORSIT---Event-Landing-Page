package com.example.customdailogboxui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Btn , BtnAccept,rec,work,robo;
    Dialog epicDialog;
    TextView TitleTv, MessageTv;
    ImageView closePopupPositiveImg;
    private int seconds = 86500;
    private boolean running = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        epicDialog =  new Dialog(this);

        Btn = (Button) findViewById(R.id.Btn);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowPositivePopup();
            }
        });

        rec = (Button) findViewById(R.id.recruitments);
        rec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recruitments();
            }
        });

        work = (Button) findViewById(R.id.workshop);
        work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                workshop();
            }
        });

        robo = (Button) findViewById(R.id.robocor);
        robo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                robocor();
            }
        });
    }



    public void ShowPositivePopup(){
        epicDialog.setContentView(R.layout.epic_popup);

        closePopupPositiveImg = (ImageView) epicDialog.findViewById(R.id.closePopupPositiveImg);
        BtnAccept = (Button) epicDialog.findViewById(R.id.btnAccept);
        TitleTv = (TextView) epicDialog.findViewById(R.id.titleTv);
        MessageTv = (TextView) epicDialog.findViewById(R.id.MessageTv);

        closePopupPositiveImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                epicDialog.dismiss();
            }
        });

        BtnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                epicDialog.dismiss();
            }
        });

        epicDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        epicDialog.show();
    }

    public void recruitments(){
        epicDialog.setContentView(R.layout.epic_popup_recruitments);

        closePopupPositiveImg = (ImageView) epicDialog.findViewById(R.id.closePopupPositiveImg);
        BtnAccept = (Button) epicDialog.findViewById(R.id.btnAccept);
        TitleTv = (TextView) epicDialog.findViewById(R.id.titleTv);
        MessageTv = (TextView) epicDialog.findViewById(R.id.MessageTv);

        closePopupPositiveImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                epicDialog.dismiss();
            }
        });

        BtnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                epicDialog.dismiss();
            }
        });

        epicDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        epicDialog.show();
    }

    public void workshop(){

        epicDialog.setContentView(R.layout.epic_popup_workshop);

        closePopupPositiveImg = (ImageView) epicDialog.findViewById(R.id.closePopupPositiveImg);
        BtnAccept = (Button) epicDialog.findViewById(R.id.btnAccept);
        TitleTv = (TextView) epicDialog.findViewById(R.id.titleTv);
        MessageTv = (TextView) epicDialog.findViewById(R.id.MessageTv);

        closePopupPositiveImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                epicDialog.dismiss();
            }
        });

        BtnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                epicDialog.dismiss();
            }
        });

        epicDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        epicDialog.show();

    }

    public void robocor(){

        epicDialog.setContentView(R.layout.epic_popup_robocor);

        closePopupPositiveImg = (ImageView) epicDialog.findViewById(R.id.closePopupPositiveImg);
        BtnAccept = (Button) epicDialog.findViewById(R.id.btnAccept);
        TitleTv = (TextView) epicDialog.findViewById(R.id.titleTv);
        MessageTv = (TextView) epicDialog.findViewById(R.id.MessageTv);

        closePopupPositiveImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                epicDialog.dismiss();
            }
        });

        BtnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent robocorIntent = new Intent(MainActivity.this,robocor_landing_activity.class);
                epicDialog.dismiss();
                startActivity(robocorIntent);
            }
        });

        epicDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        epicDialog.show();

    }

}