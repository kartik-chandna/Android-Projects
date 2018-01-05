package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {

        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView cookieImage = (ImageView)findViewById(R.id.android_cookie_image_view);
        cookieImage.setImageResource(R.drawable.after_cookie);

        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView cookieText = (TextView)findViewById(R.id.status_text_view);
        cookieText.setText("I'm so full");

        Log.i("MainActivity.java", "Captain's Log, Stardate 43125.8. We have entered a spectacular binary star system in the Kavis Alpha sector on a most critical mission of astrophysical research.");

    }
}