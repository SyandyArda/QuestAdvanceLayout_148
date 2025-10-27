package com.example.praktikum3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.width



@Composable
fun ActivitasPertama(modifier: Modifier){
    Column(
        modifier = Modifier
            .padding(top=100.dp)
            .padding(top=70.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        @@ -45,13 +45,13 @@
        stringResource(R.string.univ),
        fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(25.dp))
        Spacer(modifier = Modifier.height(5.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(12.dp),
            colors = CardDefaults.cardColors(
                contentColor = Color.White
                        containerColor = Color.DarkGray
            )
        ) {
            Row() {
                @@ -69,13 +69,13 @@
                stringResource(R.string.nama),
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Magenta,
                color = Color.White,
                modifier = Modifier.padding(top = 15.dp)
                )
                Text(
                    stringResource(R.string.alamat),
                    fontSize = 20.sp,
                    color = Color.Black,
                    color = Color.Yellow,
                    modifier = Modifier.padding(top = 10.dp)
                )
            }
            @@ -89,8 +89,9 @@
            stringResource(R.string.Copy),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 50.dp)
                .padding(bottom = 20.dp)
            )
        }
    }
}
}
