package com.sarang.torang.dialogsbox.usecase

import kotlinx.coroutines.flow.Flow

interface IsLoginUseCase {
    fun invoke() : Flow<Boolean>
}