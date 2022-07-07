package stou.expproject.hiwapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class ReviewList: AppCompatActivity() {

    private  lateinit var newRecyclerView : RecyclerView
    private  lateinit var newArrayList: ArrayList<ReviewItem>
    private var imageID = arrayOf(
        R.drawable.tmp_review_thumb,
        R.drawable.tmp_review_thumb,
        R.drawable.tmp_review_thumb
    )
    private var titleText = arrayOf(
        "หวานๆ อร่อยๆ ลองกองซักโลมั้ยจ๊ะ",
        "หวานๆ อร่อยๆ ลองกองซักโลมั้ยจ๊ะ",
        "หวานๆ อร่อยๆ ลองกองซักโลมั้ยจ๊ะ"
    )

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_review)

        val loginPage = Intent(this,Login::class.java)
        val reviewDetail = Intent(this, ReviewDetail::class.java)

        findViewById<Button>(R.id.btnLoginOnList).setOnClickListener {
            startActivity(loginPage)
        }
        findViewById<Button>(R.id.btnTmpReviewDetail).setOnClickListener {
            startActivity(reviewDetail)
            //overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        }

        /*newRecyclerView = findViewById(R.id.recyclerReview)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<ReviewItem>()
        //newArrayList = arrayListOf()
        getUserData()*/
    }

    private fun getUserData() {
        for(i in imageID.indices){
            val reviewItem = ReviewItem(imageID[i], titleText[i])
            newArrayList.add(reviewItem)
        }

        newRecyclerView.adapter = MyAdapter(newArrayList)
    }

}