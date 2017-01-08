package ma.soufiane.ecommerce.service;

import java.util.List;

import ma.soufiane.ecommerce.service.model.Article;

public interface IService {
	void saveArticle(Article article);
	List<Article> getArticleList();

	boolean deleteArticle(Article a);	
}