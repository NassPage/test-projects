package com.nasserkh.testproject1.View.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.nasserkh.testproject1.Adapter.ClothAdapter;
import com.nasserkh.testproject1.FakeDataGenerator;
import com.nasserkh.testproject1.R;

public class ClotheFragment extends Fragment {
    private RecyclerView recyclerView;
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_clothe, container, false);
        recyclerView = view.findViewById(R.id.clotheRecycler);
        ClothAdapter clothAdapter = new ClothAdapter(getActivity(),
                FakeDataGenerator.getClothe(getActivity()));
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(clothAdapter);
        return view;
    }

    public static ClotheFragment newInstance() {
        
        Bundle args = new Bundle();
        
        ClotheFragment fragment = new ClotheFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
