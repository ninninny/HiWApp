package stou.expproject.hiwapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class UserDashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_dashboard)

        val reviewListPage = Intent(this,ReviewList::class.java)
        val reviewDetailPage = Intent(this, ReviewDetail::class.java)
        val reviewAddPage = Intent(this, ReviewAdd::class.java)

        findViewById<Button>(R.id.btnAllReviewOnUser).setOnClickListener {
            startActivity(reviewListPage)
        }
        findViewById<ImageButton>(R.id.btnAddReviewOnUser).setOnClickListener {
            startActivity(reviewAddPage)
        }

    }
}