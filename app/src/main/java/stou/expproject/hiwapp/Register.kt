package stou.expproject.hiwapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.*
//import com.google.firebase.FirebaseApp
//import com.google.firebase.database.FirebaseDatabase

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

        val memData = hashMapOf<String, User>()
        val ms = MemberService(memData)

        findViewById<Button>(R.id.btnRegisterOnRegister).setOnClickListener {
            addMember(ms)
        }

        findViewById<TextView>(R.id.btnBackOnRegister).setOnClickListener {
            startActivity(loginPage)
        }

    } // END onCreate

    private fun addMember(m:MemberService){

        //FirebaseApp.initializeApp(this);
        //val ref = FirebaseDatabase.getInstance().getReferenceFromUrl("https://hiwapp-f18b9-default-rtdb.asia-southeast1.firebasedatabase.app/")
        //val loginPage = Intent(this,Login::class.java)

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
            //m.register(name,cfPass,email)
            Toast.makeText(this, "SUCCESS! Thank you for your review.", Toast.LENGTH_LONG).show()
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


        //val userID = ref.push().key // แบบนี้คนก็สมัคร username ซ้ำได้สิ?
        //val userMember = User(name, cfPass, email)

        /*ref.child(name).setValue(userMember).addOnCompleteListener {
            Toast.makeText(this, "SUCCESS! Thank you for your review.", Toast.LENGTH_LONG).show()
            // Clear inputs after submit
            txtName.text = null
            txtEmail.text = null
            txtPass.text = null
            txtConPass.text = null
            startActivity(loginPage)
        }*/
    }
}