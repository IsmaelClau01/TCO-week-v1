package com.example.projet12

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projet12.Data.DataColor

@Composable
fun HomeScreen(){
    Scaffold (topBar = {
        Column (modifier = Modifier.background(Color.Blue),
            horizontalAlignment = Alignment.CenterHorizontally){
            Row(modifier = Modifier
                .fillMaxWidth()
                .height(140.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Row(modifier = Modifier
                        .size(100.dp)
                        .clip(RoundedCornerShape(50))
                        .background(Color.Blue)
                    ) {
                        Image(painter = painterResource(id = R.drawable.logo), contentDescription =null, modifier = Modifier.fillMaxSize())
                    }
                }
                Column (horizontalAlignment = Alignment.CenterHorizontally){
                    //ajouter profil
                    Row(modifier = Modifier
                        .size(100.dp)
                        .clip(RoundedCornerShape(50))
                        .background(Color.Blue)
                    ) {
                        Image(painter = painterResource(id = R.drawable.profil), contentDescription =null, modifier = Modifier.fillMaxSize())
                    }
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Row(modifier = Modifier
                        .size(100.dp)
                        .clip(RoundedCornerShape(50))
                        .background(Color.Blue)
                    ) {
                        Image(painter = painterResource(id = R.drawable.minipr), contentDescription =null, modifier = Modifier.fillMaxSize())
                    }
                }
            }

            /*Row(modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth()
                .background(shape = RoundedCornerShape(16.dp), color = Color.LightGray)
                .height(35.dp)
                .clip(RoundedCornerShape(24.dp))
                , horizontalArrangement = Arrangement.Absolute.Left,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(imageVector = Icons.Default.Search, contentDescription = null,
                    modifier = Modifier.padding(start = 8.dp, end = 16.dp))
                Text(text = "", style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.Bold)
            }*/
            Row(modifier = Modifier
                .padding(top = 16.dp, bottom = 16.dp)
                //.size(120.dp, 30.dp)
                .background(shape = RoundedCornerShape(8.dp), color = Color.LightGray)
                .clip(RoundedCornerShape(8.dp)), horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                //Icon(imageVector = Icons.Default.Star, contentDescription = null)
                //Icon(imageVector = Icons.Default.Done, contentDescription = null)
                //Text(text = "Jour 1")

            }
        }

    }

        ,bottomBar = {

    },modifier = Modifier
            .background(Color.Blue)
            .padding(horizontal = 16.dp, vertical = 8.dp)
    )
    {
        Column(modifier = Modifier
            .padding(it)
            .background(Color.Blue)
            .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row (modifier = Modifier
                .padding(bottom = 10.dp)
                .fillMaxWidth()){
                Text(text = "Jour-1 Conférence", style = TextStyle(
                    fontWeight = FontWeight.Bold
                ))
            }
            Row (modifier = Modifier
                .height(150.dp)
                .horizontalScroll(rememberScrollState()),
                verticalAlignment = Alignment.CenterVertically) {
                CreateConferenceOrange()
                CreateConferenceCodeo()
                CreateConferenceAlgo()

            }

            //CreeLigneConference("Conférence ", "Vitrine numérique, ESPA", "Mai 13, 2024")
            Row (modifier = Modifier
                .padding(bottom = 10.dp)
                .padding(top = 10.dp)
                .fillMaxWidth()){
                Text(text = "Jour-2 Evènement Culturel", style = TextStyle(
                    fontWeight = FontWeight.Bold))

            }
            Row (modifier = Modifier
                .height(150.dp)
                .horizontalScroll(rememberScrollState()),
                verticalAlignment = Alignment.CenterVertically){
                CreateCategory()
                CreateEsport()

            }
            Row (modifier = Modifier
                .padding(bottom = 10.dp)
                .padding(top = 10.dp)
                .fillMaxWidth()){
                Text(text = "Jour-3 Concours Mini Projet", style = TextStyle(
                    fontWeight = FontWeight.Bold))
            }
            Row (modifier = Modifier
                .height(150.dp)
                .horizontalScroll(rememberScrollState()),
                verticalAlignment = Alignment.CenterVertically){
                ConcourReseauInfo()
                ConcourTelecom()
                ConcourDev()
                ConcourDomo()
                ConcourIot()
            }



            Row (modifier = Modifier
                .padding(bottom = 10.dp)
                .padding(top = 10.dp)
                .fillMaxWidth()){
                Text(text = "Jour-4 Grand reception", fontWeight = FontWeight.Bold)
            }

            CreeLigneConference("Cérémonie de réception", "Espace Ny Ankanintsika ", "17 Mai 2024")
        }

    }
}
@Composable
fun CreateCategory(){
    Column (modifier = Modifier
        .padding(end = 30.dp)
        .size(width = 160.dp, height = 160.dp)
        .clip(shape = RoundedCornerShape(15.dp))
        .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround){
        Row (modifier = Modifier.size(90.dp)){
            Image(painter = painterResource(id = R.drawable.jardinage), contentDescription = null)
        }
        Row {
            Text(text = "Jardinage", color= Color.Black)
        }
    }
}
@Composable
fun CreateEsport(){
    Column (modifier = Modifier
        .padding(end = 30.dp)
        .size(width = 160.dp, height = 160.dp)
        .clip(shape = RoundedCornerShape(15.dp))
        .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround){
        Row (modifier = Modifier.size(90.dp)){
            Image(painter = painterResource(id = R.drawable.esport), contentDescription = null)
        }
        Row {
            Text(text = "Final E.sport", color= Color.Black)
        }
    }
}
@Composable
fun CreateConferenceOrange() {
    Column(
        modifier = Modifier
            .padding(end = 30.dp)
            .size(width = 160.dp, height = 150.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Row(modifier = Modifier.size(100.dp)) {
            Image(painter = painterResource(id = R.drawable.orange), contentDescription = null)
        }
        Row {
            Text(text = "Orange MADAGASCAR", color = Color.Black)
        }
    }
}
@Composable
fun CreateConferenceCodeo() {
    Column(
        modifier = Modifier
            .padding(end = 30.dp)
            .size(width = 160.dp, height = 150.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Row(modifier = Modifier.size(100.dp)) {
            Image(painter = painterResource(id = R.drawable.codeo), contentDescription = null)
        }
        Row {
            Text(text = "Codeo MADAGASCAR", color = Color.Black)
        }
    }
}
@Composable
fun CreateConferenceAlgo() {
    Column(
        modifier = Modifier
            .padding(end = 30.dp)
            .size(width = 160.dp, height = 150.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Row(modifier = Modifier.size(100.dp)) {
            Image(painter = painterResource(id = R.drawable.algo), contentDescription = null)
        }
        Row {
            Text(text = "Algo MADA", color = Color.Black)
        }
    }
}
@Composable
fun ConcourReseauInfo() {
    Column(
        modifier = Modifier
            .padding(end = 30.dp)
            .size(width = 160.dp, height = 160.dp)
            .clip(shape = RoundedCornerShape(10.dp))
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Row(modifier = Modifier.size(95.dp)) {
            Image(painter = painterResource(id = R.drawable.info), contentDescription = null)
        }
        Row {
            Text(text = "Réseaux Info", color = Color.Black)
        }
    }
}
@Composable
fun ConcourTelecom() {
    Column(
        modifier = Modifier
            .padding(end = 30.dp)
            .size(width = 160.dp, height = 160.dp)
            .clip(shape = RoundedCornerShape(10.dp))
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Row(modifier = Modifier.size(95.dp)) {
            Image(painter = painterResource(id = R.drawable.tco), contentDescription = null)
        }
        Row {
            Text(text = "Réseaux TCO", color = Color.Black)
        }
    }
}
@Composable
fun ConcourDev() {
    Column(
        modifier = Modifier
            .padding(end = 30.dp)
            .size(width = 160.dp, height = 180.dp)
            .clip(shape = RoundedCornerShape(10.dp))
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Row(modifier = Modifier.size(80.dp)) {
            Image(painter = painterResource(id = R.drawable.dev), contentDescription = null)
        }
        Row {
            Text(text = "Dev", color = Color.Black)
        }
    }
}
@Composable
fun ConcourDomo() {
    Column(
        modifier = Modifier
            .padding(end = 30.dp)
            .size(width = 160.dp, height = 180.dp)
            .clip(shape = RoundedCornerShape(10.dp))
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Row(modifier = Modifier.size(80.dp)) {
            Image(painter = painterResource(id = R.drawable.domotique), contentDescription = null)
        }
        Row {
            Text(text = "Domotique", color = Color.Black)
        }
    }
}

@Composable
fun ConcourIot() = Column(
    modifier = Modifier
        .padding(end = 30.dp)
        .size(width = 160.dp, height = 180.dp)
        .clip(shape = RoundedCornerShape(10.dp))
        .background(Color.LightGray),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.SpaceAround
) {
    Row(modifier = Modifier.size(80.dp)) {
        Image(painter = painterResource(id = R.drawable.iot), contentDescription = null)
    }
    Row {
        Text(text = "Iot", color = Color.Black)
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}
