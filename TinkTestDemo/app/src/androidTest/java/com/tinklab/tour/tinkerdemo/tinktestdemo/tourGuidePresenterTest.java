package com.tinklab.tour.tinkerdemo.tinktestdemo;

import android.support.test.runner.AndroidJUnit4;

import com.tinklab.tour.tinkerdemo.mvp.tourGuidePresenterImpl;
import com.tinklab.tour.tinkerdemo.mvp.tourGuideView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * @作者：liliang
 * @日期: 2018/4/8 11:11
 * @描述:
 */

@RunWith(MockitoJUnitRunner.class)
public class tourGuidePresenterTest {
    @Mock
    tourGuideView mView;
    tourGuidePresenterImpl mTourPresenter;

     @Before
    public void setup() throws Exception{
         mTourPresenter=new tourGuidePresenterImpl(mView);
     }
     @Test
    public void checkIfRequestEatData()throws Exception{
         mTourPresenter.getEatDatas();
     }
     @Test
    public void checkIfRequestShopData()throws Exception{
         mTourPresenter.getShopDatas();
     }
     @Test
    public void checkIfRequestCityData()throws Exception{
         mTourPresenter.getCityGuideDatas();
     }

}
