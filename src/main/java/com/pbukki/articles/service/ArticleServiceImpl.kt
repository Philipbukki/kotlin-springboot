package com.pbukki.articles.service

import com.pbukki.articles.entity.Article
import com.pbukki.articles.repository.ArticleRepository
import org.springframework.stereotype.Service

@Service
class ArticleServiceImpl(
    private val articleRepository: ArticleRepository

) : ArticleService {

    override fun addArticle(article: Article): Article {
        return articleRepository.save(article)
    }

    override fun getArticles(): List<Article>{
        return articleRepository.findAll().toList().filterNotNull()
    }

    override fun getArticle(id: Long): Article {
        return articleRepository.findById(id).orElse(null)
    }

    override fun deleteArticle(id: Long) {
        val article = articleRepository.findById(id).orElse(null)!!
        articleRepository.delete(article)
    }

    override fun updateArticle(article: Article, id: Long): Article {
        val article1 = getArticle(id)

        article1.title = article.title
        article1.body = article.body

        return articleRepository.save(article1)
    }
}
