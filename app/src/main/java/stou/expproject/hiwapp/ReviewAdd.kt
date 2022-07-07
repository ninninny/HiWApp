package stou.expproject.hiwapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ReviewAdd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review_add)

        //val loginPage = Intent(this,Login::class.java)
        val reviewListPage = Intent(this,ReviewList::class.java)
        val reviewDetailPage = Intent(this,ReviewDetail::class.java)
        val userDashboardPage = Intent(this,UserDashboard::class.java)

        findViewById<Button>(R.id.btnLogoutOnAdd).setOnClickListener {
            startActivity(reviewListPage)
        }
        findViewById<Button>(R.id.btnCancelOnAdd).setOnClickListener {
            startActivity(userDashboardPage)
        }
        findViewById<Button>(R.id.btnPostReviewOnAdd).setOnClickListener {
            startActivity(reviewDetailPage)
        }

    }
}