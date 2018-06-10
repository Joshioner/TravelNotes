package com.travelNotes.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.asus.travelnotes.R;
import com.travelNotes.CollectionActivity;

/**
 * Created by asus on 2017/8/9.
 */

public class me_Fragment extends Fragment {
    private View view ;
    private RelativeLayout relativeLayout;

    public me_Fragment(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.me,container,false);
        initView();
        initEvent();
        return view;
   //     return inflater.inflate(R.layout.view5, container, false);
    }

    /**
     * 事件
     */
    private void initEvent() {
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CollectionActivity.class);
                startActivity(intent);
            }
        });
    }

    /**
     * 初始化控件
     */
    private void initView() {
        relativeLayout = (RelativeLayout) view.findViewById(R.id.collection);
    }


}
