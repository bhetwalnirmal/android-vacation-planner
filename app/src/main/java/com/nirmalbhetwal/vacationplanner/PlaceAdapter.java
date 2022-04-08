package com.nirmalbhetwal.vacationplanner;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class PlaceAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Country> countries;

    public PlaceAdapter(Context context, ArrayList<Country> countries) {
        this.context = context;
        this.countries = countries;
    }

    @Override
    public int getCount() {
        return countries.size();
    }

    @Override
    public Object getItem(int i) {
        return countries.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }

    static class ViewHolder {

    }
}
