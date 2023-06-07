package com.example.jetpackcomposerecyclerview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposerecyclerview.data.DataProvider
import com.example.jetpackcomposerecyclerview.data.DataProvider.student
import com.example.jetpackcomposerecyclerview.data.model.Student
import com.example.jetpackcomposerecyclerview.ui.theme.JetPackComposeRecyclerViewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeRecyclerViewTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ListLayout()
                }
            }
        }
    }
    @Composable
    private fun ListLayout() {
        StudentList()
    }

    @Composable
    fun StudentList() {
        val listStudent = remember {
            DataProvider.student
        }
        LazyColumn() {
            items(
                items = listStudent,
                itemContent = {
                    StudentListItem(students = it)
                })
        }
    }

    private @Composable
    fun StudentListItem(students: Int) {

    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetPackComposeRecyclerViewTheme {
        Greeting("Android")
    }
}