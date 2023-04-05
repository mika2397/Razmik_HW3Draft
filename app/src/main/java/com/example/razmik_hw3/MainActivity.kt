package com.example.razmik_hw3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage
import androidx.compose.material.Text
import com.example.razmik_hw3.DataClasses.newsData
import com.example.razmik_hw3.newsResources.News

class MainActivity : AppCompatActivity() {
    private val dataLoaderViewModel: DataLoaderViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataLoaderViewModel.loadNews()
        dataLoaderViewModel.newsList.observe(this) { newsList ->
            setContent {
                NewsList(newsList = newsList)
            }

        }

    }
}

@Composable
fun NewsList(newsList: List<News>) {

    LazyColumn {
        items(newsList) {   news ->
            NewsCard(news)
        }
    }
}

@Composable
fun NewsCard(news: News) {
    Column {
        Text(text = news.title)
        Text(text = news.name)
        AsyncImage(
            model = news.imageUrl,
            error = painterResource(id = R.drawable.errorimg),
            contentDescription = news.author,
            placeholder = painterResource(id = R.drawable.loadingimg)
        )

    }
}