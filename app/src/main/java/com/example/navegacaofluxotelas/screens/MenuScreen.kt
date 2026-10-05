package com.example.navegacaofluxotelas.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MenuScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
            .background(Color(0xFF3F51B5))
            .padding(32.dp)
    ) {
        Text(
            text = "MENU",
            fontSize = 24.sp,
            color = Color.White,
            fontWeight = FontWeight.SemiBold
        )

        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = {  },
                colors = ButtonDefaults.buttonColors(Color.White)
            ) {
                Text(
                    text = "Perfil",
                    fontSize = 20.sp,
                    color = Color.Blue,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Button(
                onClick = {  },
                colors = ButtonDefaults.buttonColors(Color.White)
            ) {
                Text(
                    text = "Pedidos",
                    fontSize = 20.sp,
                    color = Color.Blue,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Button(
                onClick = {  },
                colors = ButtonDefaults.buttonColors(Color.White)
            ) {
                Text(
                    text = "Sair",
                    fontSize = 20.sp,
                    color = Color.Blue,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}