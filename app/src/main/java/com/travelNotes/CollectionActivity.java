package com.travelNotes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.example.asus.travelnotes.R;
import com.travelNotes.util.ToolBarSet;

public class CollectionActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        Window window = getWindow();
        ToolBarSet.setBar(window);
        setContentView(R.layout.collection);

    }


}
