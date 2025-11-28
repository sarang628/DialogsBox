package com.sarang.torang.dialogsbox.compose.type

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf


typealias ShareBottomSheetType      = @Composable (onClose: () -> Unit) -> Unit

val LocalShareBottomSheet = compositionLocalOf<ShareBottomSheetType> {
    @Composable {
        Text("LocalShareBottomSheet")
    }
}