package com.pbukki.articles

import com.sun.tools.javac.tree.TreeInfo.args
import io.swagger.v3.oas.annotations.ExternalDocumentation
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Contact
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
@OpenAPIDefinition(
    info = Info(
        title = "Blog App API Documentation",
        description = "Blog App API Documentation for Blog Posts",
        version = "v1",
        contact = Contact(name = "Philip Bukki", email = "phil.bukki@gmail.com", url = "philb.com")
    ),
    externalDocs = ExternalDocumentation(
        description = "Learn more about springdoc-openapi",
        url = "https://springdoc.org/"
    )
)

open class ArticlesApplication

fun main(args: Array<String>){
    SpringApplication.run(ArticlesApplication::class.java, *args)

}


