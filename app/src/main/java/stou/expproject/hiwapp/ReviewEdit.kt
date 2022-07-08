package stou.expproject.hiwapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ReviewEdit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review_edit)


        val reviewListPage = Intent(this,ReviewList::class.java)
        val reviewDetailPage = Intent(this,ReviewDetail::class.java)
        val userDashboardPage = Intent(this,UserDashboard::class.java)

        findViewById<Button>(R.id.btnLogoutOnEdit).setOnClickListener {
            startActivity(reviewListPage)
        }
        findViewById<Button>(R.id.btnCancelOnEdit).setOnClickListener {
            startActivity(userDashboardPage)
        }
        findViewById<Button>(R.id.btnPostReviewOnEdit).setOnClickListener {
            startActivity(reviewDetailPage)
        }

    }
}