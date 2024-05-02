package com.example.theweather

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.theweather.ui.screens.MainCard
import com.example.theweather.ui.screens.TabLayout
import com.example.theweather.ui.theme.TheWeatherTheme

const val API_KEY = "6c3fe9442f1c483096542150242904"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheWeatherTheme {
                getData("London",this)
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

private fun getData(city: String, context: Context) {
    val url =
        "https://api.weatherapi.com/v1/forecast.json?key=$API_KEY" +
                "&q=$city" +
                "&days=1" +
                "&aqi=no" +
                "&alerts=no"

    val queue = Volley.newRequestQueue(context)
    val sRequest = StringRequest(
        Request.Method.GET,
        url,
        {
            response ->
            Log.d("MyLog", "Response: $response")
        },
        {
            Log.d("MyLog", "VolleyError: $it")
        }
    )
    queue.add(sRequest)
}
