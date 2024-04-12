package com.example.finalapp.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.finalapp.R

@Composable
fun EventInfo(
    onDismiss:()->Unit,
    actualDay: List<Any>
) {
    AlertDialog(

        modifier = Modifier
            .fillMaxWidth()
            .height(700.dp)
            .background(Color.White, shape = RoundedCornerShape(18.dp)),
        onDismissRequest = onDismiss,
        confirmButton = { /*TODO*/},
        title = {
            Text(
                text = "${actualDay.get(1)}",
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        },

        text = {
            Column {
                Text(
                    text = "Horaire : ",
                    modifier = Modifier
                        .padding(top = 10.dp),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "${actualDay.get(3)}",
                    modifier = Modifier
                        .padding(top = 10.dp, start = 25.dp),
                    fontSize = 15.sp
                )

                Text(
                    text = "Participant :",
                    modifier = Modifier
                        .padding(top = 30.dp),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "${actualDay.get(4)}",
                    modifier = Modifier
                        .padding(top = 10.dp, start = 25.dp),
                    fontSize = 15.sp
                )

                Text(
                    text = "Description : ",
                    modifier = Modifier
                        .padding(top = 25.dp),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "${actualDay.get(5)}",
//                    text = "${stringResource(id = R.string.Monday_description)}",
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 10.dp)
                        .verticalScroll(rememberScrollState()),
                    softWrap = true,
                    fontSize = 15.sp
                )


            }
        }
    )
}