package stou.expproject.hiwapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.UserManager
import android.view.View
import android.widget.*
import com.google.firebase.database.FirebaseDatabase

class Login : AppCompatActivity() {

    private lateinit var txtUsername : EditText
    private lateinit var txtPassword : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val registerPage = Intent(this,Register::class.java)

        txtUsername = findViewById(R.id.inputUsername)
        txtPassword = findViewById(R.id.inputPassword)

        findViewById<Button>(R.id.btnLoginOnLogin).setOnClickListener {
            validateLogin()
        }

        findViewById<Button>(R.id.btnRegisterOnLogin).setOnClickListener {
            startActivity(registerPage)
        }


    } // On Create

    private fun validateLogin(){
        val userDashboardPage = Intent(this,UserDashboard::class.java)

        val user = txtUsername.text.toString().trim()
        val pass = txtPassword.text.toString().trim()
        if(user.isEmpty()){
            txtUsername.error = "กรุณาใส่ Username"
            return
        }
        if(pass.isEmpty()){
            txtUsername.error = "กรุณาใส่ Password"
            return
        }
        /*if(){
            startActivity(userDashboardPage)
        } else {
            Toast.makeText(this,"Bad combination, please try again.", Toast.LENGTH_LONG).show()
            txtUsername.text = null
            txtPassword.text = null
        }*/
    }
}