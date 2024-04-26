@file:Suppress("DEPRECATION")

package com.example.jupiter_task.ui.login.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.material3.ListItemDefaults.contentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jupiter_task.R

@Composable
fun LoginScreen() {
    Box(Modifier.fillMaxSize().padding(16.dp)) {
        Login(Modifier.align(Alignment.Center))

    }

}

@Composable
fun Login(modifier: Modifier) {
    Column(modifier = modifier) {
        HeaderImage()
        Spacer(modifier = Modifier.padding(18.dp))
        EmailField()
        Spacer(modifier = Modifier.padding(6.dp))
        PasswordField()
        Spacer(modifier = Modifier.padding(6.dp))
        ForgotPassword(Modifier.align(Alignment.End))
        Spacer(modifier = Modifier.padding(16.dp))
        LoginButton()
        Spacer(modifier = Modifier.padding(12.dp))
        HorizontalLine()
        ou()

    }
}

@Composable
fun LoginButton() {
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
        Text(text = "Entrar")

    }
}

@Composable
fun ForgotPassword(modifier: Modifier) {
    Text(
        text = "Ainda não tem Conta?",
        modifier = modifier.clickable { },
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFFFFFFFF)
    )
}

@Composable
fun PasswordField() {
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


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun EmailField() {
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
fun HeaderImage() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 2.dp)
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp),
            painter = painterResource(id = R.drawable.saturno),
            contentDescription = "Logo",
            alignment = Alignment.Center
        )
        Text(
            text = "Saturno Tasks",
            fontSize = 32.sp,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp),
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun HorizontalLine() {
    Divider(
        color = Color.White,
        thickness = 1.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    )
}

@Composable
fun ou() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
        verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center
    ) {
        Text(
            text = "Ou",
            fontSize = 18.sp,
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 2.dp),

            )
        Image(
            modifier = Modifier.fillMaxWidth().height(70.dp).padding(top = 16.dp),
            painter = painterResource(id = R.drawable.google),
            contentDescription = "Logo2",
        )
    }
}






