package com.nhom4.project_essay_e_comm

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nhom4.project_essay_e_comm.Api.ApiServiceImpl
import com.nhom4.project_essay_e_comm.ui.theme.ProjectessayecommTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjectessayecommTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("2")
                }
            }
        }
    }
}

@SuppressLint("UnrememberedMutableState", "CoroutineCreationDuringComposition")
@Composable
fun Greeting(id: String, modifier: Modifier = Modifier) {
    val greetingText = remember { mutableStateOf("") }

    LaunchedEffect(key1 = id) {
        try {
            val response = ApiServiceImpl.instance.getProductById(id).execute()
            if (response.isSuccessful()) {
                val data = response.body()
                greetingText.value = data?.nameProduct ?: "Failed to get data"
            } else {
                greetingText.value = "Failed to get data"
            }
        }catch (e : Exception){
            greetingText.value = "Failed to get data"
        }

    }

    Text(text = greetingText.value)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProjectessayecommTheme {
        Greeting("Android")
    }
}