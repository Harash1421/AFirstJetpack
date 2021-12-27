package com.example.firstjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.FloatDecayAnimationSpec
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstjetpack.ui.theme.FirstJetpackTheme
import com.example.firstjetpack.ui.theme.Typography
import java.time.format.TextStyle
import java.util.function.DoublePredicate

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstJetpackTheme {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.Start
                ) {
                    CustomItems(
                        Width = 270.dp,
                        Weight = 1f,
                        Color = MaterialTheme.colors.onBackground
                    )
                }
                Box()
            }
        }
    }
}
//Column And Row
@Composable
fun RowScope.CustomItems(Width:Dp, Weight:Float, Color:Color){
    Surface(
        modifier = Modifier
            .width(Width)
            .height(50.dp)
            .weight(Weight),
        color = Color
    ) {}
    Surface(
        modifier = Modifier
            .height(50.dp)
            .width(270.dp)
            .weight(1f),
        color = MaterialTheme.colors.primaryVariant
    ) {}
}

//Box
@Composable
fun Box(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Box(
            modifier = Modifier
                .background(Color.Blue)
                .height(150.dp)
                .width(150.dp)
                .verticalScroll(rememberScrollState()),
                contentAlignment = Alignment.Center
        ){
            Box(modifier = Modifier
                .width(75.dp)
                .height(75.dp)
                .background(Color.DarkGray))
            Text(text = "Hello")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
//Custom Text
@Composable
fun CustomText(text:String){
    Text(text = text, style = Typography.h4)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FirstJetpackTheme {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Start
        ) {
            CustomItems(Width = 270.dp, Weight = 1f, Color = MaterialTheme.colors.onBackground)
        }
        Box()
    }
}