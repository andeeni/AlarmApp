package com.andeeni.alarmapp.ui.alarms;

import android.app.AlarmManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.andeeni.alarmapp.R;

import static android.content.Context.ALARM_SERVICE;

public class AlarmsFragment extends Fragment {

    private AlarmsViewModel alarmsViewModel;
    AlarmManager alarm_manager;
    TimePicker alarm_timepicker;
    TextView update_text;
    Context context;



    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);


//        alarm_manager=(AlarmManager) getSystemService(ALARM_SERVICE);
    }



    public View onCreateView(@NonNull LayoutInflater inflater,@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_alarms, container, false);

        alarmsViewModel = new ViewModelProvider(this).get(AlarmsViewModel.class);
        final TextView textView = root.findViewById(R.id.alarm_on);
        //

        alarm_timepicker=root.findViewById(R.id.alarmTimePicker);
        //
        alarmsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }



}