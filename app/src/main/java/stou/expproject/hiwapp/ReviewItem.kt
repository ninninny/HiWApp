package stou.expproject.hiwapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "review_table")
data class ReviewItem(
    /*var reviewID: String = "",
    var reviewThumb: Int = R.drawable.tmp_review_thumb,
    var reviewTitle: String = "",
    var reviewScore: Int = 10,
    var reviewDesc: String? = "",
    var reviewAuthor: User? = null*/

@PrimaryKey val reviewID : String,
@ColumnInfo(name = "review_path") val reviewThumb: Int?,
@ColumnInfo(name = "review_title") val reviewTitle: String?,
@ColumnInfo(name = "review_score") val reviewScore: Int?,
@ColumnInfo(name = "review_desc") val reviewDesc: String?,
//@ColumnInfo(name = "review_author") val reviewAuthor: User?,

)