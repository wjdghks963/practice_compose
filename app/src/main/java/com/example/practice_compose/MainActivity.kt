package com.example.practice_compose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.practice_compose.ui.theme.Practice_ComposeTheme
import androidx.compose.material.TextField as TextField1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DefaultPreview()
        }
    }
}


@Composable
fun CreateTodo(){
    val context = LocalContext.current

    Box(contentAlignment = Alignment.BottomCenter , modifier = Modifier.fillMaxSize()){
        Button(onClick = {context.startActivity(Intent(context, CreateTodoActivity::class.java))}) {
            Text(text = "Todo 추가하기")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    // TODOList
    TodoList(modifier = Modifier
        .padding(14.dp)
    , Todos = arrayOf("das","asdas","asdasd","das","asdas","asdasd","das","asdas","asdasd","das","asdas","asdasd","das","asdas","asdasd","das","asdas","asdasd","das","asdas","asdasd","das","asdas","asdasd"));

    // Create ToDo Button
    CreateTodo()

//    NavigationGraph(navController = navController)
}
