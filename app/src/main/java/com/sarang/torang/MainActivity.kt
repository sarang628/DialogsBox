package com.sarang.torang

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.sarang.torang.di.dialogsbox_di.ProvideMainDialog
import com.sarang.torang.dialogsbox.compose.DialogsBoxViewModel
import com.sarang.torang.ui.theme.DialogsBoxTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalLayoutApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val dialogsBoxViewModel : DialogsBoxViewModel = hiltViewModel()
            val coroutineScope = rememberCoroutineScope()
            DialogsBoxTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(Modifier.padding(innerPadding)){
                        ProvideMainDialog(
                            dialogsViewModel = dialogsBoxViewModel
                        ){
                            FlowRow {
                                AssistChip(onClick = {
                                    dialogsBoxViewModel.onComment(10)
                                }, label = {
                                    Text("comment")
                                })
                                Spacer(Modifier.width(4.dp))
                                AssistChip(onClick = {
                                    dialogsBoxViewModel.onShare(10)
                                }, label = {
                                    Text("share")
                                })
                            }
                        }
                    }
                }
            }
        }
    }
}