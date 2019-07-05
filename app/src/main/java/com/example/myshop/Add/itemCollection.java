package com.example.myshop.Add;



import com.example.myshop.R;

import java.util.ArrayList;

public class itemCollection {

    public static ArrayList<item> getitem() {
        ArrayList<item> events = new ArrayList<>();

        item s = new item();


        s.setTitle("Type1");

        s.setImage(R.drawable.dairy);
        events.add(s);



        s = new item();
        s.setTitle("Type2");


        s.setImage(R.drawable.dairy);
        events.add(s);



        s = new item();
        s.setTitle("Type3");

        s.setImage(R.drawable.dairy);
        events.add(s);

        s = new item();
        s.setTitle("Type4");

        s.setImage(R.drawable.dairy);
        events.add(s);

        s = new item();
        s.setTitle("Type5");


        s.setImage(R.drawable.dairy);
        events.add(s);

        s = new item();
        s.setTitle("Typet6");


        s.setImage(R.drawable.dairy);
        events.add(s);



        return events;
    }
}
