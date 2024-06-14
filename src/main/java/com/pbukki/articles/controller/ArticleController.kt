package com.pbukki.articles.controller

import com.pbukki.articles.entity.Article
import com.pbukki.articles.service.ArticleService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/v1/articles")
class ArticleController(private val articleService: ArticleService) {
    @PostMapping("")
    fun addArticle(@RequestBody article: Article): ResponseEntity<Article> {
        return ResponseEntity.ok(articleService.addArticle(article))
    }

    @GetMapping("")
    fun getAllArticles(): ResponseEntity<List<Article>>{
        return ResponseEntity.ok(articleService.getArticles())
    }

    @DeleteMapping("/{id}")
    fun deleteArticle(@PathVariable id: Long): HttpStatus {
        articleService.deleteArticle(id)
        return HttpStatus.NOT_FOUND
    }

    @PutMapping("/{id}")
    fun updateArticle(@RequestBody article: Article, @PathVariable id: Long): HttpStatus {
        articleService.updateArticle(article, id)
        return HttpStatus.NO_CONTENT
    }
}
