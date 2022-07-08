package stou.expproject.hiwapp

import androidx.room.*

@Dao
interface UserDAO {
    @Query("SELECT * FROM member_table")
    fun getAll(): List<User>

    @Query("SELECT * FROM member_table WHERE userName IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<User>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertAll(vararg users: User)

    @Delete
    fun delete(user: User)
}