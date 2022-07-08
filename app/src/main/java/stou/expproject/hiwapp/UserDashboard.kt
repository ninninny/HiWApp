package stou.expproject.hiwapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class UserDashboard : AppCompatActivity() {
    private  lateinit var newRecyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_dashboard)

        val reviewListPage = Intent(this,ReviewList::class.java)
        val reviewDetailPage = Intent(this, ReviewDetail::class.java)
        val reviewAddPage = Intent(this, ReviewAdd::class.java)

        val fromLoginName =intent.getStringExtra("name").toString()
        findViewById<TextView>(R.id.userNameOnDashboard).text = fromLoginName

        findViewById<Button>(R.id.btnAllReviewOnUser).setOnClickListener {
            startActivity(reviewListPage)
        }
        findViewById<ImageButton>(R.id.btnAddReviewOnUser).setOnClickListener {
            startActivity(reviewAddPage)
        }

        newRecyclerView = findViewById(R.id.recyclerUserReview)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        //getUserReviewData(fromLoginName)

    }

    private fun getUserReviewData(name:User) {

        val reviewData = ArrayList<ReviewItem>()
        val rs = ReviewService(reviewData)
        val user = name

        /*rs.add("review001", R.drawable.review_001, "Good Mate The Original Oatmilk",10, "", testUser)
        rs.add("review002", R.drawable.review_002, "Methee Cashew Nut",10, "", testUser)
        rs.add("review003", R.drawable.review_003, "Brave Roasters",10, "", testUser)
        rs.add("review003", R.drawable.review_004, "เลย์ รสเมี่ยงคำครบรส",10, "", testUser)
        rs.add("review003", R.drawable.review_005, "Shinsen น้ำส้มคั้น 100%",10, "", testUser)
        rs.add("review003", R.drawable.review_006, "ราเมนเบอร์เกอร์",10, "", testUser)
        rs.add("review003", R.drawable.review_007, "meiji Prime yan yan mixed berries and cheese",10, "", testUser)*/

        newRecyclerView.adapter = MyAdapter(reviewData)
    }
}

