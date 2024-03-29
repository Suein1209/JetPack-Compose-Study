package com.suein.myapplication.jpub.chapter.ch46.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.suein.myapplication.jpub.chapter.ch46.NavRoute

@Composable
fun Home(navController: NavController) {
    var userName by remember { mutableStateOf("") }
    val onUserNameChange = { text: String -> userName = text }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            CustomTextField(
                title = "Enter yout name",
                textState = userName,
                onTextChange = onUserNameChange
            )

            Spacer(modifier = Modifier.size(30.dp))

            Button(onClick = {
                navController.navigate(NavRoute.Welcome.rout + "/$userName") //이렇게 파라미터를 넣을 수 있다.
            }) { Text(text = "Register") }
        }
    }
}

@Composable
fun CustomTextField(
    title: String,
    textState: String,
    onTextChange: (String) -> Unit
) {
    OutlinedTextField(
        value = textState,
        onValueChange = { onTextChange(it) },
        singleLine = true,
        label = { Text(title) },
        modifier = Modifier.padding(10.dp),
        textStyle = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp)
    )
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    Home()
//}