package com.cs410g1.yoga;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;


public class MainMenu extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void doPositiveClick() {

        Settings.TOSAgreed = true;

        CheckBox check = (CheckBox)findViewById(R.id.TOS_check);

        check.setChecked(true);

    }

    public void doNegativeClick() {

        CheckBox check = (CheckBox)findViewById(R.id.TOS_check);

        check.setChecked(false);
    }

    public void TOSBoxClicked(View view) {

        CheckBox check = (CheckBox) view;
        check.setChecked(check.isChecked() ? false : true);
        DialogFragment dialog = TOSDialogFragment.newInstance(R.string.TOS_title);
        dialog.show(getSupportFragmentManager(), "TOSDialog");
    }
}
