package com.travelNotes.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.asus.travelnotes.R;
import com.travelNotes.FollowActivity;
import com.travelNotes.RecommendActivity;

/**
 * Created by asus on 2017/8/9.
 */

public class homePage_Fragment extends Fragment implements View.OnClickListener{
    private View view ;
    private Button follow;  //关注按钮
    private Button recommend; //推荐按钮

    public homePage_Fragment(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.home_page,container,false);
        //初始化控件
        initView();
       //事件
        initEvent();
        return view;
    }

    private void initEvent() {
        follow.setOnClickListener(this);
        recommend.setOnClickListener(this);
    }


    //初始化控件
    private void initView()
    {
        follow = (Button) view.findViewById(R.id.follow);
        recommend = (Button) view.findViewById(R.id.recommend);
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent ;
        switch (id)
        {
            case R.id.follow:
                intent = new Intent(getActivity(), FollowActivity.class);
                startActivity(intent);
                break;
            case R.id.recommend:
                intent = new Intent(getActivity(), RecommendActivity.class);
                startActivity(intent);
                break;
        }
    }
}
