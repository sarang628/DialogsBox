package com.sarang.torang.dialogsbox.usecase

interface DeleteReviewUseCase {
    suspend fun invoke(reviewId : Int)
}