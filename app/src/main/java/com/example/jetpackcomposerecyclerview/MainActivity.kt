package com.example.jetpackcomposerecyclerview

import android.os.Bundle
import androidx.compose.foundation.Image
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposerecyclerview.data.DataProvider
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
        Row(modifier = Modifier.padding(10.dp)) {
            Column(modifier = Modifier.weight(1f),
                Arrangement.Center) {
                Text(text = "Student List", color = Color.Blue, fontStyle = FontStyle.Italic, modifier = Modifier.width(150.dp))
                StudentList()

            }
        }
        //Text(text = "Student List",fontStyle = FontStyle.Italic, modifier = Modifier.width(150.dp))

    }

    @Composable
    fun StudentList() {
        val student = remember { DataProvider.studentList }
        LazyColumn(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ) {
            items(
                student
            ) {
                StudentCard(student = it)
            }
        }
    }





    private @Composable
    fun StudentCard(student: Student) {
        Card(
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp).fillMaxWidth(),
            elevation = 2.dp,
            backgroundColor = Color.White,
            shape = RoundedCornerShape(corner = CornerSize(16.dp))
        ) {
            Row {
                Image(
                    painter = painterResource(id = student.imageId),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(8.dp)
                        .size(54.dp)
                        .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
                )
                Column(
                    modifier = Modifier
                        .padding(12.dp)
                        .fillMaxWidth()
                        .align(Alignment.Top)
                ) {
                    Text(text = student.name, style = typography.h6)
                    Text(text = "Age :" + student.age, style = typography.caption)

                }
            }
        }
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