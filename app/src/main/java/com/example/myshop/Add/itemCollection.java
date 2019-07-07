package com.example.myshop.Add;



import java.util.ArrayList;

public class itemCollection {

    public static ArrayList<item> getitem() {
        ArrayList<item> events = new ArrayList<>();

        item s = new item();


        s.setTitle("Only Cartoon");

      //  s.setImage(R.drawable.dairy);
        events.add(s);



        s = new item();
        s.setTitle("Cartoon + box + pices");


        //s.setImage(R.drawable.dairy);
        events.add(s);



        s = new item();
        s.setTitle("cartoon + pices");

       // s.setImage(R.drawable.dairy);
        events.add(s);

        s = new item();
        s.setTitle("cartoon + lari + pices");

       // s.setImage(R.drawable.dairy);
        events.add(s);

        s = new item();
        s.setTitle("only bag");


       // s.setImage(R.drawable.dairy);
        events.add(s);

        s = new item();
        s.setTitle("bag + kg");


      //  s.setImage(R.drawable.dairy);
        events.add(s);



        return events;
    }
}
