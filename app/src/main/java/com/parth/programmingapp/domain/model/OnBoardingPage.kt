package com.parth.programmingapp.domain.model

import androidx.annotation.DrawableRes
import com.parth.programmingapp.R

sealed class OnBoardingPage(

    @DrawableRes

    val image :Int,
    val title: String,
    val description : String
) {
 object First : OnBoardingPage(
       image= R.drawable.welcome, title = "Welcome", description = "Welcome to our Programming Information App!  Get ready to dive into the world of coding and innovation. Explore the latest updates, tips, and tricks to elevate your programming skills. Happy coding!"
    )
    object Second : OnBoardingPage(
        image= R.drawable.explore, title = "Explore", description = "Dive deep into the vast landscape of coding languages, unraveling their unique syntax, features, and applications."
    )
    object Third : OnBoardingPage(
        image= R.drawable.learn, title = "Learn Something New", description = "Explore the power behind each line of code and unleash your programming potential."
    )
}