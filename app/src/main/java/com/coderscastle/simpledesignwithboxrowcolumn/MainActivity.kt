package com.coderscastle.simpledesignwithboxrowcolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyDesignMain()
        }
    }
}


@Composable
fun MyDesignMain (){
    Column (modifier = Modifier.padding(top=10.dp)){
        ListItemView(R.drawable.ironman,"Iron Man","Tony Stark")
        ListItemView(R.drawable.captain,"Captain America","Steve Rogers")
        ListItemView(R.drawable.thor,"Thor","Thor Odinson")
        ListItemView(R.drawable.hulk,"Hulk","Bruce Banner")
        ListItemView(R.drawable.black_widow,"Black Widow","Natasha Romanoff")
        ListItemView(R.drawable.hawkay,"Hawkay","Clint Barton")
    }
}


@Preview (showBackground = true, showSystemUi = true)
@Composable
fun MyDesignPreview(){

MyDesignMain()

}

@Composable
fun ListItemView(imageId: Int, title: String, name: String) {
    Row (modifier = Modifier.padding(20.dp)){

        Image(
            painter = painterResource(imageId),
            contentDescription = "user image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(40.dp).clip(CircleShape)
        )
        Column (modifier = Modifier.padding(horizontal = 10.dp, vertical = 0.dp)) {

            Text(text = title, fontWeight = FontWeight.Bold, fontSize = 15.sp)
            Text(text = name, fontSize = 15.sp, color = Color.Gray)
        }

    }
}