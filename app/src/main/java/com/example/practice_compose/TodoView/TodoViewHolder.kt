package com.example.practice_compose

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TodoList(modifier: Modifier, Todos: Array<String>) {
    LazyColumn(modifier = modifier) {
        items(items=Todos) { data -> TodoViewHolder(todo = data)
        }
    }
}



@Composable
fun TodoViewHolder(todo: String){
    Text(text = todo, modifier = Modifier.padding(16.dp).height(30.dp).border(width = 2.dp, color = Color.Blue, shape = CircleShape).fillMaxWidth(), textAlign = TextAlign.Center, style = TextStyle(fontSize = 20.sp, color = Color.Blue));
}
