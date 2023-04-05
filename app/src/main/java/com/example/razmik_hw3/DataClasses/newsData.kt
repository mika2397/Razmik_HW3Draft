package com.example.razmik_hw3.DataClasses

import com.google.gson.annotations.SerializedName

data class newsData(
    @SerializedName("status")
    var status: String?,
    @SerializedName("totalResults")
    var totalResults: Int?,
    @SerializedName("articles")
    var articles: List<ArticleResponse>?
)
//incorrect
class ArticleResponse(
    @SerializedName("source")
    var source: List<SourceResponse>
)
class SourceResponse(
    @SerializedName("id")
    val id: String?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("title")
    val title: String?,
    //Skipped description
    @SerializedName("url")
    var url: String?,
    @SerializedName("urlToImage")
    val status: String?,

)
