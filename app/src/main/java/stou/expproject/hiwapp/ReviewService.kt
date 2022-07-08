package stou.expproject.hiwapp

class ReviewService(var map: ArrayList<ReviewItem>){
    fun add(id:String, thumb:Int, title:String){
        val review = ReviewItem()
        review.reviewID = id
        review.reviewThumb = thumb
        review.reviewTitle = title
        map.add(review)
    }// END add
}
