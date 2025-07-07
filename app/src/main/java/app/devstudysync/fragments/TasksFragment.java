package app.devstudysync.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import app.devstudysync.R;
import app.devstudysync.adapters.TaskAdapter;
import app.devstudysync.data.TaskData;

public class TasksFragment extends Fragment {
    public TasksFragment(){
        super(R.layout.fragment_tasks);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        ImageButton backButton = view.findViewById(R.id.backButton);
        FloatingActionButton addButton = view.findViewById(R.id.addTaskButton);
        RecyclerView tasksList = view.findViewById(R.id.tasksRecyclerView);
        TaskAdapter adapter = new TaskAdapter(TaskData.taskList);
        tasksList.setAdapter(adapter);
        tasksList.setLayoutManager(new LinearLayoutManager(getContext()));

        backButton.setOnClickListener(v -> {
            NavHostFragment.findNavController(this).navigateUp();
        });

        addButton.setOnClickListener(v -> {
            NavHostFragment.findNavController(this).navigate(R.id.action_tasksFragment_to_addTaskFragment);
        });
    }
}
