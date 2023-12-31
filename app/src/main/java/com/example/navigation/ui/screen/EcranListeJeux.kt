package com.example.navigation.ui.screen

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.navigation.listJeux

@Composable
fun EcranListeJeux(navController: NavController) {
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Text(text = "Cliquez sur un jeu pour voir le détail")
        listJeux.forEach {jeu ->
            Button(onClick = {
                Log.d("ListeJeux", "Bouton cliqué pour le jeu ID: ${jeu.id}")
                navController.navigate("DetailsJeu/${jeu.id}") }) {
                Text(text = jeu.nom)
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewEcranListJeu() {
    val navController = rememberNavController()
    EcranListeJeux(navController)
}