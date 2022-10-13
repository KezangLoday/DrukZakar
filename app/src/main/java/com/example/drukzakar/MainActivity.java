package com.example.drukzakar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    zakarF zakarFrag = new zakarF();
    CalenderF calenderF = new CalenderF();
    DathoF dathoF = new DathoF();
    AboutUsF aboutUsF = new AboutUsF();
    ContactF contactF = new ContactF();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.botNav);

        // to set default view when app is opened
        getSupportFragmentManager().beginTransaction().replace(R.id.container,zakarFrag).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.zakar:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,zakarFrag).commit();
                        return true;
                    case R.id.calender:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,calenderF).commit();
                        return true;
                    case R.id.datho:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,dathoF).commit();
                        return true;
                    case R.id.aboutus:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,aboutUsF).commit();
                        return true;
                    case R.id.contact:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,contactF).commit();
                        return true;

                }
                return false;
            }
        });
    }
}