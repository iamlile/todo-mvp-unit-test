package com.example.android.architecture.blueprints.todoapp.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.android.architecture.blueprints.todoapp.R;

/**
 * Created by lee on 16/8/27.
 */
public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_activity);

        final View button = findViewById(R.id.login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(WelcomeActivity.this, AddEditTaskActivity.class));
                System.out.println("start onClick");
            }
        });
    }
}
