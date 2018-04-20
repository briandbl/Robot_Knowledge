package com.tinklab.tour.tinkerdemo.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.tinklab.tour.tinkerdemo.mvp.tourGuidePresenterImpl;
import com.tinklab.tour.tinkerdemo.mvp.tourGuideView;
import com.tinklab.tour.tinkerdemo.tinktestdemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * @作者：LILIANG
 * @日期: 2018/4/8 10:52
 * @描述:
 */


public class shopGuideFragment extends Fragment implements tourGuideView {
    private RecyclerView mSyncRecyclerview;
    private View mView;
    ShopCircleAdapter mAdapter;
    private int type = 1;
    List<String> mDatas=new ArrayList<>();
    tourGuidePresenterImpl presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_eat, container, false);
        mSyncRecyclerview = (RecyclerView) mView.findViewById(R.id.recyclerview_circle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL, false);
        mSyncRecyclerview.setLayoutManager(linearLayoutManager);
        mAdapter = new ShopCircleAdapter(getActivity(),type);
        mSyncRecyclerview.setAdapter(mAdapter);
        presenter = new tourGuidePresenterImpl(this);
        presenter.getShopDatas();
        return mView;
    }

    @Override
    public void showEatDatas(List<String> content) {

    }

    @Override
    public void showShopDatas(List<String> content) {
        mDatas=content;
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void showCityGuideDatas(List<String> content) {

    }

    public class MyCircleHolder extends RecyclerView.ViewHolder {

        public ImageView img_logo;
        public TextView txt_name;
        public LinearLayout mInfoItem;
        public MyCircleHolder(View view) {
            super(view);
            img_logo = (ImageView) view.findViewById(R.id.image_logo);
            txt_name=(TextView)view.findViewById(R.id.text_description);
            mInfoItem=(LinearLayout)view.findViewById(R.id.info_item);
        }

    }
    class ShopCircleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        private Context mContext;
        private View mView;
        private int type = -1;

        public ShopCircleAdapter(Context mContext, int type) {
            this.mContext = mContext;
            this.type = type;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            mView = LayoutInflater.from(mContext).inflate(R.layout.fragment_eat_item, parent, false);
            shopGuideFragment.MyCircleHolder myCircleHolder = new shopGuideFragment.MyCircleHolder(mView);
            return myCircleHolder;
        }

        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder mHolder, final int position) {
            final MyCircleHolder holder = (MyCircleHolder) mHolder;
            holder.img_logo.setImageDrawable(mContext.getDrawable(R.drawable.dm));
            holder.txt_name.setText(mDatas.get(position));
            holder.mInfoItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getActivity(),"your click shop position"+position, Toast.LENGTH_LONG).show();
                }
            });
        }

        @Override
        public int getItemCount() {
            return mDatas.size();
        }

    }
}
