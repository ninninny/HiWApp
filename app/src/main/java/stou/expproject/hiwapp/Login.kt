package stou.expproject.hiwapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val registerPage = Intent(this,Register::class.java)
        val userDashboardPage = Intent(this,UserDashboard::class.java)

        findViewById<Button>(R.id.btnRegisterOnLogin).setOnClickListener {
            startActivity(registerPage)
        }
        findViewById<Button>(R.id.btnLoginOnLogin).setOnClickListener {
            startActivity(userDashboardPage)
        }

    }
}