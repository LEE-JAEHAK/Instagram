package com.example.instagram;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PersonAdapter extends BaseAdapter {

    ArrayList<Person> personList;
    LayoutInflater inflater;
    Context mContext;

    public PersonAdapter(ArrayList<Person> personList, Context context) {
        this.mContext = context;
        this.personList = personList;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return personList.size();
    }

    @Override
    public Person getItem(int position) {
        return personList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.item_data, parent, false);
        System.out.println(position);
        final Person person = personList.get(position);

        final TextView tvfriendname = convertView.findViewById(R.id.friendname);
        TextView tvfriendlocation = convertView.findViewById(R.id.friendlocation);
        TextView tvfavorite = convertView.findViewById(R.id.tvfavorite);
        TextView tvreplyname = convertView.findViewById(R.id.tvreplyname);
        TextView tvreply = convertView.findViewById(R.id.tvcomment);
        ImageButton ibmystory = convertView.findViewById(R.id.ibmystory);
        ImageView ivfriendtimeline = convertView.findViewById(R.id.ivfriendtimeline);

        ibmystory.setBackground(new ShapeDrawable(new OvalShape()));
        ibmystory.setClipToOutline(true);

        tvfriendname.setText(person.getFriendname());
        tvfriendlocation.setText(person.getFriendlocation());
        tvfavorite.setText(person.getTvfavorite());
        tvreplyname.setText(person.getTvreplyname());
        tvreply.setText(person.getTvreply());
        ibmystory.setImageDrawable(person.getIbmystory());
        ivfriendtimeline.setImageDrawable(person.getIvfriendtimeline());

        ImageButton more = convertView.findViewById(R.id.morebutton);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListDialog listDialog = new ListDialog(mContext, new ListDialog.clickListener() {
                    @Override
                    public void hideclick() {

                        personList.remove(position);
                        notifyDataSetChanged();
                    }

                    @Override
                    public void modifyclick() {
                        personList.get(position).setTvreply("수정되었습니다!");
                        notifyDataSetChanged();
                    }

                    @Override
                    public void hidefolerclick() {
                        Intent intent = new Intent(mContext,HideFolerActivity.class);
                        mContext.startActivity(intent);
                    }
                });
                listDialog.show();
            }
        });

        return convertView;
    }
}
