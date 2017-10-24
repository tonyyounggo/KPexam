package com.ziinc.kpexam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //設定隱藏標題
        getSupportActionBar().hide();
        //設定隱藏狀態
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    public void onClick1(View view){

        Intent intent=new Intent(this,TPNPGI.class);
        startActivity(intent);

    }

    public void onClick2(View view) {

        Intent intent = new Intent(this, Touyoun.class);
        startActivity(intent);
    }

    public void onClick3(View view) {

        Intent intent = new Intent(this, Hsinchucity.class);
        startActivity(intent);
    }

    public void onClick4(View view) {

        Intent intent = new Intent(this, Hsinchucounty.class);
        startActivity(intent);
    }
}
