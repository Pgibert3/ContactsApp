package edu.gatech.cs2340.contactsapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    private List<Contact> data;

    public static class ContactViewHolder extends RecyclerView.ViewHolder {
        private TextView nameView;
        private TextView numberView;

        public ContactViewHolder(View v) {
            super(v);
            nameView = v.findViewById(R.id.contact_name);
            numberView = v.findViewById(R.id.contact_number);
        }
    }

    public ContactAdapter(List<Contact> data) {
        this.data = data;
    }

    @Override
    public ContactAdapter.ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.contact_view, parent, false);

        return new ContactViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        holder.nameView.setText(
                data.get(position).getFirstName() + " " + data.get(position).getLastName());
        holder.numberView.setText(
                data.get(position).getPhoneNumber().toString());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}

