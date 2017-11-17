package com.example.xxxxxxxy.questionnaire;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    int healthLevel = 10;
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(TextView)this.findViewById(R.id.showView);

        Button btn_y = (Button) this.findViewById(R.id.yes);
        btn_y.setOnClickListener(new ButtonListener());
        Button btn_s = (Button) this.findViewById(R.id.sometimes);
        btn_s.setOnClickListener(new ButtonListener());
        Button btn_n = (Button) this.findViewById(R.id.no);
        btn_n.setOnClickListener(new ButtonListener());

    }
    public void yes(){
        healthLevel = healthLevel + 1;
        message = "You answered yes,current health level is"+ healthLevel;
    }
    public void sometimes(){
        healthLevel = healthLevel + 0;
        message = "You answered sometimes,current health level is"+ healthLevel;
    }
    public void no(){
        healthLevel = healthLevel - 1;
        message = "You answered no,current health level is"+ healthLevel;
    }
    private class ButtonListener implements View.OnClickListener {

        public void onClick(View v) {
            switch(v.getId()){
                case R.id.yes:
                    yes();
                    break;
                case R.id.sometimes:
                    sometimes();
                    break;
                case R.id.no:
                    no();
                    break;
            }
            text.setText(message);
        }
    }
}

