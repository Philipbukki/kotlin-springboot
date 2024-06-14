package com.pbukki.articles.service

import com.pbukki.articles.entity.Article

interface ArticleService {
    fun addArticle(article: Article): Article
    fun getArticles(): List<Article>
    fun getArticle(id: Long): Article
    fun deleteArticle(id: Long)
    fun updateArticle(article: Article, id: Long): Article
}
