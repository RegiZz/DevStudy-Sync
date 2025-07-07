package app.devstudysync.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

import app.devstudysync.R;
import app.devstudysync.data.TaskData;

public class AddTaskFragment extends Fragment {

    public AddTaskFragment(){
        super(R.layout.fragment_add_task);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        ImageButton backBtn = view.findViewById(R.id.backButton);
        MaterialButton saveTaskBtn = view.findViewById(R.id.saveTaskButton);

        TextInputEditText exerciseTitle = view.findViewById(R.id.taskTitleEditText);
        TextInputEditText exerciseDesc = view.findViewById(R.id.taskDescEditText);

        backBtn.setOnClickListener(v -> {
            NavHostFragment.findNavController(this).navigateUp();
        });

        saveTaskBtn.setOnClickListener(v -> {
            String title = exerciseTitle.getText().toString().trim();
            String desc = exerciseDesc.getText().toString().trim();
            if(title.isEmpty()){
                Snackbar.make(getView(), "Musisz wpisać coś w pole tytułu", Snackbar.ANIMATION_MODE_SLIDE).show();
            }
            else{
                TaskData.taskList.add(title);
                Snackbar.make(getView(), "Dodano zadanie", Snackbar.LENGTH_SHORT).show();
                NavHostFragment.findNavController(this).navigateUp();
            }
        });

    }
}
