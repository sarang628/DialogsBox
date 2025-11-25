package com.sarang.torang

interface DeleteReviewUseCase {
    suspend fun invoke(reviewId : Int)
}