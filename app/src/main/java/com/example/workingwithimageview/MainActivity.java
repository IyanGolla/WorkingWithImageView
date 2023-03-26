package com.example.workingwithimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtFact;
    Button btnFact;
    ImageView imgFact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgFact = (ImageView) findViewById(R.id.imageView);
        txtFact = (TextView) findViewById(R.id.textView);
        btnFact = (Button) findViewById(R.id.button);

        Drawable[] FactImages = new Drawable[2];

        String FactText[] = new String[2];

        Resources res = getResources();

        FactImages[0] = res.getDrawable(R.drawable.acdc_profile);

        FactImages[1] = res.getDrawable(R.drawable.arcade_brown_bag);

        FactText[0] = res.getString(R.string.String1);
        FactText[1] = res.getString(R.string.String2);
        btnFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumber = new Random();

                int numberGenerated = randomNumber.nextInt(2 - 0) + 0;

// int drawableId = Integer.parseInt(FactImages[numberGenerated].toString());

                imgFact.setImageDrawable(FactImages[numberGenerated]);

                txtFact.setText(FactText[numberGenerated]);
            }
        });

    }
}