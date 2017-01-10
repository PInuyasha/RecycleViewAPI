package com.example.recycleview.recycleviewapi.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.recycleview.recycleviewapi.R;
import com.example.recycleview.recycleviewapi.model.CountryResponse;

import java.util.List;

/**
 * Created by STR01587 on 20/9/2559.
 */

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ViewHolder> {

    private List<CountryResponse> mDataset;
    private Context context;


    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageFlagContinent;
        ImageView mImageFlagCountry;
        TextView mTextContinent;
        TextView mTextCountry;
        TextView mTextCapital;
        TextView mTextCurrency;

        public ViewHolder(View v) {
            super(v);
            mImageFlagContinent = (ImageView)v.findViewById(R.id.image_flagContinent);
            mImageFlagCountry = (ImageView)v.findViewById(R.id.image_flagCountry);
            mTextContinent = (TextView)v.findViewById(R.id.text_Continent);
            mTextCountry = (TextView)v.findViewById(R.id.text_country);
            mTextCapital = (TextView)v.findViewById(R.id.text_capital);
            mTextCurrency = (TextView)v.findViewById(R.id.text_currency);
        }
    }

    public ContinentAdapter(List<CountryResponse> mDataset, Context context){
        this.mDataset = mDataset;
        this.context = context;
    }

    @Override
    public ContinentAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_data, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ContinentAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(mDataset.get(position).getImagesFlagContinent()).into(holder.mImageFlagContinent);
        Glide.with(context).load(mDataset.get(position).getImagesFlagCountry()).into(holder.mImageFlagCountry);
        holder.mTextContinent.setText(mDataset.get(position).getNameContinent());
        holder.mTextCountry.setText(mDataset.get(position).getNameCountry());
        holder.mTextCapital.setText(mDataset.get(position).getNameCapital());
        holder.mTextCurrency.setText(mDataset.get(position).getCurrency());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

}