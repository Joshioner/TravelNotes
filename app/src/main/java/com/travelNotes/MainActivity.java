package com.travelNotes;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.asus.travelnotes.R;
import com.travelNotes.fragment.CustomViewPager;
import com.travelNotes.fragment.MyFragmentPagerAdapter;
import com.travelNotes.fragment.homePage_Fragment;
import com.travelNotes.fragment.me_Fragment;
import com.travelNotes.fragment.note_Fragment;
import com.travelNotes.util.ToolBarSet;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener,RadioGroup.OnCheckedChangeListener{

    private RadioGroup botton_bar;
    private RadioButton homePage;   //首页announce
    private RadioButton note;      //游记
    private RadioButton me;       //我的
    private CustomViewPager viewPager;
    private List<Fragment> fragmentList;
    private MyFragmentPagerAdapter myFragmentPagerAdapter;

    //几个代表页面的常量
    public static final int PAGE_ONE = 0;
    public static final int PAGE_TWO = 1;
    public static final int PAGE_THREE = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        Window window = getWindow();
        ToolBarSet.setBar(window);
        setContentView(R.layout.activity_main);

        //初始化Radio按钮
        initRadio();

        InitView();
        myFragmentPagerAdapter=new MyFragmentPagerAdapter(getSupportFragmentManager(),fragmentList);
        viewPager.setAdapter(myFragmentPagerAdapter);
        viewPager.setCurrentItem(0);
        homePage.setChecked(true);
        InitEvent();

    }
    private void InitEvent() {
        botton_bar.setOnCheckedChangeListener(this);
        viewPager.setOnTouchListener(this);
    }
    private void InitView() {
        botton_bar = (RadioGroup) findViewById(R.id.bottom_bar);
        homePage = (RadioButton) findViewById(R.id.homePage);
        note = (RadioButton) findViewById(R.id.note);
        me = (RadioButton) findViewById(R.id.me);
        viewPager= (CustomViewPager) findViewById(R.id.vpager);

        fragmentList = new ArrayList<>();
        fragmentList.add(new homePage_Fragment());
        fragmentList.add(new note_Fragment());
        fragmentList.add(new me_Fragment());
    }

    private void initRadio() {
        RadioButton homePage = (RadioButton) findViewById(R.id.homePage);
        RadioButton notePage = (RadioButton) findViewById(R.id.note);
        RadioButton mePage = (RadioButton) findViewById(R.id.me);

        //定义底部标签图片大小和位置
        Drawable home_page_draw = getResources().getDrawable(R.drawable.home_page);
        //当这个图片被绘制时，给他绑定一个矩形 ltrb规定这个矩形
        home_page_draw.setBounds(0, 0, 40, 40);
        //设置图片在文字的哪个方向
        homePage.setCompoundDrawables(null, home_page_draw, null, null);

        //定义底部标签图片大小和位置
        Drawable note_draw = getResources().getDrawable(R.drawable.note);
        //当这个图片被绘制时，给他绑定一个矩形 ltrb规定这个矩形
        note_draw.setBounds(0, 0, 40, 40);
        //设置图片在文字的哪个方向
        notePage.setCompoundDrawables(null, note_draw, null, null);


        //定义底部标签图片大小和位置
        Drawable  me_draw = getResources().getDrawable(R.drawable.me);
        //当这个图片被绘制时，给他绑定一个矩形 ltrb规定这个矩形
        me_draw.setBounds(0, 0, 40, 40);
        //设置图片在文字的哪个方向
        mePage.setCompoundDrawables(null, me_draw, null, null);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return true;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        switch (checkedId)
        {
            case R.id.homePage:
                viewPager.setCurrentItem(PAGE_ONE,false);
                break;
            case R.id.note:
                viewPager.setCurrentItem(PAGE_TWO,false);
                break;
            case R.id.me:
                viewPager.setCurrentItem(PAGE_THREE,false);
                break;
        }
    }
}
