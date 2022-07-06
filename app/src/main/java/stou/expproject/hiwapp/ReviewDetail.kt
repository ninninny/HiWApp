package stou.expproject.hiwapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ReviewDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review_detail)

        val reviewList = Intent(this,ReviewList::class.java)
        val loginPage = Intent(this,Login::class.java)

        findViewById<Button>(R.id.btnLogin).setOnClickListener{
            startActivity(loginPage)
        }
        findViewById<Button>(R.id.btnAllReview).setOnClickListener{
            startActivity(reviewList)
        }

    }
}