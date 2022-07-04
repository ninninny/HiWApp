package stou.expproject.hiwapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.textView).text = "Welcome to the new activity"

    }
}