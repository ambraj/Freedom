package com.quarkstar.freedom;

import java.util.ArrayList;

/**
 * Created by Maneesh on 6/19/2016.
 */
public class Data {
    public  static ArrayList<Information> getData() {
        ArrayList<Information> data = new ArrayList<>();
        int[] images = {
                R.drawable.police,
                R.drawable.ambulance,
                R.drawable.hospital,
                R.drawable.firedepartment,
                R.drawable.medicalstore
        };

        String[] titals = {"Police  tel: 100 ", "Ambulance  tel: 101 ", "Hospital  tel: 1002",
                "Fire Department   tel: 105", "Medical Store  tel: 1005"};

        for(int i=0;i< images.length;i++)
        {
            Information information=new Information();
            information.imageId=images[i];
            information.tital=titals[i];
            data.add(information);
        }
        return data;
    }

 }
