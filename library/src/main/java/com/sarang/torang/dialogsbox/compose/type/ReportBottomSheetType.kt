package com.sarang.torang.dialogsbox.compose.type

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf

typealias ReportBottomSheetType = @Composable (Int, onReported: () -> Unit) -> Unit
val LocalReportBottomSheet = compositionLocalOf<ReportBottomSheetType> {
    @Composable { _,_ ->
        Text("LocalReportBottomSheetType")
    }
}