package stou.expproject.hiwapp

import android.content.Intent
import android.view.*
import android.widget.*
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val reviewList: ArrayList<ReviewItem>) : RecyclerView.Adapter<MyAdapter.MyViewHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.review_item, parent, false)

        itemView.setOnClickListener {
            val intent = Intent(parent.context,ReviewDetail::class.java)
            //intent.putExtra("thumb", reviewThumb)
            //intent.putExtra("title", reviewTitle)
            parent.context.startActivity(intent)
        }

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = reviewList[position]
        holder.reviewThumb.setBackgroundResource(currentItem.reviewThumb)
        holder.reviewTitle.text = currentItem.reviewTitle

        /*holder.reviewThumb.setOnClickListener(){
            val intent = Intent(this@MyAdapter,ReviewDetail::class.java)
            intent.putExtra("thumb", currentItem.reviewThumb)
            intent.putExtra("title", currentItem.reviewTitle)
            startActivity(intent)
        }*/
    }

    override fun getItemCount(): Int {
        return reviewList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val reviewThumb : ImageView = itemView.findViewById(R.id.reviewThumb)
        val reviewTitle : TextView = itemView.findViewById(R.id.reviewTitle)
    }
}
