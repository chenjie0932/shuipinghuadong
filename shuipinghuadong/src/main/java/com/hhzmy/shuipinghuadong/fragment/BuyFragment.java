package com.hhzmy.shuipinghuadong.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hhzmy.shuipinghuadong.R;

public class BuyFragment extends Fragment{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		System.out.println("BuyFragment");
		return inflater.inflate(R.layout.main_buy, container, false);
	}
}
