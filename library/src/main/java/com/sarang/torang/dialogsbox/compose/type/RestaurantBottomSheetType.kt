package com.sarang.torang.dialogsbox.compose.type

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf

typealias RestaurantBottomSheetType = @Composable (@Composable () -> Unit ) -> Unit
val LocalRestaurantBottomSheet = compositionLocalOf<RestaurantBottomSheetType> {
    @Composable {
        Text("LocalRestaurantBottomSheet")
        it.invoke()
    }
}