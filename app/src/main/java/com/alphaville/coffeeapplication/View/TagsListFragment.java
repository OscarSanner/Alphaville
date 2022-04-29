package com.alphaville.coffeeapplication.View;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alphaville.coffeeapplication.R;

import ViewModel.ReviewDataViewModel;

public class TagsListFragment extends Fragment {

    private RecyclerView tagsList;
    private ReviewDataViewModel viewModel;

    public TagsListFragment() {
        // Required empty public constructor
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tags_list, container, false);

        viewModel = new ReviewDataViewModel();


        initList(view);

        return view;
    }

    private void initList(View view){
        tagsList = view.findViewById(R.id.tagsList);
        tagsList.setLayoutManager(new LinearLayoutManager(this.getContext()));
    }

}