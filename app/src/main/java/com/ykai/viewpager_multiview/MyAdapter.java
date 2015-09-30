/*
 * Copyright (c) 2015-2015 by Shanghai shootbox Information Technology Co., Ltd.
 * Create: 2015/9/28 10:25:19
 * Project: ViewPager_multiView
 * File: MyAdapter.java
 * Class: MyAdapter
 * Module: app
 * Author: yangyankai
 * Version: 1.0
 */

package com.ykai.viewpager_multiview;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.List;

/**
 * Created by yangyankai on 2015/9/28.
 */
public class MyAdapter extends PagerAdapter {

	List<View> viewList;

	public MyAdapter(List<View> list)
	{
		viewList=list;
	}

	@Override
	public int getCount()
	{
		return viewList.size();
	}

	@Override
	public boolean isViewFromObject(View view, Object o)
	{
		return view==o;
	}


	@Override
	public void destroyItem(View view, int position, Object object)
	{
		((ViewPager)view).removeView(viewList.get(position));
	}

	@Override
	public Object instantiateItem(View view, int position)
	{
		((ViewPager)view).addView(viewList.get(position),0);
		return viewList.get(position);
	}
}
