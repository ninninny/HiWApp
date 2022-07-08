package stou.expproject.hiwapp

import android.widget.Toast
import androidx.room.*

class MemberService(var map: HashMap<String, User>) {

    fun register(username:String, pass:String, email:String){
        val u = User()
        u.userName = username
        u.userPass = pass
        u.userEmail = email
        map.put(username,u)
    }// END register

    fun login(user:String, pass:String):User {
        var memLogin = User()
        for(i in map){
            if(user.equals(i.key) && pass.equals(i.value.userPass)){
                memLogin = i.value
                break
            } else {
                memLogin = User("unknown")
            }
        }
        return memLogin
    }// END login

    fun logout():User{
        return User("unknown")
    }

}