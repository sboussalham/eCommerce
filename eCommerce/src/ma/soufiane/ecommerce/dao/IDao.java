package ma.soufiane.ecommerce.dao;

import java.util.List;

import ma.soufiane.ecommerce.service.model.Article;

public interface IDao {
	void saveArticle(Article article);
	List<Article> getArticleList();
	
	boolean deleteArticle(Article a);
}