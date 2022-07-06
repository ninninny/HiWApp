package stou.expproject.hiwapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class ReviewList: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_review)

        val loginPage = Intent(this,Login::class.java)

        findViewById<Button>(R.id.btnLogin).setOnClickListener{
            startActivity(loginPage)
        }

    }
}