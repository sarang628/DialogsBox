package com.sarang.torang.dialogsbox.compose.type

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf

typealias MenuBottomSheetType = @Composable (MenuBottomSheetTypeData) -> Unit

data class MenuBottomSheetTypeData(
    val reviewId: Int,
    val onClose: () -> Unit,
    val onReport: (Int) -> Unit,
    val onDelete: (Int) -> Unit,
    val onEdit: (Int) -> Unit
)
val LocalMenuBottomSheet = compositionLocalOf<MenuBottomSheetType> {
    @Composable {
        Text("LocalMenuBottomSheet")
    }
}