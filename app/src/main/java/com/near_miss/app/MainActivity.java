package com.near_miss.app;

import android.app.Activity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by DJ on 7/2/2014.
 */
public class MainActivity extends ActionBarActivity {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_menu);


        mTitle = getTitle();

        restoreActionBar();

        // Check that the activity is using the layout version with
        // the fragment_container FrameLayout
        if (findViewById(R.id.container) != null) {

            // However, if we're being restored from a previous state,
            // then we don't need to do anything and should return or else
            // we could end up with overlapping fragments.
            if (savedInstanceState != null) {
                return;
            }

            // Create a new Fragment to be placed in the activity layout
            LoginFragment firstFragment = new LoginFragment();

            // In case this activity was started with special instructions from an
            // Intent, pass the Intent's extras to the fragment as arguments
            firstFragment.setArguments(getIntent().getExtras());

            // Add the fragment to the 'fragment_container' FrameLayout
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, firstFragment).commit();
        }
    }

    public void loginAdmin(View view) {
        EditText username;
        EditText password;

        username = (EditText) findViewById(R.id.login_username_field);
        password = (EditText) findViewById(R.id.login_password_field); // not yet used.

        //TODO: implement login authentication

        if(username.getText().toString().equals("admin")){

            // login user by name of 'admin' regardless of password value (FOR TESTING PURPOSES ONLY)
            // Redirect view
            // Create fragment and give it an argument specifying the article it should show
            TicketCreateFragment newFragment = new TicketCreateFragment();
            Bundle args = new Bundle();
            args.putInt(newFragment.ARG_SECTION_NUMBER, 1);
            newFragment.setArguments(args);

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack so the user can navigate back
            transaction.replace(R.id.container, newFragment);
            transaction.addToBackStack("ticket_create");

            // Commit the transaction
            transaction.commit();

        } else {
            Toast.makeText(getApplicationContext(), "Wrong Credentials. You must login with username \'Admin\'",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }
}
