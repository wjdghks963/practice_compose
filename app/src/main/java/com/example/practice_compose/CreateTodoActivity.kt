package com.example.practice_compose

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class CreateTodoActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CreateTodoView()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun CreateTodoView(){


    Column(modifier = Modifier.fillMaxSize()
      ) {
        EditTextField()
    }

}


@Composable
fun EditTextField(){
    val text = remember { mutableStateOf("") }

    TextField(value = text.value, onValueChange = {text.value = it}, modifier = Modifier
        .fillMaxWidth()
        .border(width = 3.dp, color = Color.Blue, shape = CircleShape), colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White ,focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent))

}