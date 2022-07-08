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

        /*val rs = ReviewService(reviewData)
        val testUser = User("EatLikeAStrom", "testtest", "test@test.com")

        rs.add("review001", R.drawable.review_001, "Good Mate The Original Oatmilk",10, "", testUser)
        rs.add("review002", R.drawable.review_002, "Methee Cashew Nut",10, "", testUser)
        rs.add("review003", R.drawable.review_003, "Brave Roasters",10, "", testUser)
        rs.add("review003", R.drawable.review_004, "เลย์ รสเมี่ยงคำครบรส",10, "", testUser)
        rs.add("review003", R.drawable.review_005, "Shinsen น้ำส้มคั้น 100%",10, "", testUser)
        rs.add("review003", R.drawable.review_006, "ราเมนเบอร์เกอร์",10, "", testUser)
        rs.add("review003", R.drawable.review_007, "meiji Prime yan yan mixed berries and cheese",10, "", testUser)*/

        newRecyclerView.adapter = MyAdapter(reviewData)
    }

}