package stou.expproject.hiwapp

class ReviewService(var map: ArrayList<ReviewItem>){
    fun add(id:String, thumb:Int, title:String, score:Int, desc:String, author:User){
        val review = ReviewItem()
        review.reviewID = id
        review.reviewThumb = thumb
        review.reviewTitle = title
        review.reviewScore = score
        review.reviewDesc = desc
        review.reviewAuthor = author
        map.add(review)
    }// END add
}
