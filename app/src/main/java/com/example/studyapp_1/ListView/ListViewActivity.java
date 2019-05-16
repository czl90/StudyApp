package com.example.studyapp_1.ListView;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.studyapp_1.R;

public class ListViewActivity extends Activity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView=findViewById(R.id.listView_1);
        listView.setAdapter(new MyListAdapter(ListViewActivity.this));
    }
}
