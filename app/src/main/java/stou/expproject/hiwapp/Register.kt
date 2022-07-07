package stou.expproject.hiwapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val loginPage = Intent(this,Login::class.java)

        findViewById<Button>(R.id.btnRegisterOnRegister).setOnClickListener {
            startActivity(loginPage)
        }
        findViewById<Button>(R.id.btnBackOnRegister).setOnClickListener {
            startActivity(loginPage)
        }

    }
}