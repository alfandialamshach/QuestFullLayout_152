package com.example.project3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun Layout(modifier: Modifier = Modifier){
    Column (modifier = Modifier.fillMaxSize()){
        tampilanHeader()
        detailmahasiswa(
            Judul ="Nama",
            Isinya="Alfandi"
        )
        detailmahasiswa(
            Judul ="NIM",
            Isinya="20220140152"
        )
        detailmahasiswa(
            Judul ="Alamat",
            Isinya="Banyumas"
        )
        detailmahasiswa(
            Judul ="Email",
            Isinya="a.alamshach.ft22@mail.umy.ac.id"
        )
        detailmahasiswa(
            Judul ="No Hp",
            Isinya="0895340692645"
        )
    }
}

@Composable
fun tampilanHeader() {
    Box(
        modifier = Modifier.fillMaxWidth()
            .background(Color.Gray)
            .padding(20.dp)
    ) {
        Row {
            Box(
                contentAlignment = Alignment.BottomEnd
            ) {
                Image(
                    painterResource(R.drawable.img),
                    contentDescription = null
                )
                Icon(
                    Icons.Default.Done, contentDescription = null,
                    modifier = Modifier.size(28.dp)
                        .background(color = Color.Red, shape = CircleShape),
                    tint = Color.Gray
                )
            }
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "Teknologi Informasi",
                    color = Color.Yellow,
                    fontSize = 20.sp
                )
                Text(
                    text = "Universitas Muhammadiyah Yogyakarta",
                    color = Color.Yellow,
                    fontSize = 17.sp
                )
            }
        }
    }
}
    @Composable
    fun detailmahasiswa(
        Judul: String,
        Isinya:String
    ){
        Row(modifier = Modifier.fillMaxWidth()
            .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Text(Judul, modifier = Modifier.weight(0.8f))
            Text(":", modifier = Modifier.weight(0.2f))
            Text(Isinya, modifier = Modifier.weight(2f))
        }
    }



