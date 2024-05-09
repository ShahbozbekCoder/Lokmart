package com.example.bottomnavigation.bottom_navigation

import com.example.bottomnavigation.R

sealed class BottomItem(val title:String, val iconID: Int, val route:String) {
    object Screen1: BottomItem("Screen1", R.drawable.icon,"screen_1")
    object Screen2: BottomItem("Screen2", R.drawable.icon,"screen_2")
    object Screen3: BottomItem("Screen3", R.drawable.icon,"screen_3")
    object Screen4: BottomItem("Screen4", R.drawable.icon,"screen_4")
}