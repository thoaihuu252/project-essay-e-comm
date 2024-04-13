@file:OptIn(ExperimentalMaterial3Api::class)

package com.nhom4.project_essay_e_comm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class LoginSreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           login()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun login(){
    Column(
        Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color(android.graphics.Color.parseColor("#ffffff"))),
        horizontalAlignment = Alignment.CenterHorizontally){
        Image(
            painterResource(id = R.mipmap.top_background),
            contentDescription=null,
            contentScale = ContentScale.FillBounds
        )
        Image(
            painterResource(id = R.mipmap.logo),
            contentDescription=null,
            modifier = Modifier.height(150.dp)
        )
        Text(text = "Welcome to E-comm",
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            color = Color(android.graphics.Color.parseColor("#7d32a8"))
        )
        var user by remember {
            mutableStateOf("Ussername")
        }
        var pass by remember {
            mutableStateOf("Password")
        }
        var passVisisble by remember {
            mutableStateOf(false)
        }
        TextField(value = user, {text->user=text},
            modifier = Modifier
                .fillMaxWidth()
                .height(66.dp)
                .padding(start = 64.dp, end = 64.dp, top = 8.dp, bottom = 8.dp)
                .border(
                    1.dp, Color(android.graphics.Color.parseColor("#7d32a8")),
                    shape = RoundedCornerShape(50)
                ),
            shape= RoundedCornerShape(50),
            textStyle = androidx.compose.ui.text.TextStyle(
                textAlign = TextAlign.Center,
                color = Color(android.graphics.Color.parseColor("#7d32a8")),
                fontSize = 14.sp,
            ),

        )
        TextField(value = pass, {text->pass=text},
            modifier = Modifier
                .fillMaxWidth()
                .height(66.dp)
                .padding(start = 64.dp, end = 64.dp, top = 8.dp, bottom = 8.dp)
                .border(
                    1.dp, Color(android.graphics.Color.parseColor("#7d32a8")),
                    shape = RoundedCornerShape(50)
                ),
            shape= RoundedCornerShape(50),
            textStyle = androidx.compose.ui.text.TextStyle(
                textAlign = TextAlign.Center,
                color = Color(android.graphics.Color.parseColor("#7d32a8")),
                fontSize = 14.sp,
            ),
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent
            ),
            visualTransformation = if(passVisisble) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Button(onClick = { /*TODO*/ },
            Modifier
                .fillMaxWidth()
                .height(66.dp)
                .padding(start = 64.dp, end = 64.dp, top = 8.dp, bottom = 8.dp),
                colors = ButtonDefaults.run {
                    buttonColors(
                                Color(android.graphics.Color.parseColor("#7d32a8")))
                },
                shape = RoundedCornerShape(50))
            {
            
            Text(text = "Login",
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )


        }
        Text(text = "Quên mật khẩu",
            Modifier.padding( top = 8.dp, bottom = 8.dp),
            fontSize = 14.sp,
            color =  Color(android.graphics.Color.parseColor("#7d32a8"))
        )
        Row {
            androidx.compose.foundation.Image(painter = painterResource(id = R.mipmap.google), contentDescription ="",Modifier.padding(8.dp) )
            androidx.compose.foundation.Image(painter = painterResource(id = R.mipmap.facebook), contentDescription ="",Modifier.padding(8.dp) )
            androidx.compose.foundation.Image(painter = painterResource(id = R.mipmap.twitter), contentDescription ="",Modifier.padding(8.dp) )
        }
        Image(painter = painterResource(id = R.mipmap.bottom_background),
            contentDescription ="",
            contentScale = ContentScale.FillBounds )


    }



}

