package stou.expproject.hiwapp

import androidx.room.*

//@Entity
data class User(
    //var userID :String? = "unknown",
    var userName :String = "unknown",
    var userPass : String = "unknown",
    var userEmail : String = "unknown",
    var userImage: Int = R.drawable.tmp_review_thumb

   /* @PrimaryKey val userName: String,
    @ColumnInfo(name = "userPass") val userPass: String?,
    @ColumnInfo(name = "userEmail") val userEmail: String?,
    @ColumnInfo(name = "userImage") val userImage: Int?*/
)

/*
@Dao
interface UserDao {
    @Query("SELECT * FROM user")
    fun getAll(): List<User>

    @Query("SELECT * FROM user WHERE userName IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<User>

    @Insert
    fun insertAll(vararg users: User)

    @Delete
    fun delete(user: User)
}*/
