package com.example.finalapp.composable.admin

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.finalapp.composable.EventInfo
import com.example.finalapp.ui.theme.DateColor
import com.example.finalapp.ui.theme.EventBlock

@Composable
fun EventAdminBlock(day: List<Any>) {
    var showDialog by remember {
        mutableStateOf(false)
    }
    if (showDialog){
        EventInfo(onDismiss = {showDialog=false}, day)
    }
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .background(EventBlock, shape = RoundedCornerShape(20.dp)),
    ){
        Row {
            Text(
                text = "${day.get(0)}",
                modifier = Modifier
                    .padding(start = 10.dp, top = 5.dp)
                    .weight(0.2f),
                fontSize = 30.sp,
                color = DateColor,
                fontWeight = FontWeight.Bold
            )
            Icon(
                modifier = Modifier.padding(15.dp),
                imageVector = Icons.Default.Edit,
                contentDescription = null)
        }
        Text(
            text = "Mai",
            modifier = Modifier
                .padding(start = 10.dp)
                .weight(0.1f),
            fontSize = 15.sp,
            color = DateColor,
            fontWeight = FontWeight.Bold
        )
        Row (modifier = Modifier
            .weight(0.3f)
            .fillMaxWidth()
            .padding(start = 10.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically){
            Icon(
                modifier = Modifier
                    .size(30.dp),
                tint = Color.Black,
                painter = painterResource(id = day.get(2) as Int),
                contentDescription = null)
            Text(
                text = "${day.get(1)}",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(start = 15.dp),
                color = Color.Black
            )
        }

        Icon(
            modifier = Modifier
                .padding(end = 15.dp, bottom = 15.dp)
                .align(Alignment.End)
                .weight(0.2f)
                .clickable { showDialog = true },
            tint = Color.Black,
            imageVector = Icons.Default.Info,
            contentDescription = null,
        )
    }
}