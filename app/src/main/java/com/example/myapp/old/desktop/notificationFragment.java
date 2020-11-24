package com.example.myapp.old.desktop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapp.old.R;
import com.example.myapp.old.desktop.adapter.NotificationAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link notificationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class notificationFragment extends Fragment {
    String[] notifyPerson = {"隔壁老吳","曹汶龍醫師", "施慧玲教授", "國立中正大學"};
    String[] notifyActivities = {"邀請你一起下棋","邀請你去記憶保養班","邀請你去長者人權門診","邀請你一同上課"};
    int[] notifyImages = {R.drawable.wu,R.drawable.person_docter,R.drawable.person_shi,R.drawable.ccu};

    RecyclerView recyclerView;

    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public notificationFragment() {
        // Required empty public constructor
    }

    public static notificationFragment newInstance(String param1, String param2) {
        notificationFragment fragment = new notificationFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notification, container, false);
        recyclerView = view.findViewById(R.id.notification_RecyclerView);

        NotificationAdapter notificationAdapter = new NotificationAdapter(getContext(),notifyPerson,notifyActivities,notifyImages);
        recyclerView.setAdapter(notificationAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }
}