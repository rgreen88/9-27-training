package com.example.rynel.myapplication;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private EditText etFirstName;
    private EditText etLastName;
    List<Person> personList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void savePerson(View view) {
        String firstName = etFirstName.getText().toString();
        String lastName = etLastName.getText().toString();

        Person person = new Person(firstName, lastName);
        boolean isAdded = personList.add(person);

        if(isAdded)
            Toast.makeText(this, "Added", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Not Added", Toast.LENGTH_SHORT).show();
    }

    public void printPerson(View view)
    {
        for (Person p : personList) {
            Log.d(TAG, "printPersons: " + p.toString());
        }
    }

        public void goToSecond(View view)
        {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("data", "This is the data.");
            intent.putExtra("data1", "This is the data1.");
            intent.putExtra("data1", "This is the data2.");

        startActivity(intent);
        }
    }



