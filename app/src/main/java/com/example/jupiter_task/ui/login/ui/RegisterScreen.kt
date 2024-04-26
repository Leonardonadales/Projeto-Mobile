package com.example.jupiter_task.ui.login.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RegisterScreen() {
    Box(Modifier.fillMaxSize().padding(16.dp)) {
        Register(Modifier.align(Alignment.Center))

    }


}

@Composable
fun Register(modifier: Modifier) {
    Column(modifier = modifier) {

        Header()
        Spacer(modifier = Modifier.padding(18.dp))
        EmailField1()
        Spacer(modifier = Modifier.padding(8.dp))
        Passwor2dField()
        Spacer(modifier = Modifier.padding(8.dp))
        RepeatPassword()
        Spacer(modifier = Modifier.padding(28.dp))
        LoginButton2()




    }
}

@Composable
fun LoginButton2() {
    Button(
        onClick = {},
        modifier = Modifier
            .fillMaxWidth()
            .height(46.dp),
        colors = ButtonDefaults.buttonColors(
            disabledContentColor = Color.White,
            contentColor = Color.White
        )

    ) {
        Text(text = "Cadastrar")

    }
}

@Composable
fun EmailField1() {
    TextField(
        value = "", onValueChange = {}, modifier = Modifier
            .fillMaxWidth().padding(horizontal = 2.dp, vertical = 2.dp).clip(RoundedCornerShape(10.dp)),
        placeholder = { Text(text = "Email") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        singleLine = true,
        maxLines = 1,
        textStyle = TextStyle(
            color = Color(0xFF636262),
            background = Color(0xFFDEDDDD),
        )

    )
}

@Composable
fun Passwor2dField() {
    TextField(
        value = "", onValueChange = {},
        placeholder = { Text(text = "Senha") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 2.dp, vertical = 2.dp)
            .clip(RoundedCornerShape(10.dp)),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        singleLine = true,
        maxLines = 1,
        textStyle = TextStyle(
            color = Color(0xFF636262),
            background = Color(0xFFDEDDDD),
        )
    )


}

@Composable
fun RepeatPassword() {
    TextField(
        value = "", onValueChange = {},
        placeholder = { Text(text = " Repetir Senha") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 2.dp, vertical = 2.dp)
            .clip(RoundedCornerShape(10.dp)),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        singleLine = true,
        maxLines = 1,
        textStyle = TextStyle(
            color = Color(0xFF636262),
            background = Color(0xFFDEDDDD),
        )
    )


}

@Composable
fun Header() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 2.dp)
    ) {
        Text(
            text = "Cadastre-se e conheça nossas funcionalidades",
            fontSize = 28.sp,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp),
            textAlign = TextAlign.Center
        )
    }
}


