package stou.expproject.hiwapp

data class ReviewItem(
    var reviewID: String = "",
    var reviewThumb: Int = R.drawable.tmp_review_thumb,
    var reviewTitle: String = "",
    var reviewScore: Int = 10,
    var reviewDesc: String? = "",
    var reviewAuthor: User? = null

    )