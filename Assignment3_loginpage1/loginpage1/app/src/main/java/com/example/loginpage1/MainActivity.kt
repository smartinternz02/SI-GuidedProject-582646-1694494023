@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.loginpage1
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.*
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.TextField



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen1()
        }
    }
}
@ExperimentalMaterial3Api
@Composable
fun LoginScreen1() {
    var username by remember { mutableStateOf(" ") }
    var password by remember { mutableStateOf(" ") }
    var expanded by remember { mutableStateOf(false) }
    val aps = arrayOf("Ajio","Amazon","Flipkart","Myntra")
    var selectedText by remember { mutableStateOf(aps[0]) }
    val context = LocalContext.current


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


      Image(painter = painterResource(id = R.drawable.img),
      contentDescription = "Login Image",
          modifier = Modifier
              .size(150.dp)
              .padding(16.dp))

        Text(
            text = "Login",
            style = MaterialTheme.typography.bodyMedium.copy(
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF476810)
            )

        )
        Spacer(modifier = Modifier.height(16.dp))
        //Username TextField
        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = { Text(text = "Username") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        //Password TextField
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Password") },
            keyboardActions = KeyboardActions(
                onDone = {
                    //Handle Login Here
                },

                ),
            keyboardOptions =  KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            ),
            placeholder = {
                Text(text = "Your Placeholder/Hint")
            },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Select your Choice from the DropDownMenuBox")
        Spacer(modifier = Modifier.height(16.dp))
        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = {
                expanded = !expanded
            }
        ){
            TextField(
                value = selectedText,
                onValueChange = {},
                readOnly = true ,
                trailingIcon = {ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)},
                modifier = Modifier.menuAnchor())
            ExposedDropdownMenu(
                expanded = expanded ,
                onDismissRequest = { expanded = false}) {
                aps.forEach { item ->
                    DropdownMenuItem(
                        text = { Text(text=item) },
                        onClick = {
                            selectedText = item
                            expanded = false
                            Toast.makeText(context,item,Toast.LENGTH_SHORT).show()
                        })
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))
        //Login button
        Button(
            onClick = {
                //Create an intent to open Amazon's website
                val intent = Intent(Intent.ACTION_VIEW)
                when(selectedText){
                    aps[0] -> intent.data = Uri.parse("https://www.ajio.com")
                    aps[1] -> intent.data = Uri.parse("https://www.amazon.com")
                    aps[2] -> intent.data = Uri.parse("https://www.flipkart.com")
                    else -> intent.data = Uri.parse("https://www.myntra.com")
                }
                //Check if there is an Activity that can handle the intent
                try{
                    //Attempt to start the activity for opening the link
                    context.startActivity(intent)
                }
                catch(e: ActivityNotFoundException) {
                    //Handle the case when no web browser is available
                }
            },
            modifier = Modifier.fillMaxWidth()
        )
        {
            Text(text = "Navigate to $selectedText")
        }

    }
}
@Preview
@Composable
fun PreviewLoginScreen() {
    LoginScreen1()
}