package app.devstudysync.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import app.devstudysync.R;

public class KnowledgeFragment extends Fragment {

    public KnowledgeFragment(){
        super(R.layout.fragment_knowledge);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        ImageButton backButton = view.findViewById(R.id.backButton);

        backButton.setOnClickListener(v -> {
            NavHostFragment.findNavController(this).navigateUp();
        });
    }
}
