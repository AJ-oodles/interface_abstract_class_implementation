package com.example.interface_abstract_class_implementation;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        employee employee = new employee("Abhishek",21 , "Associate consultant developer");
        Log.d("Employee", "Name: " + employee.getName());
        Log.d("Employee", "Age: " + employee.getAge());
        Log.d("Employee", "Designation: " + employee.getDesignation());
        employee.updateDesignation("Senior associate consultant developer");
        Log.d("Employee", "Updated Designation: " + employee.getDesignation());

    }
}