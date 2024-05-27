package com.example.secondlaboratorywork;

import android.content.Context;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MyAdapter extends AdapterView {
    ListView myListView;

    public MyAdapter(Context context) {
        super(context);
    }

    @Override
    public Adapter getAdapter() {
        return null;
    }

    @Override
    public void setAdapter(Adapter adapter) {
        ArrayList<String> myStringArray = new ArrayList<String>();
        ArrayAdapter<String> myAdapterInstance;

        int layoutID = android.R.layout.simple_list_item_1;
        myAdapterInstance = new ArrayAdapter<String>(this.getContext(), layoutID, myStringArray);

        myListView.setAdapter(myAdapterInstance);
    }

    @Override
    public View getSelectedView() {
        return null;
    }

    @Override
    public void setSelection(int position) {

    }
}
