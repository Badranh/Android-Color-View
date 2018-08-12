package net.cryptobrewery.colorviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import net.cryptobrewery.colorview.ColorAdapter;

public class MainActivity extends AppCompatActivity {
private RecyclerView color_rec_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        color_rec_view = findViewById(R.id.color_rec_view);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        color_rec_view.setLayoutManager(llm);
        ColorAdapter adapter = new ColorAdapter(new String[]{"#123123", "#9fa132","#123123","#9123bc","#abcdef"}, new ColorAdapter.onCardClick() {
            @Override
            public void onClickCallBack() {
                Toast.makeText(getBaseContext(),"clicked color",Toast.LENGTH_LONG).show();
            }
        });
        color_rec_view.setAdapter(adapter);
        color_rec_view.forceLayout();
        color_rec_view.hasFixedSize();
    }


}
