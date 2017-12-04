package com.thefantasy.tracy.listdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.desc)
    TextView jdesc;
    @BindView(R.id.title)
    TextView jtitle;
    @BindView(R.id.img)
    TextView jimg;
    @BindView(R.id.listy)
    ListView jlisty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

}
