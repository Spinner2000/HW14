package com.example.hw14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int total;
    int dies;
    int numberOfDie;
    int roll;
    String dieText="";
    String additionText="";
    Random r=new Random();

    public void die1(View v){
        TextView die=this.findViewById(R.id.Selection);
        numberOfDie=1;
        dieText=dieText+"1";
        die.setText(dieText);
    }

    public void die2(View v){
        TextView die=this.findViewById(R.id.Selection);
        numberOfDie=2;
        dieText=dieText+"2";
        die.setText(dieText);
    }
    public void die3(View v){
        TextView die=this.findViewById(R.id.Selection);
        numberOfDie=3;
        dieText=dieText+"3";
        die.setText(dieText);
    }

    public void die4(View v){
        TextView die=this.findViewById(R.id.Selection);
        numberOfDie=4;
        dieText=dieText+"4";
        die.setText(dieText);
    }

    public void die5(View v){
        TextView die=this.findViewById(R.id.Selection);
        numberOfDie=5;
        dieText=dieText+"5";
        die.setText(dieText);
    }

    public void die6(View v){
        TextView die=this.findViewById(R.id.Selection);
        numberOfDie=6;
        dieText=dieText+"6";
        die.setText(dieText);
    }

    public void die7(View v){
        TextView die=this.findViewById(R.id.Selection);
        numberOfDie=7;
        dieText=dieText+"7";
        die.setText(dieText);
    }

    public void die8(View v){
        TextView die=this.findViewById(R.id.Selection);
        numberOfDie=8;
        dieText=dieText+"8";
        die.setText(dieText);
    }

    public void die9(View v){
        TextView die=this.findViewById(R.id.Selection);
        numberOfDie=9;
        dieText=dieText+"9";
        die.setText(dieText);
    }

    public void d4(View v){
        TextView die=this.findViewById(R.id.Selection);
        dies=4;
        dieText=dieText+"D4";
        die.setText(dieText);
    }

    public void d6(View v){
        TextView die=this.findViewById(R.id.Selection);
        dies=4;
        dieText=dieText+"D4";
        die.setText(dieText);
    }

    public void d8(View v){
        TextView die=this.findViewById(R.id.Selection);
        dies=8;
        dieText=dieText+"D8";
        die.setText(dieText);

    }

    public void d10(View v){
        TextView die=this.findViewById(R.id.Selection);
        dies=10;
        dieText=dieText+"D10";
        die.setText(dieText);

    }

    public void d12(View v){
        TextView die=this.findViewById(R.id.Selection);
        dies=12;
        dieText=dieText+"D12";
        die.setText(dieText);

    }

    public void d20(View v){
        TextView die=this.findViewById(R.id.Selection);
        dies=20;
        dieText=dieText+"D20";
        die.setText(dieText);

    }

    public void percentile(View v){
        TextView Total=this.findViewById(R.id.Total);
        Total.setText(r.nextInt(100));
    }

    public void dieRoll(View v){
        TextView Total=this.findViewById(R.id.Total);
        TextView addition=this.findViewById(R.id.additionBox);
        for(int i=0;i<numberOfDie;i++){
            roll=r.nextInt(dies);
            total=total+roll;
            additionText=addition+"+"+roll;
            addition.setText(additionText);
        }
        Total.setText(total);
    }
}