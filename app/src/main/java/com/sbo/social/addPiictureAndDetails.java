package com.sbo.social;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class addPiictureAndDetails extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("TheImageDetails");
    EditText Link, Detail;
    Button Add;
    News_Thread thread = new News_Thread();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_piicture_and_details);

        InitializeAndSaveToFirebase();
    }
    protected void InitializeAndSaveToFirebase(){
        Link = findViewById(R.id.editTextAddLink);
        Detail = findViewById(R.id.editTextAddDetails);
        Add = findViewById(R.id.button_Add);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thread.setDetials(Detail.getText() + "");
                thread.setImageLink(Link.getText() + "");

                Send_Class_To_DataBase();
            }
        });
    }
    protected void Send_Class_To_DataBase(){
        myRef.push().setValue(thread);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}