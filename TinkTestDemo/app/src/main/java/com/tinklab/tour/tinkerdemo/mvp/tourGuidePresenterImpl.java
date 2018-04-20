package com.tinklab.tour.tinkerdemo.mvp;

import java.util.ArrayList;
import java.util.List;

/**
 * @作者：LILIANG
 * @日期: 2018/4/8 10:21
 * @描述:
 */


public class tourGuidePresenterImpl implements tourGuidePresenter{

    boolean mock=true;
    tourGuideView mView;
    List<String> mTestShopData=new ArrayList<>();
    List<String> mTestEatData=new ArrayList<>();
    List<String> mTestCityData=new ArrayList<>();
    public tourGuidePresenterImpl(tourGuideView view){
        mView=view;
        for(int i=0;i<100;i++) {
            mTestShopData.add("深圳人习惯称之为“老东门”的深圳老街形成于明代中期，又叫“深圳旧墟”，地处深圳市罗湖区深南东路以北。");
        }
        for(int i=0;i<100;i++) {
            mTestEatData.add("海底捞始终坚持“无公害，一次性”的选料和底料原则严把原料关，配料关。");
        }
        for(int i=0;i<100;i++) {
            mTestCityData.add("深圳是中国设立的第一个经济特区，是中国改革开放的窗口和新兴移民城市，已发展成为有一定影响力的国际化城市。");
        }
    }
    @Override
    public void getEatDatas() {
         if(mock){
             mView.showEatDatas(mTestEatData);
         }else {
            //HTTTP REQUEST TO GET JSON DATA
         }
    }

    @Override
    public void getShopDatas() {
        if(mock){
            mView.showShopDatas(mTestShopData);
        }else {
            //HTTTP REQUEST TO GET JSON DATA
        }
    }

    @Override
    public void getCityGuideDatas() {
        if(mock){
            mView.showCityGuideDatas(mTestCityData);
        }else {
            //HTTTP REQUEST TO GET JSON DATA
        }
    }

}
