package com.example.loginpage

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(){

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(id = R.drawable.a), contentDescription ="LoginImage",
            modifier = Modifier.size(300.dp))

        Text(text = "Selamat Datang", fontSize = 30.sp, fontWeight = FontWeight.SemiBold)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = "Login your account")
        
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = email, onValueChange ={
            email = it
        }, label = {
            Text(text = "Email address")
        } )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = password, onValueChange ={
            password = it
        }, label = {
            Text(text = "Password")
        }, visualTransformation = PasswordVisualTransformation() )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            Log.i("Credential", "Email : $email Password : $password")
        }) {
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "Forgot Password?", modifier = Modifier.clickable {

        })

        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "Or sign in with")
        Spacer(modifier = Modifier.height(15.dp))

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Image(painter = painterResource(id = R.drawable.google),
                contentDescription = "Google",
                modifier = Modifier
                    .size(40.dp)
                    .clickable {
            //GithubClickable
                    }
            )
            Image(painter = painterResource(id = R.drawable.fbicon),
                contentDescription = "Facebook",
                modifier = Modifier
                    .size(40.dp)
                    .clickable {
            //FacebookClickable
                    }
            )
            Image(painter = painterResource(id = R.drawable.github),
                contentDescription = "Github",
                modifier = Modifier
                    .size(40.dp)
                    .clickable {
            //GoogleClickable
                    }
            )
        }
        
    }

}