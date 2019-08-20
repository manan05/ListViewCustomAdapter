package com.example.listviewcustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Teacher> teachers = Teacher.get8RandomTeachers();
    ListView lvTeachers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvTeachers = findViewById(R.id.lvTeachers);
        TeacherAdapter teacherAdapter = new TeacherAdapter(); // Created a new custom adapter
        lvTeachers.setAdapter(teacherAdapter);
    }

    class TeacherAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return teachers.size(); // Total size of the data
        }

        @Override
        public Teacher getItem(int position) {
            return teachers.get(position); // Will go to that position and get the data
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView = getLayoutInflater().inflate(
                    R.layout.list_item_teacher,
                    parent, false
            );
            TextView tvName = itemView.findViewById(R.id.tvName);
            TextView tvCourse = itemView.findViewById(R.id.tvCourse);
            tvName.setText(getItem(position).getName());
            tvCourse.setText(getItem(position).getCourse());

            return itemView;
        }
    }
}
