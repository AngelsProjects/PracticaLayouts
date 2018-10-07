package me.wingsdevops.www.practicalayouts;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Snackbar snackbar;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_linear:
                    selectedFragment = new LinearFragment();
                    break;
                case R.id.navigation_relative:
                    selectedFragment = new RelativeFragment();
                    break;
                case R.id.navigation_constraint:
                    selectedFragment = new ConstraintFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new LinearFragment()).commit();
        }
    }

    public void onClickOne(View view) {
        snackbar = Snackbar
                .make(view, "You clicked the first button", Snackbar.LENGTH_SHORT);

        snackbar.show();
    }
    public void onClickTwo(View view) {
        snackbar = Snackbar
                .make(view, "You clicked the second button", Snackbar.LENGTH_SHORT);

        snackbar.show();
    }
    public void onClickThree(View view) {
        snackbar = Snackbar
                .make(view, "You clicked the third button", Snackbar.LENGTH_SHORT);

        snackbar.show();
    }
    public void onClickFour(View view) {
        snackbar = Snackbar
                .make(view, "You clicked the fourth button", Snackbar.LENGTH_SHORT);

        snackbar.show();
    }
    public void onClickFive(View view) {
        snackbar = Snackbar
                .make(view, "You clicked the fifth button", Snackbar.LENGTH_SHORT);

        snackbar.show();
    }
    public void onClickSix(View view) {
        snackbar = Snackbar
                .make(view, "You clicked the sixth button", Snackbar.LENGTH_SHORT);

        snackbar.show();
    }
    public void onClickSeven(View view) {
        snackbar = Snackbar
                .make(view, "You clicked the seventh button", Snackbar.LENGTH_SHORT);

        snackbar.show();
    }
    public void onClickEight(View view) {
        snackbar = Snackbar
                .make(view, "You clicked the eighth button", Snackbar.LENGTH_SHORT);

        snackbar.show();
    }
    public void onClickNine(View view) {
        snackbar = Snackbar
                .make(view, "You clicked the ninth button", Snackbar.LENGTH_SHORT);

        snackbar.show();
    }
}
