package com.example.rest_api_1.service;

import com.example.rest_api_1.model.Article;
import com.example.rest_api_1.repositery.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public List<Article> selectAll() {
        return articleRepository.findAll();
    }

    @Override
    public Article selectByID() {
        return null;
    }

    @Override
    public void insertArticle(Article article) {

    }
}
