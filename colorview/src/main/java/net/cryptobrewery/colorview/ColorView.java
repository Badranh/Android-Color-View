package net.cryptobrewery.colorview;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * Created by Hasan Badran on 8/12/2018.
 */

public class ColorView extends RelativeLayout {
    private RecyclerView colorRecyclerView;
    private Context ctx;
    private String [] colors;


    public interface onCardColorClick {
        void ClickCallBack();
    }


    public ColorView(Context context,String [] colors) throws Exception {
        super(context);
        this.ctx = context;
        init(colors,null);
    }

    public ColorView(Context context, AttributeSet attrs,String [] colors) throws Exception {
        super(context, attrs);
        init(colors,null);

    }
    public ColorView(Context context,String [] colors,onCardColorClick listener) throws Exception {
        super(context);
        this.ctx = context;
        init(colors,listener);
    }


    private void init(String[] colors,onCardColorClick listener) throws Exception {
        if(colors == null){
            throw new Error("Something failed.", new Throwable("Colors Not Initialized"));
        }
        inflate(ctx,R.layout.colorview,this);
        colorRecyclerView = findViewById(R.id.color_rec_view);
        LinearLayoutManager llm = new LinearLayoutManager(ctx);
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        colorRecyclerView.setLayoutManager(llm);
        ColorAdapter adapter=null;
        if(listener!=null){
            adapter = new ColorAdapter(colors,listener);

        }
        else{
            adapter = new ColorAdapter(colors);
        }
        colorRecyclerView.setAdapter(adapter);
        colorRecyclerView.hasFixedSize();
        colorRecyclerView.forceLayout();
    }

    public void setColorRecyclerView(RecyclerView colorRecyclerView) {
        this.colorRecyclerView = colorRecyclerView;
    }

    public void setCtx(Context ctx) {
        this.ctx = ctx;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }
}
