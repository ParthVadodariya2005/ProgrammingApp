package com.parth.programmingapp.presentation.screens.welcome


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.parth.programmingapp.domain.model.OnBoardingPage

import androidx.compose.foundation.layout.Column
import com.parth.programmingapp.ui.theme.Blue
import com.parth.programmingapp.ui.theme.Red
import com.parth.programmingapp.ui.theme.Sky

@Composable
fun WelcomeScreen(navController: NavHostController){
      val pages = listOf(
          OnBoardingPage.First,
          OnBoardingPage.Second,
          OnBoardingPage.Third,
      )
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Brush.verticalGradient(listOf(Blue, Sky, Red)))
     ) {

    }

}