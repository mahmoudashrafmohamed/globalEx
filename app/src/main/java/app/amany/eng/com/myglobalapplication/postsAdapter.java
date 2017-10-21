package app.amany.eng.com.myglobalapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;



 class postsAdapter extends RecyclerView.Adapter<postsAdapter.MyViewHolder> {

    ArrayList<String>  arr;
    Context context;

    public postsAdapter(ArrayList<String> arr  , Context context) {
        this.arr = arr;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView =LayoutInflater.from(context).inflate(R.layout.row_item1_actions, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
   //   holder.name_tv.setText(arr.get(position));
    }

    @Override
    public int getItemCount() {
        return arr.size();
    }





    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name_tv;



        public MyViewHolder(final View itemView) {
            super(itemView);
        //  name_tv = (TextView) itemView.findViewById(R.id.recycler_view);


        }
    }
    /*
    public void removeItem(int position) {
        cartList.remove(position);
        // notify the item removed by position
        // to perform recycler view delete animations
        // NOTE: don't call notifyDataSetChanged()
        notifyItemRemoved(position);
    }

    public void restoreItem(Item item, int position) {
        cartList.add(position, item);
        // notify item added by position
        notifyItemInserted(position);
    }
*/
}
