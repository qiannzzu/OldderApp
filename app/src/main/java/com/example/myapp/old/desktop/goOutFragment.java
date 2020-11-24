package com.example.myapp.old.desktop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapp.old.R;
import com.example.myapp.old.desktop.adapter.GoOutAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link goOutFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class goOutFragment extends Fragment {
    String goOutActiviyies[]={"去公園","去下棋","去兒子家"};
    int[] goOutImages = {R.drawable.wu,R.drawable.person_docter,R.drawable.person_shi};
    RecyclerView recyclerView;
    public goOutFragment() {
        // Required empty public constructor
    }

    public static goOutFragment newInstance(String param1, String param2) {
        goOutFragment fragment = new goOutFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_go_out, container, false);
        recyclerView = view.findViewById(R.id.goOut_RecyclerView);
        GoOutAdapter goOutAdapter = new GoOutAdapter(getContext(),goOutActiviyies,goOutImages);
        recyclerView.setAdapter(goOutAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }
}