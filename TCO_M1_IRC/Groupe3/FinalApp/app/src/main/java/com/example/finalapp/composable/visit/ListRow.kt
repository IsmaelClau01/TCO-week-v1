package com.example.finalapp.composable.visit

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.finalapp.composable.visit.EventBlock
import com.example.finalapp.R

@Composable
fun ListRow() {
    val day = listOf(
        listOf(
            "Lundi 13",
            "Conférence des entreprises partenaires",
            R.mipmap.monday_event_icon,
            "08h-15h",
            "Tout le monde",
            "Decription de la conférence des entreprises"
        ),
        listOf(
            "Mardi 14",
            "Algo Contest et e-sport",
            R.mipmap.tuesday_event_icon,
            "08h-17h",
            "Tous les étudiants de la mention Télécommunication",
            "Decription d'Algo Contest et de l'e-sport'"
        ),
        listOf(
            "Mercredi 15",
            "Concours de mini-projet",
            R.mipmap.wednesday_event_icon,
            "08h-14h",
            "Tous les étudiants de la Mention Télécommunication",
            "Decription du concours de mini-projet"
        ),
        listOf(
            "Jeudi 16",
            "Finales des sports inter-classe",
            R.mipmap.thursday_event_icon,
            "09h-11h",
            "MP2 vs LP2",
            "Description des finales des sports inter-classe"
        ),
        listOf(
            "Vendredi 17",
            "Grande Réception",
            R.mipmap.friday_event_icon,
            "06h-18h30",
            "Elève en Télécommunication, Anciens et Partenaires",
            "Description de la grande Réception"
        )
    )
    LazyColumn (
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ){
        items(day) {
            EventBlock(it)
        }
    }
}