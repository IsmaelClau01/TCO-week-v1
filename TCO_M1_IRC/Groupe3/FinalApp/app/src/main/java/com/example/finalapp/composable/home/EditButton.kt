package com.example.finalapp.composable.home

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import com.example.finalapp.HomeAdmin
import com.example.finalapp.HomeVisit
import com.example.finalapp.composable.AdminCheck
import com.example.finalapp.composable.EventInfo
import com.example.finalapp.composable.AdminCheck

@Composable
fun EditButton(container_Color : Color, conaint_color : Color, text : String, size : TextUnit, activity: Activity){
    var showDialog by remember {
        mutableStateOf(false)
    }
    if (showDialog){
        AdminCheck(onDismiss = {showDialog=false}, activity)
    }
    Button(onClick = {
        if(text.equals("Visiteur")){
            val navigate = Intent(activity, HomeVisit::class.java)
            ContextCompat.startActivity(activity,navigate, Bundle.EMPTY)
        }
        else{
            showDialog = true
//            val navigate = Intent(activity, HomeAdmin::class.java)
//            ContextCompat.startActivity(activity,navigate, Bundle.EMPTY)
        }
    },
        shape = RoundedCornerShape(15.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = container_Color,
            contentColor = conaint_color
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        Text(text = text,
            fontSize = size)
    }
}