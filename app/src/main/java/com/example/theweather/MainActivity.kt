package com.example.theweather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.theweather.ui.screens.ListItem
import com.example.theweather.ui.screens.MainCard
import com.example.theweather.ui.screens.TabLayout
import com.example.theweather.ui.theme.TheWeatherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheWeatherTheme {
                Image(
                    painter = painterResource(id = R.drawable.___1_),
                    contentDescription = "image",
                    modifier = Modifier
                        .fillMaxSize()
                        .alpha(0.5F),
                    contentScale = ContentScale.Crop
                )
                Column {
                    MainCard()
                    TabLayout()
                    //ListItem()
                }

            }
        }
    }
}
