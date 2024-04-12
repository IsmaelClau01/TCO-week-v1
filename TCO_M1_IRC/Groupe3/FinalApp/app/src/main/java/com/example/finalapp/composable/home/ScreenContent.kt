package com.example.finalapp.composable.home

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.finalapp.R
import com.example.finalapp.ui.theme.BlueButton
import com.example.finalapp.ui.theme.WhiteLight

@Composable
fun ScreenContent(activity: Activity) {
    Column(
        Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            modifier = Modifier.size(200.dp),
            alignment = Alignment.TopStart,
            painter = painterResource(id = R.drawable.broadcast),
            contentDescription = null
        )

        Text(text = "Vous y trouverez tous les évènements de la semaine de la Télécommunication",
            color = Color.White,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            lineHeight = 30.sp,
            modifier = Modifier.
            padding(vertical = 30.dp, horizontal = 30.dp, )
        )

        EditButton(BlueButton, Color.White,"Visiteur", 25.sp, activity)
        EditButton(WhiteLight,Color.Black,"Admin",25.sp, activity)

        Text(text = "Seuls les administrateurs peuvent modifier quoi que ce soit",
            color = Color.White,
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            lineHeight = 20.sp,
            modifier = Modifier.
            padding(vertical = 5.dp, horizontal = 30.dp, )
        )
    }
}