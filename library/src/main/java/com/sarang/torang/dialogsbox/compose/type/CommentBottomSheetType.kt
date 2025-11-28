package com.sarang.torang.dialogsbox.compose.type

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf

typealias CommentBottomSheetType = @Composable (reviewId: Int?) -> Unit
val LocalCommentBottomSheet = compositionLocalOf<CommentBottomSheetType> {
    @Composable {
        Text("LocalCommentBottomSheet")
    }
}