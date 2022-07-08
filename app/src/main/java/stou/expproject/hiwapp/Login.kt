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
        val reviewList = Intent(this,ReviewList::class.java)

        txtUsername = findViewById(R.id.inputUsername)
        txtPassword = findViewById(R.id.inputPassword)

        findViewById<Button>(R.id.btnLoginOnLogin).setOnClickListener {
            validateLogin()
        }

        findViewById<Button>(R.id.btnRegisterOnLogin).setOnClickListener {
            startActivity(registerPage)
        }

        findViewById<TextView>(R.id.btnBackOnLogin).setOnClickListener {
            startActivity(reviewList)
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
            txtPassword.error = "กรุณาใส่ Password"
            return
        }

        val memberData = HashMap<String, User>()
        val ms = MemberService(memberData)

        val fromRegName =intent.getStringExtra("name").toString()
        val fromRegPass =intent.getStringExtra("pass").toString()
        val fromRegEmail =intent.getStringExtra("email").toString()
        ms.register(fromRegName,fromRegPass,fromRegEmail)

        ms.register("EatLikeAStrom","testtest","test@test.com")

        val member = ms.login(user,pass)
        //startActivity(userDashboardPage)
        if(member == User("unknown")){
            Toast.makeText(this,"Bad combination, please try again.", Toast.LENGTH_LONG).show()
            txtUsername.text = null
            txtPassword.text = null
            return
        } else {
            //Toast.makeText(this,"Yeah", Toast.LENGTH_LONG).show()
            val intent = Intent(this@Login,UserDashboard::class.java)
            intent.putExtra("name",user)
            startActivity(intent)
        }
    }
}