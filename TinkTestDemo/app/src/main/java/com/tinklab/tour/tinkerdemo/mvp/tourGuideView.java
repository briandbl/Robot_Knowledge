package com.tinklab.tour.tinkerdemo.mvp;

import java.util.List;

/**
 * @作者：LILIANG
 * @日期: 2018/4/8 10:18
 * @描述:
 */


public interface tourGuideView {

    void showEatDatas(List<String> content);
    void showShopDatas(List<String> content);
    void showCityGuideDatas(List<String> content);
}
