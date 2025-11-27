package com.sarang.torang

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf

typealias ReportBottomSheetType = @Composable (Int, onReported: () -> Unit) -> Unit
typealias ShareBottomSheet      = @Composable (onClose: () -> Unit) -> Unit
typealias CommentBottomSheet    = @Composable (reviewId: Int?) -> Unit
typealias RestaurantBottomSheet = @Composable ( @Composable () -> Unit ) -> Unit
typealias MenuBottomSheet       = @Composable (reviewId: Int, onClose: () -> Unit, onReport: (Int) -> Unit, onDelete: (Int) -> Unit, onEdit: (Int) -> Unit) -> Unit


val LocalReportBottomSheetType = compositionLocalOf<ReportBottomSheetType> {
    @Composable { _,_ ->
        Text("LocalReportBottomSheetType")
    }
}

val LocalShareBottomSheet = compositionLocalOf<ShareBottomSheet> {
    @Composable {
        Text("LocalShareBottomSheet")
    }
}

val LocalCommentBottomSheet = compositionLocalOf<CommentBottomSheet> {
    @Composable {
        Text("LocalCommentBottomSheet")
    }
}

val LocalRestaurantBottomSheet = compositionLocalOf<RestaurantBottomSheet> {
    @Composable {
        Text("LocalRestaurantBottomSheet")
        it.invoke()
    }
}

val LocalMenuBottomSheet = compositionLocalOf<MenuBottomSheet> {
    @Composable {_,_,_,_,_->
        Text("LocalMenuBottomSheet")
    }
}