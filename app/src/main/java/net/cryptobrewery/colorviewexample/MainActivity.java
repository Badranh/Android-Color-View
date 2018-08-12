package net.cryptobrewery.colorviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;

import net.cryptobrewery.colorview.ColorView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout colorView = findViewById(R.id.colorView);
        try {
            ColorView colors = new ColorView(this, new String[]{"#192392", "#912333","#918bca","#912abc","#aef123"}, new ColorView.onCardColorClick() {
                @Override
                public void ClickCallBack() {
                    Toast.makeText(getBaseContext(),"clicked",Toast.LENGTH_LONG).show();
                }
            });
            colorView.addView(colors);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
