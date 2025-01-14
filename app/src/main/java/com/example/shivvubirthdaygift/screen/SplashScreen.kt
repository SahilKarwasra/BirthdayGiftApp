package com.example.shivvubirthdaygift.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.shivvubirthdaygift.navigation.DestinationScreen
import com.example.shivvubirthdaygift.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navigate: (DestinationScreen) -> Unit,
    modifier: Modifier = Modifier
) {
    val splashScreen by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.entryscreen))
    val cakePiece by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.cakepiece))
    LaunchedEffect(Unit) {
        delay(6000)
        navigate(
            DestinationScreen.FirstScreenObj
        )
    }
    Box(modifier = Modifier.fillMaxSize()) {
        LottieAnimation(
            composition = splashScreen,
            modifier = Modifier.fillMaxSize(),
            iterations = 2,
            contentScale = ContentScale.FillHeight
        )
        Column(
            modifier = Modifier.align(Alignment.Center)
        ) {
            LottieAnimation(
                composition = cakePiece,
                modifier = Modifier.size(400.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Happy Birthday to One of Fav :)",
                style = MaterialTheme.typography.headlineLarge,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth(),
                color = Color(0xFFe31f71)
            )
        }
    }
}
