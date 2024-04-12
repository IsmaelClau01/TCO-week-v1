package com.example.finalapp.composable.admin

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.finalapp.R

@Composable
fun ListAdminRow() {
    val day = listOf(
        listOf(
            "Lundi 13",
            "Conférence des entreprises partenaires",
            R.mipmap.monday_event_icon
        ),
        listOf(
            "Mardi 14",
            "Algo Contest et e-sport",
            R.mipmap.tuesday_event_icon
        ),
        listOf(
            "Mercredi 15",
            "Concours de mini-projet",
            R.mipmap.wednesday_event_icon
        ),
        listOf(
            "Jeudi 16",
            "Final des sports inter-classe",
            R.mipmap.thursday_event_icon
        ),
        listOf(
            "Vendredi 17",
            "Grande Réception",
            R.mipmap.friday_event_icon
        )
    )
    LazyColumn (
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ){
        items(day) {
            EventAdminBlock(it)
        }
    }
}