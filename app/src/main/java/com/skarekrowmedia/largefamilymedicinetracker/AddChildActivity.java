package com.skarekrowmedia.largefamilymedicinetracker;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.skarekrowmedia.largefamilymedicinetracker.databinding.ActivityAddChildBinding;

public class AddChildActivity extends AppCompatActivity {

    private ActivityAddChildBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAddChildBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}