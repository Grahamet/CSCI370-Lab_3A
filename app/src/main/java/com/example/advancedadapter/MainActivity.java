package com.example.advancedadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import model.Student;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    private Student one;
    private Student two;
    private Student three;
    private Student four;
    private Student five;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.student);
        one = new Student("Brownlee","Dart","Forensic Anthropology");
        two = new Student("McDonald","Riley", "Psychology");
        three = new Student("Bajo","Ka'ala", "Psychology");
        four = new Student("Brown", "Courtney", "Pathology");
        five = new Student("Hilsman","Robert","Biology");

        ArrayList<Student> students = new ArrayList<Student>(5);
        students.add(one);
        students.add(two);
        students.add(three);
        students.add(four);
        students.add(five);

        StudentAdapter adapter = new StudentAdapter(this, students);
        list.setAdapter(adapter);

        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String myToast = "You selected: " + students.get(position).getFirstname();
                Toast.makeText(getApplicationContext(),myToast,Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String mytoast = "You selected: " + students.get(position).getFirstname();
                Toast.makeText(getApplicationContext(),mytoast,Toast.LENGTH_SHORT).show();
            }
        });

    }
}