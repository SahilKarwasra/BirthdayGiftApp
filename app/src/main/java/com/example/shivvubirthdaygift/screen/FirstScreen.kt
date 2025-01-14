package com.example.shivvubirthdaygift.screen

import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.shivvubirthdaygift.R
import com.example.shivvubirthdaygift.navigation.DestinationScreen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun FirstScreen(
    modifier: Modifier = Modifier,
    coroutineScope: CoroutineScope,
) {
    val baloonWithCelebration by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.baloonwithcelebration))
    val cartoon by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.cartoon))
    val boyheart by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.wish))
    val cat by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.cat))
    val cat1 by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.cat1))
    val cpl by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.cpleating))
    val pagerState = rememberPagerState {
        6
    }
    val segoeUi = FontFamily(
        Font(R.font.segoe_ui)
    )
    val context = LocalContext.current
    val mediaPlayer = remember {
        MediaPlayer.create(context, R.raw.bdaymusic).apply {
            isLooping = true
        }
    }
    DisposableEffect(Unit) {
        mediaPlayer.start()
        onDispose {
            mediaPlayer.stop()
            mediaPlayer.release()
        }
    }

    Box {
        Column(
            modifier
                .fillMaxSize()
                .background(Color(0xFFe31f71))
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            val name = "Name"
            Text(
                text = "Happy Birthday",
                fontSize = 40.sp,
                color = Color(0xfffde6f2),
                modifier = Modifier.padding(top = 16.dp),
                fontFamily = segoeUi
            )
            Text(
                text = name,
                fontSize = 35.sp,
                color = Color(0xfffde6f2),
                modifier = Modifier.padding(top = 5.dp),
                fontFamily = segoeUi
            )

            Spacer(Modifier.height(20.dp))


            HorizontalPager(
                state = pagerState,
                modifier = Modifier
                    .weight(1f)
            ) { page ->
                when (page) {
                    0 -> {
                        TextAndPicForCard(
                            segoeUi,
                            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into ",
                            painterResource(id = R.drawable.one)
                        )

                    }

                    1 -> {
                        TextAndPicForCard(
                            segoeUi,
                            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into ",
                            painterResource(id = R.drawable.two)
                        )
                    }

                    2 -> {
                        TextAndPicForCard(
                            segoeUi,
                            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into ",
                            painterResource(id = R.drawable.three)
                        )
                    }

                    3 -> {
                        TextAndPicForCard(
                            segoeUi,
                            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into ",
                            painterResource(id = R.drawable.four)
                        )
                    }

                    4 -> {
                        TextAndPicForCard(
                            segoeUi,
                            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into ",
                            painterResource(id = R.drawable.five)
                        )
                    }

                    5 -> {
                        PageFiveText()
                    }
                }
            }


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(16.dp)
                        .pointerInput(Unit) {
                            detectTapGestures(onTap = {
                                coroutineScope.launch {
                                    val nextPage =
                                        (pagerState.currentPage + 1) % pagerState.pageCount
                                    pagerState.animateScrollToPage(nextPage)
                                }
                            })
                        }
                ) {
                    Image(
                        painter = painterResource(R.drawable.clickbillu),
                        contentDescription = "Click Billu",
                        modifier = Modifier
                            .size(70.dp)
                            .clip(CircleShape)
                    )

                    Text(
                        text = "Click on Billu :)",
                        fontSize = 18.sp,
                        color = Color(0xfffde6f2),
                        fontFamily = segoeUi,
                        modifier = Modifier.padding(top = 8.dp)
                    )
                }
            }

        }
        LottieAnimation(
            composition = baloonWithCelebration,
            modifier = Modifier
                .fillMaxSize()
                .graphicsLayer {
                    translationX = -300f
                }
                .align(Alignment.Center),
            iterations = 100,
            contentScale = ContentScale.FillHeight
        )

        if (pagerState.currentPage == 0) {
            LottieAnimation(
                composition = cartoon,
                modifier = Modifier
                    .size(120.dp)
                    .align(Alignment.BottomStart),
                iterations = 100
            )
        }
        if (pagerState.currentPage == 1) {
            LottieAnimation(
                composition = boyheart,
                modifier = Modifier
                    .size(120.dp)
                    .align(Alignment.BottomStart),
                iterations = 100
            )
        }
        if (pagerState.currentPage == 2) {
            LottieAnimation(
                composition = cpl,
                modifier = Modifier
                    .size(120.dp)
                    .align(Alignment.BottomStart),
                iterations = 100
            )
        }
        if (pagerState.currentPage == 3) {
            LottieAnimation(
                composition = cat,
                modifier = Modifier
                    .size(120.dp)
                    .align(Alignment.BottomStart),
                iterations = 100
            )
        }
        if (pagerState.currentPage == 4) {
            LottieAnimation(
                composition = cat1,
                modifier = Modifier
                    .size(120.dp)
                    .align(Alignment.BottomStart),
                iterations = 100
            )
        }
    }
}

@Composable
fun TypingTextEffect(text: String, modifier: Modifier = Modifier) {
    var displayedText by remember { mutableStateOf("") }

    // Trigger the typing effect when the component enters the composition
    LaunchedEffect(key1 = text) {
        text.forEachIndexed { index, char ->
            delay(100) // Adjust the delay to control typing speed
            displayedText = text.substring(0, index + 1) // Show one character at a time
        }
    }

    Text(
        text = displayedText,
        fontSize = 22.sp,
        color = Color(0xfffde6f2),
        modifier = modifier,
        fontFamily = FontFamily(Font(R.font.segoe_ui)),
        textAlign = TextAlign.Center,
    )
}

@Composable
fun PageFiveText() {
    val text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into "

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TypingTextEffect(
            text = text,
            modifier = Modifier.padding(horizontal = 20.dp)
        )
    }
}

@Composable
private fun TextAndPicForCard(segoeUi: FontFamily, mainText: String, pic: Painter? = null) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Card(
            modifier = Modifier
                .wrapContentSize() // Make the card wrap its content
                .aspectRatio(1f),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 10.dp
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xfffde6f2))
                    .padding(16.dp),
            ) {
                if (pic != null) {
                    Image(
                        painter = pic, // Replace with your image resource
                        contentDescription = "Card Image",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Fit // Adjust contentScale as needed
                    )
                }
            }
        }
        Spacer(Modifier.height(20.dp))
        Text(
            text = mainText,
            fontSize = 20.sp,
            color = Color(0xfffde6f2),
            modifier = Modifier.padding(horizontal = 20.dp),
            fontFamily = segoeUi,
            textAlign = TextAlign.Center,
        )
        Spacer(modifier = Modifier.height(300.dp))
    }
}


