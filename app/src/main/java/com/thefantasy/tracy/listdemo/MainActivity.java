package com.thefantasy.tracy.listdemo;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainActivity extends ListActivity {
    @BindView(R.id.desc)
    TextView jdesc;
    @BindView(R.id.img)
    TextView jimg;
    public String[] StringArray = {"tracy","gipson"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        TextView jtitle = (TextView) findViewById(R.id.title);
        ListView jlisty = (ListView) findViewById(R.id.listy);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.single_row,R.id.showTitle, StringArray);
        jlisty.setAdapter(adapter);

    }

}
