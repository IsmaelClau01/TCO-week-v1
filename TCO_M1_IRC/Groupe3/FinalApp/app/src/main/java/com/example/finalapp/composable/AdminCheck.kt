package com.example.finalapp.composable

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.finalapp.HomeAdmin
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun AdminCheck(
    onDismiss:()->Unit,
    activity: Activity
) {
    AlertDialog(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(Color.White, shape = RoundedCornerShape(18.dp)),
        onDismissRequest = onDismiss,
        confirmButton = { /*TODO*/},
        text = {
            val text = remember{mutableStateOf("")}
            var errMsg by remember {
                mutableStateOf(false)
            }
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                OutlinedTextField(
                    value = text.value,
                    onValueChange = {newText ->
                        text.value = newText
                    },
                    placeholder = {
                        Text(text = "Entrez le mot de passe...")
                    },
                    label = {
                        Text(text = "Mot de passe")
                    }
                )

                if(errMsg){
                    Text(
                        modifier = Modifier.height(20.dp).fillMaxWidth(),
                        textAlign = TextAlign.Start,
                        text = "Vérifier le mot de passe...",
                        color = Color.Red
                    )
                }
                else{
                    Spacer(modifier = Modifier.padding(top=20.dp))
                }

                Button(
                    onClick = {
                        if(text.value.equals("admin")){
                            val navigate = Intent(activity, HomeAdmin::class.java)
                            ContextCompat.startActivity(activity,navigate, Bundle.EMPTY)
                        }
                        else{errMsg=true}
                    },
                    modifier = Modifier
                        .width(150.dp)
                        .height(40.dp)
                ) {
                    Text(
                        text = "Confirmer",
                        fontSize = 18.sp
                    )
                }
            }
        }
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Check(){
//    AdminCheck()
}