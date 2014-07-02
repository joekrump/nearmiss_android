package com.near_miss.app;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);

        mTitle = getTitle();

    }

    public void loginAdmin(View view) {
        EditText username;
        EditText password;

        username = (EditText) findViewById(R.id.login_username_field);
        password = (EditText) findViewById(R.id.login_password_field); // not yet used.

        //TODO: implement login authentication

        if(username.getText().toString().equals("admin")){
            // login user by name of 'admin' regardless of password value (FOR TESTING PURPOSES ONLY)

        } else {
            Toast.makeText(getApplicationContext(), "Wrong Credentials. You must login with username \'Admin\'",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }
}
