package com.example.navegacaofluxotelas.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun PerfilScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    nome: String,
    idade: Int
) {
    Box(
        modifier = modifier.fillMaxSize()
            .background(Color(0xff329f6b))
            .padding(32.dp)
    ) {
        Text(
            text = "PERFIL - $nome - $idade",
            fontSize = 24.sp,
            color = Color.White,
            fontWeight = FontWeight.SemiBold
        )

        Button(
            onClick = {
                navController.navigate("menu")
            },
            modifier = Modifier.align(Alignment.Center),
            colors = ButtonDefaults.buttonColors(
                Color.White
            )
        ) {
            Text(
                text = "Voltar",
                fontSize = 20.sp,
                color = Color.Blue,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}