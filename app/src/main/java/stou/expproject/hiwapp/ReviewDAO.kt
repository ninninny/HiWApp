package stou.expproject.hiwapp

import androidx.room.*

@Dao
interface ReviewDAO {
    @Query("SELECT * FROM review_table")
    fun getAll(): List<ReviewItem>

    @Query("SELECT * FROM review_table WHERE review_title IN (:keyword)")
    fun loadAllByWord(keyword: IntArray): List<ReviewItem>

    @Query("SELECT * FROM review_table WHERE review_author IN (:user)")
    fun loadAllByAuthor(user: User): List<ReviewItem>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertAll(vararg reviews: ReviewItem)

    @Delete
    fun delete(review: ReviewItem)
}