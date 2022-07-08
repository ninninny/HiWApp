package stou.expproject.hiwapp

import androidx.room.*

@Entity(tableName = "member_table")
data class User(
    //var userID :String? = "unknown",
    /*var userName :String = "unknown",
    var userPass : String = "unknown",
    var userEmail : String = "unknown",
    var userImage: Int = R.drawable.tmp_review_thumb*/

    @PrimaryKey val userName: String,
    @ColumnInfo(name = "user_password") val userPass: String?,
    @ColumnInfo(name = "user_email") val userEmail: String?,
    @ColumnInfo(name = "user_image") val userImage: Int?
)
