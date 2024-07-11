package com.example.menu;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.menu.R;
import com.google.android.material.navigation.NavigationView;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.createfile) {
            Toast.makeText(MainActivity.this, "Create File", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.newfile) {
            Toast.makeText(MainActivity.this, "New File", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.save) {
            Toast.makeText(MainActivity.this, "Save", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.settings) {
            Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
