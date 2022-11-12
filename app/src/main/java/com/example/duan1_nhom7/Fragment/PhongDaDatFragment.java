package com.example.duan1_nhom7.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.duan1_nhom7.Adapter.BookedRoomAdapter;
import com.example.duan1_nhom7.Model.AppRoom;
import com.example.duan1_nhom7.R;


import java.util.ArrayList;


public class PhongDaDatFragment extends Fragment {
    RecyclerView recyclerBookedRoom;
    BookedRoomAdapter bookedRoomAdapter;
    ArrayList<AppRoom> list = new ArrayList<AppRoom>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_phong_da_dat,container,false);
        recyclerBookedRoom = view.findViewById(R.id.recyclerBookedRoom);

        list = new ArrayList<>();
        bookedRoomAdapter = new BookedRoomAdapter(getContext(),list);
//        recyclerBookedRoom.setAdapter(bookedRoomAdapter);

        return view;
    }

}