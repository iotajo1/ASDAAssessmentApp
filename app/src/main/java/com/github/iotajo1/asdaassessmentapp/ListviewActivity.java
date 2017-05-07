package com.github.iotajo1.asdaassessmentapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JO_ on 5/7/2017.
 */

public class ListviewActivity extends AppCompatActivity {

    private ListView friends_list_view;
    private FriendsListAdapter adapter;
    private List<Friend> friendsList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        friends_list_view = (ListView)findViewById(R.id.friends_list_view);

        friendsList = new ArrayList<>();

        //add sample data for list
        friendsList.add(new Friend(1226423, "Aakaanksha Sahay", "Kansas City", "Architect"));
        friendsList.add(new Friend(4350697, "Bahuketu Salil", "New Orleans", "Software Developer"));
        friendsList.add(new Friend(6858643, "Aabharana Salaman ", "Las Vegas", "Hardware Engineer "));
        friendsList.add(new Friend(3506973, "Dadhivahana Wajid", "Los Angeles", "Fashion designer"));
        friendsList.add(new Friend(4414785, "Nabhas Nadir", "San Antonio", "Software Developer"));
        friendsList.add(new Friend(1226423, "Danvir Kapoor", "New York", "Web Developer "));
        friendsList.add(new Friend(9864423, "Chandranath Shah", "San Jose", "Hardware Engineer "));
        friendsList.add(new Friend(3506973, "Kalpana Iyer", "Des Moines", "Computer Support Specialist"));
        friendsList.add(new Friend(0236213, "Abhidyu Kalith", "Sierra Vista", "Software Developer"));
        friendsList.add(new Friend(3079723, "Eesha Deol", "Palm Springs", "Web Developer "));
        friendsList.add(new Friend(4286423, "Chandaka Malik", "Cape Coral", "Software Developer"));
        friendsList.add(new Friend(4015133, "Ekaja Nayak ", "San Jose", "Fashion designer"));
        friendsList.add(new Friend(2733373, "Madani Narayan", "Oak Ridge", "Software Developer"));
        friendsList.add(new Friend(4796423, "Aadhunik Karthik", "Los Angeles", "Desktop Publisher"));
        friendsList.add(new Friend(8634015, "Dayanidhi Alagiri", "El Paso", "Computer Support Specialist"));
        friendsList.add(new Friend(4886423, "Chaaruhaas Pillai", "San Jose", "Software Developer"));
        friendsList.add(new Friend(4726413, "Enakshi Deepinder", "Des Moines", "Human Resources Specialist"));
        friendsList.add(new Friend(4386423, "Abdul Azeez", "Presque Isle", "Architect"));
        friendsList.add(new Friend(8322691, "Ezhil oviyaa", "Las Cruces", "Computer Support Specialist"));
        friendsList.add(new Friend(4706423, "Bahiy Udeen ", "Port Blair", "Software Developer"));
        friendsList.add(new Friend(9861227, "Bahurai Kumar", "Kanya Kumari", "Hardware Engineer "));
        friendsList.add(new Friend(4786423, "Eesha Samar", "St. Lucie", "Desktop Publisher"));
        friendsList.add(new Friend(4286423, "Aadinath Nair", "San Antonio", "Hardware Engineer "));
        friendsList.add(new Friend(9020815, "Ekaja Kidae ", "Fort Worth", "Computer Support Specialist"));
        friendsList.add(new Friend(4786423, "Chaitanya Pillai", "Cape Coral", "Software Developer"));
        friendsList.add(new Friend(4796423, "Abdul Hameed", "Los Angeles", "Human Resources Specialist"));
        friendsList.add(new Friend(5790503, "Jagadambika Roku", "Boulder City", "Web Developer "));
        friendsList.add(new Friend(4886423, "Charuvardhana Kalai", "New Delhi", "Systems Analyst"));
        friendsList.add(new Friend(1226413, "Baladhitya Noor", "Rio Rancho", "Software Developer"));
        friendsList.add(new Friend(4386423, "Deepinder Shah", "Las Vegas", "Systems Analyst"));
        friendsList.add(new Friend(5992570, "Abalendu Pia", "St. Lucie", "Software Developer"));
        friendsList.add(new Friend(9866423, "Emma Thompson", "San Jose", "Computer Support Specialist"));
        friendsList.add(new Friend(1451615, "Mahubala Karki", "San Francisco", "Fashion designer"));
        friendsList.add(new Friend(2190423, "Eswari Dass", "San Francisco", "Human Resources Specialist"));
        friendsList.add(new Friend(4726423, "Jaheel hur", "San Francisco", "Web Developer "));
        friendsList.add(new Friend(6285623, "Jasleen Kaur", "Oklahoma City", "Fashion designer"));

        //init adapter
        adapter = new FriendsListAdapter(getApplicationContext(), friendsList);
        friends_list_view.setAdapter(adapter);

        friends_list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               //display message with phone from view.getTag
                Toast.makeText(getApplicationContext(), "Clicked Friend's Phone Number is : "+view.getTag(),Toast.LENGTH_LONG).show();
            }

        });

    }

}
