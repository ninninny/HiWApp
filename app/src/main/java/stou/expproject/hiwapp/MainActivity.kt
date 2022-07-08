package stou.expproject.hiwapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val reviewList = Intent(this,ReviewList::class.java)

        Handler().postDelayed({
            startActivity(reviewList)
        }, 2000)

        /*findViewById<Button>(R.id.coverButton).setOnClickListener{
            startActivity(reviewList)
        }*/
    }
}