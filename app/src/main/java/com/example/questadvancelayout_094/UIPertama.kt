package com.example.questadvancelayout_094

import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@composable
fun ActivitasPertama(modifier: Modifier){
    Column(modifier = Modifier.padding(top=100.dp)
        .fillmaxsize(),
        horizontalAlignment = Alignment.CenterHorizontally)
    ){
        Text(text= stringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold)
    }
}