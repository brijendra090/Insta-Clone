package com.crackcode.instaclone;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.crackcode.instaclone.ui.home.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ImageView camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.navigation_home) {
                    HomeFragment homeFragment = new HomeFragment();
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.nav_host_fragment, homeFragment);
                    transaction.commit();
                }

                else if (item.getItemId() == R.id.navigation_search) {
                    Toast.makeText(MainActivity.this, "Search will attach soon", Toast.LENGTH_SHORT).show();
                }

                else if (item.getItemId() == R.id.navigation_post) {
                    Toast.makeText(MainActivity.this, "Post will attach soon", Toast.LENGTH_SHORT).show();
                }

                else if (item.getItemId() == R.id.navigation_likes) {
                    Toast.makeText(MainActivity.this, "Notification will attach soon", Toast.LENGTH_SHORT).show();
                }

                else if (item.getItemId() == R.id.navigation_profile) {
                    Toast.makeText(MainActivity.this, "Profile will attach soon", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        camera = findViewById(R.id.camera);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This feature will attach soon", Toast.LENGTH_SHORT).show();
            }
        });
    }

}