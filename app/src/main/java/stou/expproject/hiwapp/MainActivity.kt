package stou.expproject.hiwapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val reviewList = Intent(this,ReviewList::class.java)

        findViewById<Button>(R.id.coverButton).setOnClickListener{
            startActivity(reviewList)
        }
    }
}