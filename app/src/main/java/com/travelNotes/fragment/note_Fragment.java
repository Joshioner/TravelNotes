package com.travelNotes.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.asus.travelnotes.R;
import com.travelNotes.AddNoteActivity;
import com.travelNotes.NoteContentActivity;

/**
 * Created by asus on 2017/8/9.
 */

public class note_Fragment extends Fragment {
    private View view ;
    private LinearLayout linearLayout;
    private ImageView iconAdd;  //添加游记按钮
    public note_Fragment(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.note_page,container,false);
        initView();
        initEvent();
        return view;
   //     return inflater.inflate(R.layout.view5, container, false);
    }

    /**
     * 初始化事件
     */
    private void initEvent() {
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NoteContentActivity.class);
                startActivity(intent);
            }
        });
        iconAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddNoteActivity.class);
                startActivity(intent);
            }
        });
    }

    /**
     * 初始化控件
     */
    private void initView() {
        linearLayout = (LinearLayout) view.findViewById(R.id.linearLayout);
        iconAdd = (ImageView) view.findViewById(R.id.icon_add);
    }


}
