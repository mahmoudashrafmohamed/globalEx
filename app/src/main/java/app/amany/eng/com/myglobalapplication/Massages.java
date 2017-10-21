package app.amany.eng.com.myglobalapplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import java.util.ArrayList;

public class Massages extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private postsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.massage_recycler3);

        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        ArrayList<String> a = new ArrayList<>();
        a.add("اماني عبدالله");
        a.add("سها محمد");
        a.add("منار احمد");
        a.add("جميلة سامح");
        a.add("احمد احمد.");
        a.add("محمد محمد");
        a.add("رامي رامي");

        adapter = new postsAdapter(a, this);
        mRecyclerView.setAdapter(adapter);




             /*
         Add a touch helper to the RecyclerView to recognize when a user swipes to delete an item.
         An ItemTouchHelper enables touch behavior (like swipe and move) on each ViewHolder,
         and uses callbacks to signal when a user is performing these actions.
         */
        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                return false;
            }

            // Called when a user swipes left or right on a ViewHolder
            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int swipeDir) {
                // Here is where you'll implement swipe to delete
            }
        }).attachToRecyclerView(mRecyclerView);
        adapter.notifyDataSetChanged();


    }
}
