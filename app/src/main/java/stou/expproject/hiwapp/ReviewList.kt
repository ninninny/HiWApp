package stou.expproject.hiwapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ReviewList: AppCompatActivity() {

    private  lateinit var newRecyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_review)

        val loginPage = Intent(this,Login::class.java)
        val reviewDetail = Intent(this, ReviewDetail::class.java)

        findViewById<Button>(R.id.btnLoginOnList).setOnClickListener {
            startActivity(loginPage)
        }
        /* findViewById<Button>(R.id.btnTmpReviewDetail).setOnClickListener {
            startActivity(reviewDetail)
            //overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        }*/

        newRecyclerView = findViewById(R.id.recyclerReview)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        //newArrayList = arrayListOf<ReviewItem>()

        getReviewData()
    }

    private fun getReviewData() {

        val reviewData = ArrayList<ReviewItem>()
        val rs = ReviewService(reviewData)

        rs.add("review001", R.drawable.tmp_review_thumb, "Good Mate The Original Oatmilk")
        rs.add("review002", R.drawable.tmp_review_thumb, "Methee Cashew Nut")
        rs.add("review003", R.drawable.tmp_review_thumb, "Shinsen น้ำส้มคั้น 100%")

        newRecyclerView.adapter = MyAdapter(reviewData)
    }

}