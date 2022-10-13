package com.example.drukzakar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;

public class zakarF extends Fragment{
    private TabLayout tabLayout;
    private ViewPager viewPager;
    ImageView imageView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_zakar, container, false);
        imageView = (ImageView) view.findViewById(R.id.imageView2);
        imageView.setImageResource(R.drawable.header);
        addFragment(view);
        return view;
    }
    private void addFragment(View view) {
        tabLayout = view.findViewById(R.id.tabLayout);
        viewPager = view.findViewById(R.id.viewpagerfrag);

        vpAdapter adapter = new vpAdapter(getChildFragmentManager());
        adapter.addFragment(new SelectDateFragment(), "Select Date");
        adapter.addFragment(new DzaongkhaFragment(), "Dzo");
        adapter.addFragment(new EnglishFragment(), "Eng");
        adapter.addFragment(new AudioFragment(), "Audio");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

}