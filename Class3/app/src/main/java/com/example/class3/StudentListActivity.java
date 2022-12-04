package com.example.class3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import com.example.class3.model.Model;
import com.example.class3.model.Student;

import java.util.List;

public class StudentListActivity extends AppCompatActivity {

    List<Student> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);
        data = Model.instance().getAllStudents();

        ListView list = findViewById(R.id.studentList_listv);
        StudentListAdapter adapter = new StudentListAdapter();
        list.setAdapter(adapter);
//        list.getOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Log.d("TAG", "row: " + i);
//            }
//        })
    }

    class StudentListAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return data.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            Student st = data.get(i);

            if (view == null) {
                LayoutInflater inflater = getLayoutInflater();
                view = inflater.inflate(R.layout.student_list_row, null);
                CheckBox cb = view.findViewById(R.id.studentlistrow_cb);
                cb.setOnClickListener((_view) -> {
                    int pos = (int)_view.getTag();
                    Student _st = data.get(pos);
                    _st.checked = cb.isChecked();
                });
            }

            TextView nameTv = view.findViewById(R.id.studentlistrow_name_tv);
            nameTv.setText(st.name);

            TextView idTv = view.findViewById(R.id.studentlistrow_id_tv);
            idTv.setText(st.id);

            CheckBox cb = findViewById(R.id.studentlistrow_cb);
            cb.setChecked(st.checked);

            cb.setTag(i);
            return view;
        }
    }
}