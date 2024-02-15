//Har Har Mahadev
package com.parth.programmingapp.presentation.screens.splash
import android.content.res.Configuration.UI_MODE_NIGHT_YES

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.parth.programmingapp.R

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

import com.parth.programmingapp.ui.theme.Blue
import com.parth.programmingapp.ui.theme.Red
import com.parth.programmingapp.ui.theme.Sky
import androidx.compose.runtime.*
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@Composable
fun SplashScreen(navHostController: NavHostController){
    val systemUiController = rememberSystemUiController()
    SideEffect {
        systemUiController.setSystemBarsColor(
            color = Color.Transparent,
            isNavigationBarContrastEnforced = false
        )
    }
    Splash()
}

@Composable
fun Splash(){
    if(isSystemInDarkTheme()){
        Box(modifier = Modifier
            .background(Color.Black)
            .fillMaxSize(),
            contentAlignment = Alignment.Center
        )
        {
            Image(painter = painterResource(id = R.drawable.ic_logo),
                contentDescription = stringResource(R.string.app_logo)
            )

        }
    } else {
        Box(modifier = Modifier
            .background(Brush.verticalGradient(listOf(Blue, Sky, Red)))
            .fillMaxSize(),
            contentAlignment = Alignment.Center
        )
        {
            Image(painter = painterResource(id = R.drawable.ic_logo),
                contentDescription = stringResource(R.string.app_logo)
            )
        }
    }

}

@Composable
@Preview
fun SplashScreenPreview(){
    Splash()
}

@Composable
@Preview(uiMode = UI_MODE_NIGHT_YES)
fun SplashScreenPDarkPreview(){
    Splash()
}
