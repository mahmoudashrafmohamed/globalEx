package app.amany.eng.com.myglobalapplication;


import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class Actions_Activity  extends AppCompatActivity {
    private RecyclerView recyclerView;
    private actionsAdapter adapter;
    private Button button1;
    Context con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itmes_recycler1);
        con=this;
        button1=(Button) findViewById(R.id.spinn);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                AlertDialog.Builder b = new AlertDialog.Builder(con);
                b.setTitle("Example");
                String[] types = {"By Zip", "By Category"};
                b.setItems(types, new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                        switch(which){
                            case 0:
                                Toast.makeText(getApplicationContext(),"SMILE MY FRIEND :))",Toast.LENGTH_LONG).show();
                                break;
                            case 1:

                                break;
                        }
                    }

                });

                b.show();
            }
        });


        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(con);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<String> a = new ArrayList<>();
        a.add("اماني عبدالله");
        a.add("سها محمد");
        a.add("منار احمد");
        a.add("جميلة سامح");
        a.add("احمد احمد.");
        a.add("محمد محمد");
        a.add("رامي رامي");

        adapter = new actionsAdapter(a, con);
        recyclerView.setAdapter(adapter);

        adapter.notifyDataSetChanged();


    }
}