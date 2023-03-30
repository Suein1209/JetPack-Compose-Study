package com.suein.myapplication.jpub

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.suein.myapplication.jpub.chapter.Chapter38AnimationActivity
import com.suein.myapplication.jpub.chapter.ch41.Chapter41TestViewModelActivity
import com.suein.myapplication.jpub.chapter.ch46.Chapter46NavigationActivity

@Suppress("SpellCheckingInspection")
class JpubHubActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChapterListView()
        }
    }

    @Composable
    fun ChapterListView() {
        Column() {
            Button(modifier = Modifier.padding(10.dp), onClick = {
                startActivity(Intent(this@JpubHubActivity, Chapter38AnimationActivity::class.java))
            }) {
                Text(text = "Chapter 38 상태주도 애니메이션")
            }

            Button(modifier = Modifier.padding(10.dp), onClick = {
                startActivity(Intent(this@JpubHubActivity, Chapter41TestViewModelActivity::class.java))
            }) {
                Text(text = "Chapter 41 온도 입력 컴포저블 구현하기")
            }

            Button(modifier = Modifier.padding(10.dp), onClick = {
                startActivity(Intent(this@JpubHubActivity, Chapter46NavigationActivity::class.java))
            }) {
                Text(text = "Chapter 46 컴포즈 내비게이션 튜토리얼")
            }

        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        ChapterListView()
    }
}