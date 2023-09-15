package com.example.september5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen()
        }
    }
}
@ExperimentalMaterial3Api
@Preview(showBackground = true , widthDp = 300 , heightDp = 250)
@Composable
public fun LoginScreen(){
    Column {
        var username by remember { mutableStateOf(" ") }
        var password by remember { mutableStateOf(" ") }
        Text(text = "Username")
        TextField(
            value = username,
            onValueChange = { newUsername ->
                username = newUsername
            },
            leadingIcon = {
                Image(
                    painter = painterResource(id =
                    android.R.drawable.star_big_on),
                    contentDescription = "rectangular Icon"
                )
            },
            label = {
                Text(text = "Your Label")
            }
        )
        Text(text = "Password")
        TextField(value = password,
            onValueChange = {newPassword ->
                password = newPassword
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            ),
            placeholder = {
                Text(text = "Your Placeholder/Hint")
            }
        )
        Button(onClick = { /*TODO*/ }) {
            Text(text= "Log in")
        }
    }
}