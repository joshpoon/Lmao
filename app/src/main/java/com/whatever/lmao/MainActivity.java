package com.whatever.lmao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		String[] name = {"a", "b", "c", "d", "e"};
		String[] DOB = {"when Jesus died", "fall of Rome" , "last episode of Rick and Morty" , "2" , "3"};
		String[] status = {"q" , "w" , "e" , "r" , "t"};
		int[] grade = {777, 6+1 , 1 , 3 , 69};
		boolean[] boy = {true , false , false , false , false};

		Student[] students = new Student[5];

		Student temp;
		for (int i = 0; i < 5; i++) {
			temp = new Student();
			temp.setName(name[i]);//this is bullshit
			temp.setDOB(DOB[i]);
			temp.setStatus(status[i]);
			temp.setGrade(grade[i]);
			temp.setBoy(boy[i]);
			students[i] = temp;
		}

		ListView listView = (ListView) findViewById(R.id.list);

		ArrayAdapter<Student> adapter;
		adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, students);
		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Toast.makeText(MainActivity.this, ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
			}
		});

		listView.setAdapter(adapter);
	}
}
