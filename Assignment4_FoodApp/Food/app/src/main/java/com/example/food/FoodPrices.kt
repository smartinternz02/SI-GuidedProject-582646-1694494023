package com.example.food

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
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun FoodPrices(
    navController: NavController
) {
    Column (modifier= Modifier
        .fillMaxSize()
        .padding(15.dp)){

        Spacer(modifier = Modifier.padding(10.dp))

        Row(modifier= Modifier
            .fillMaxWidth() ,
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Image(
                painter = painterResource(id = R.drawable.img_11),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(150.dp)
                    .width(150.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.img_10),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(150.dp)
                    .width(150.dp)
            )
        }
        Spacer(modifier = Modifier.padding(15.dp))
        Row (modifier= Modifier
            .fillMaxWidth() ,
            horizontalArrangement = Arrangement.SpaceEvenly){
            Text(
                text = "Rs.180/-",
            style = MaterialTheme.typography.bodyMedium.copy(
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.Serif,
                color = Color.DarkGray,
                ))
            Text(
                text = "Rs.200/-",
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray))

        }
        Spacer(modifier = Modifier.padding(10.dp))

        Row(modifier= Modifier
            .fillMaxWidth() ,
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Image(
                painter = painterResource(id = R.drawable.img_5),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(150.dp)
                    .width(150.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.img_6),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(150.dp)
                    .width(150.dp)
            )
        }
        Spacer(modifier = Modifier.padding(15.dp))
        Row (modifier= Modifier
            .fillMaxWidth() ,
            horizontalArrangement = Arrangement.SpaceEvenly){
            Text(
                text = "Rs.300/-",
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray))
            Text(
                text = "Rs.150/-",
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray))

    }
        Spacer(modifier = Modifier.padding(10.dp))

        Row(modifier= Modifier
            .fillMaxWidth() ,
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Image(
                painter = painterResource(id = R.drawable.img_7),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(150.dp)
                    .width(150.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.img_9),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(150.dp)
                    .width(150.dp)
            )
        }
        Spacer(modifier = Modifier.padding(15.dp))
        Row (modifier= Modifier
            .fillMaxWidth() ,
            horizontalArrangement = Arrangement.SpaceEvenly){
            Text(
                text = "Rs.180/-",
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray))
            Text(
                text = "Rs.120/-",
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.Serif,
                    color = Color.DarkGray))

        }

}}
@Composable
@Preview(showBackground = true)
fun FoodPricesScreenPreview() {
    FoodPrices(
        navController = rememberNavController()
    )
}