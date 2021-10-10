package com.emad.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.emad.composetest.model.Message
import com.emad.composetest.ui.theme.ComposeTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            writeFirst()
        }
    }
}

@Preview
@Composable
fun writeFirst(msg: Message = Message("Emad", "This is a message!")){
    Column {
        Text(text = msg.author)
        Text(text = msg.body)
    }
}
