package ma.soufiane.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.soufiane.ecommerce.dao.IDao;
import ma.soufiane.ecommerce.service.model.Article;

@Transactional
@Service("articleService")
public class ServiceImpl implements IService {

	@Autowired
	private IDao articleDao;
	
	@Override
	public void saveArticle(Article article) {
		articleDao.saveArticle(article);
		
	}

	@Override
	public List<Article> getArticleList() {
		return articleDao.getArticleList();
	}

	@Override
	public boolean deleteArticle(Article a) {
		return articleDao.deleteArticle(a);
	}

}
