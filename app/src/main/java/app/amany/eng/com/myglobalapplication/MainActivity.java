package app.amany.eng.com.myglobalapplication;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import app.amany.eng.com.myglobalapplication.Fragments.*;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {

                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                        Fragment selectedFragment = null;
                        switch (item.getItemId()) {
                            case R.id.action_item1:
                                selectedFragment = fragment_home.newInstance();
                                break;
                            case R.id.action_item2:
                                selectedFragment = fragment_massage.newInstance();
                                break;
                            case R.id.action_item3:
                                selectedFragment = fragment_myprofile.newInstance();
                                break;
                            case R.id.action_item4:
                                selectedFragment = fragment_notifcation.newInstance();
                                break;
                            case R.id.action_item5:
                                selectedFragment = fragment_sitting.newInstance();
                                break;
                        }
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_layout, selectedFragment).addToBackStack(null);
                        transaction.commit();
                        return true;
                    }
                });

        //Manually displaying the first fragment - one time only
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout,fragment_home.newInstance());
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        if(getFragmentManager().getBackStackEntryCount()>0) {
            FragmentManager fm = getSupportFragmentManager();
            Log.e("eeeeeeee", (String.valueOf(getFragmentManager().getBackStackEntryCount())));
            fm.popBackStack();
        }
        else {
            super.onBackPressed();
        }
    }
}