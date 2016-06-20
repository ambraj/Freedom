package com.quarkstar.freedom;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by Maneesh on 6/20/2016.
 */
public class HelpActicity extends Activity {
    RecyclerView recyclerView;
    HelpAdaptor adaptor;
    Spinner countrySpinner;
    ArrayAdapter<CharSequence> countryAdapter;
    Spinner citySpinner;
    ArrayAdapter<CharSequence> cityAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        countrySpinner = (Spinner) findViewById(R.id.countrySpinner);
        countryAdapter = ArrayAdapter.createFromResource(this, R.array.country_names, android.R.layout.simple_spinner_item);
        countryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        countrySpinner.setAdapter(countryAdapter);
//        countrySpinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//            }
//        });

        citySpinner = (Spinner) findViewById(R.id.countrySpinner);
        cityAdapter = ArrayAdapter.createFromResource(this, R.array.city_names, android.R.layout.simple_spinner_item);
        cityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        citySpinner.setAdapter(cityAdapter);
//        citySpinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//            }
//        });

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        adaptor = new HelpAdaptor(this, Data.getData());
        recyclerView.setAdapter(adaptor);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
