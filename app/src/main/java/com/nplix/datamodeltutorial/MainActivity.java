package com.nplix.datamodeltutorial;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Integer clickMe=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnClickMe=findViewById(R.id.clickMe);
        final TextView txtClickMe=findViewById(R.id.clickCount);
        final ClickMeViewModel clickMeViewModel= ViewModelProviders.of(this).get(ClickMeViewModel.class);
        // Check if View Model have some value
        if(clickMeViewModel.getClickCount()!=null){
            clickMe=clickMeViewModel.getClickCount();
        }
      //  else initialize with initial setup
        else{
            clickMe=0;
        }
        txtClickMe.setText("You Have Clicked " + clickMe + " Times");

        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               clickMe++;
               txtClickMe.setText("You Have Clicked " + clickMe + " Times");
               //set the Click Count to ViewModel
               clickMeViewModel.setClickCount(clickMe);
            }
        });
    }
}
