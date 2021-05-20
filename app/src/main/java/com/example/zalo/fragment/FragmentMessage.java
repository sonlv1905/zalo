package com.example.zalo.fragment;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zalo.MainActivity;
import com.example.zalo.R;
import com.example.zalo.fragmentContact.FragmentTabAdapter;
import com.example.zalo.model.Message;

import java.util.ArrayList;
import java.util.List;


public class FragmentMessage extends Fragment {
    private RecyclerView rev;
    private RecyclerViewAdapter recyclerViewAdapter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rev = view.findViewById(R.id.rev);
        recyclerViewAdapter = new RecyclerViewAdapter((MainActivity) getActivity());
        recyclerViewAdapter.setData(getAll());
        DividerItemDecoration dividerHorizontal = new DividerItemDecoration((MainActivity) getActivity(), DividerItemDecoration.VERTICAL);
        rev.addItemDecoration(dividerHorizontal);
        rev.setAdapter(recyclerViewAdapter);
        rev.setLayoutManager(new LinearLayoutManager(view.getContext()));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_message, container, false);
    }
    public List<Message> getAll(){
        List<Message> list = new ArrayList<>();
        list.add(new Message(R.drawable.meo, "meo", "mo eo meo huyen meo", "1 hour"));
        list.add(new Message(R.drawable.meo1, "meo1", "mo eo meo huyen meo", "2 hours"));
        list.add(new Message(R.drawable.meo2, "meo2", "mo eo meo huyen meo", "7 hours"));
        list.add(new Message(R.drawable.meo3, "meo3", "mo eo meo huyen meo", "14 hours"));
        list.add(new Message(R.drawable.meo4, "meo4", "mo eo meo huyen meo", "Sun"));
        list.add(new Message(R.drawable.meo5, "meo5", "mo eo meo huyen meo", "Sat"));
        return list;
    }
}