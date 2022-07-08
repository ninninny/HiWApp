package stou.expproject.hiwapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val reviewList: ArrayList<ReviewItem>) : RecyclerView.Adapter<MyAdapter.MyViewHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.review_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = reviewList[position]
        holder.reviewThumb.setImageResource(currentItem.reviewThumb)
        holder.reviewTitle.text = currentItem.reviewTitle
    }

    override fun getItemCount(): Int {
        return reviewList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val reviewThumb : ImageView = itemView.findViewById(R.id.reviewThumb)
        val reviewTitle : TextView = itemView.findViewById(R.id.reviewTitle)
    }
}
