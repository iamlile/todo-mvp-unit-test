package com.example.android.architecture.blueprints.todoapp.junit.robolectric;

import android.content.Intent;

import com.example.android.architecture.blueprints.todoapp.BuildConfig;
import com.example.android.architecture.blueprints.todoapp.R;
import com.example.android.architecture.blueprints.todoapp.activity.WelcomeActivity;
import com.example.android.architecture.blueprints.todoapp.addedittask.AddEditTaskActivity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.robolectric.Shadows.shadowOf;

/**
 * Created by lee on 16/8/27.
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 22)
public class WelcomeActivityUnitTest {

    @Test
    public void clickingLogin_shouldStartLoginActivity() {
        WelcomeActivity activity = Robolectric.setupActivity(WelcomeActivity.class);
        activity.findViewById(R.id.login).performClick();

        Assert.assertTrue(activity.findViewById(R.id.login).performClick());

        Intent expectedIntent = new Intent(activity, AddEditTaskActivity.class);

        Intent intent = shadowOf(activity).getNextStartedActivity();

        System.out.println("intent:"+ intent);
        System.out.println("expectedIntent:"+ expectedIntent);

        //Assert.assertEquals(intent, expectedIntent);



    }
}