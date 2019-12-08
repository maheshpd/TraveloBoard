package com.createsapp.traveloboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    Animation frombottom,fromTop;
    Button joinTodays;
    TextView signUpTxt;
    EditText emailAdd,compName,Username,CountryLoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        joinTodays = findViewById(R.id.joinToday);
        signUpTxt = findViewById(R.id.textView);
        emailAdd = findViewById(R.id.emailTxt);
        compName = findViewById(R.id.passwordTxt);
        Username = findViewById(R.id.Username);
        CountryLoc = findViewById(R.id.countryLocation);


        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);
        fromTop = AnimationUtils.loadAnimation(this,R.anim.fromtop);

        joinTodays.startAnimation(frombottom);
        signUpTxt.startAnimation(fromTop);
        emailAdd.startAnimation(fromTop);
        compName.startAnimation(fromTop);
        Username.startAnimation(fromTop);
        CountryLoc.startAnimation(fromTop);
    }
}
