package com.github.iotajo1.asdaassessmentapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by JO_ on 5/7/2017.
 */

public class FriendsListAdapter extends BaseAdapter {
    private Context context;
    private List<Friend> friendsList;

    //constructor
    public FriendsListAdapter(Context context, List<Friend> friendsList) {
        this.context = context;
        this.friendsList = friendsList;
    }

    @Override
    public int getCount() {
        return friendsList.size();
    }

    @Override
    public Object getItem(int position) {
        return friendsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(context, R.layout.activity_friendslist, null);
        TextView textView_friends_name = (TextView)view.findViewById(R.id.textView_friends_name);
        TextView textView_friends_place = (TextView)view.findViewById(R.id.textView_friends_place);
        TextView textView_friends_job = (TextView)view.findViewById(R.id.textView_friends_job);

        //set text for textview
        textView_friends_name.setText(friendsList.get(position).getName());
        textView_friends_place.setText(String.valueOf(friendsList.get(position).getPlace())+"");
        textView_friends_job.setText(friendsList.get(position).getJob());

        //save product id to tag
        view.setTag(friendsList.get(position).getPhone());

        return view;
    }
}
