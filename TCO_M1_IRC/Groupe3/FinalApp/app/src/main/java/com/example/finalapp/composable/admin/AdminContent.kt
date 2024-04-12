package com.example.finalapp.composable.admin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.finalapp.MainActivity
import com.example.finalapp.R

@Composable
fun AdminContent(activity: Activity) {
    Box(
    ){
        Image(
            painter = painterResource(id = R.drawable.accueil),
            contentDescription = null
        )
        Column(
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)
        ) {
            Row(horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()){
                Icon(
                    modifier = Modifier
                        .clickable {
                            val navigate = Intent(activity, MainActivity::class.java)
                            ContextCompat.startActivity(activity, navigate, Bundle.EMPTY)
                        },
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = null,
                    tint = Color.White,
                )
                Text(
                    text = "Semaine \nde la\n Télécommunication",
                    fontSize = 20.sp,
                    color = Color.White,
                    lineHeight = 35.sp,
                    textAlign = TextAlign.Center,
                )
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = null,
                    tint = Color.White,
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 40.dp))
            {
                ListAdminRow()
            }

        }

    }
}