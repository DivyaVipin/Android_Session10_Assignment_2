package assignment.android.acadgild.android_versions;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//import assignment.android.acadgild.recycler.R;

/**
 * Created by DivyaVipin on 1/24/2017.
 */

public class VersionAdapter extends RecyclerView.Adapter<VersionAdapter.VersionViewHolder> {
    private String[] version = {"Alpha","Beta","CupCake","Donut","Eclair","Froyo"};





    @Override
    public VersionAdapter.VersionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.version_row,parent,false);
        VersionViewHolder viewHolder=new VersionViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(VersionAdapter.VersionViewHolder holder, int position) {

        holder.text.setText(version[position]);
    }

    @Override
    public int getItemCount() {
        return version.length;
    }

    public static class VersionViewHolder extends RecyclerView.ViewHolder{

        protected TextView text;

        public VersionViewHolder(View itemView) {
            super(itemView);

            text= (TextView) itemView.findViewById(R.id.version);
        }
    }

}
