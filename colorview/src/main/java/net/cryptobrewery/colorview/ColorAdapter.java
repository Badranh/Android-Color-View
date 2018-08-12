package net.cryptobrewery.colorview;

import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Hasan Badran on 8/12/2018.
 */

 public class ColorAdapter  extends RecyclerView.Adapter<ColorAdapter.ViewHolder>{
     public interface onCardClick{
         void onClickCallBack();
     }
    private String[] colors;
    private onCardClick listener;
    public ColorAdapter(String[] colors) {
        this.colors = colors;
    }

    public ColorAdapter(String[] colors, onCardClick listener) {
        this.colors = colors;
        this.listener = listener;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.color_item_box,parent,false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.colorCard.setCardBackgroundColor(Color.parseColor(colors[position]));
    }

    @Override
    public int getItemCount() {
        return colors.length;
    }
    class ViewHolder extends RecyclerView.ViewHolder{
        private CardView colorCard;
        private ViewHolder(View itemView) {
            super(itemView);
            colorCard = itemView.findViewById(R.id.card);

            if(listener !=null){
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        listener.onClickCallBack();
                    }
                });
            }
        }
    }
}
