package app.devstudysync.fragments;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.google.android.material.button.MaterialButton;

import app.devstudysync.R;

public class HomeFragment extends Fragment {

    public HomeFragment(){
        super(R.layout.fragment_home);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        MaterialButton startButton = view.findViewById(R.id.startButton);
        MaterialButton knowledgeButton = view.findViewById(R.id.knowledgeButton);

        startButton.setOnClickListener(v -> {
            NavHostFragment.findNavController(this).navigate(R.id.action_homeFragment_to_tasksFragment);
        });

        knowledgeButton.setOnClickListener(v -> {
            NavHostFragment.findNavController(this).navigate(R.id.action_homeFragment_to_knowledgeFragment);
        });

    }
}
