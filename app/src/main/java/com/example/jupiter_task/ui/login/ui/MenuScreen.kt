package com.example.jupiter_task.ui.login.ui

import android.view.Menu
import android.view.MenuItem
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun MenuScreen() {
    Card(
        modifier = Modifier
            .size(130.dp)
            .padding(20.dp)
            .background(Color.White, RoundedCornerShape(8.dp))
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(16.dp)
        ) {

            Text(text = "Exercicio")
            // Image(painter = painterResource(R.drawable.sua_imagem), contentDescription = null)
        }
    }
}

