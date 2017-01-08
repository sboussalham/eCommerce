package ma.soufiane.ecommerce.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ma.soufiane.ecommerce.service.model.Article;

@Repository("articleDao")
public class DaoImpl implements IDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	public void saveArticle(Article article) {
		sessionFactory.getCurrentSession().saveOrUpdate(article);
	}

	@SuppressWarnings("unchecked")
	public List<Article> getArticleList() {
		return (List<Article>) sessionFactory.getCurrentSession()
				.createCriteria(Article.class).list();
	}

	@Override
	public boolean deleteArticle(Article a) {
		try
		{
			sessionFactory.getCurrentSession().delete(a);			
		}
		catch(Exception e){
			return false;			
		}
		return true;
	}
}
