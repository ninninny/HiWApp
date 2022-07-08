package stou.expproject.hiwapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.*

class Register : AppCompatActivity() {

    private lateinit var txtName : EditText
    private lateinit var txtEmail : EditText
    private  lateinit var txtPass : EditText
    private  lateinit var txtConPass : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val loginPage = Intent(this,Login::class.java)

        txtName = findViewById(R.id.inputUsername)
        txtEmail = findViewById(R.id.inputEmail)
        txtPass = findViewById(R.id.inputPassword)
        txtConPass = findViewById(R.id.inputConfirmPassword)

        findViewById<Button>(R.id.btnRegisterOnRegister).setOnClickListener {

        }

        findViewById<TextView>(R.id.btnBackOnRegister).setOnClickListener {
            startActivity(loginPage)
        }

        findViewById<ImageView>(R.id.inputUserImage).setOnClickListener{
            findViewById<ImageView>(R.id.inputUserImage).setImageResource(R.drawable.user_image_default)
        }

    } // END onCreate

    private fun addMember(){

        val name = txtName.text.toString().trim()
        val email = txtEmail.text.toString().trim()
        val pass = txtPass.text.toString().trim()
        val cfPass = txtConPass.text.toString().trim()
        if(name.isEmpty()){
            txtName.error = "กรุณาใส่ Username"
            return
        }
        if(pass.isEmpty()){
            txtPass.error = "กรุณาใส่ Password"
            return
        }
        if(pass == cfPass){

            Toast.makeText(this, "Registration SUCCESS!", Toast.LENGTH_LONG).show()
            // Clear inputs after submit
            txtName.text = null
            txtEmail.text = null
            txtPass.text = null
            txtConPass.text = null

            Handler().postDelayed({

                val intent = Intent(this@Register,Login::class.java)
                intent.putExtra("name",name)
                intent.putExtra("pass",cfPass)
                intent.putExtra("email",email)
                startActivity(intent)

            }, 2000)

        } else {
            txtConPass.error = "ยืนยันรหัสผ่านไม่สำเร็จ"
            return
        }


    }
}