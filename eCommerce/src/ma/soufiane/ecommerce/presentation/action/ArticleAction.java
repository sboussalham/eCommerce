package ma.soufiane.ecommerce.presentation.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import ma.soufiane.ecommerce.domaine.ArticleBean;
import ma.soufiane.ecommerce.domaine.ArticleConverter;
import ma.soufiane.ecommerce.service.IService;

public class ArticleAction extends ActionSupport implements ModelDriven<ArticleBean> {

	private static final long serialVersionUID = 1L;

	@Autowired
	private ArticleBean articleBean;
	
	@Autowired
	private IService articleService;
	
	private List<ArticleBean> articles;

	public String execute() {
		articles = ArticleConverter.createArticleBeanList(articleService.getArticleList());
		return "user";
	}

	public String add() {
		articleService.saveArticle(ArticleConverter.createModel(articleBean));
		articles = ArticleConverter.createArticleBeanList(articleService.getArticleList());
		return "add";
	}

	public String delete() {
		articleService.deleteArticle(ArticleConverter.createModel(articleBean));
		articles = ArticleConverter.createArticleBeanList(articleService.getArticleList());
		return "delete";
	}
	
	public String list() {
		articles = ArticleConverter.createArticleBeanList(articleService.getArticleList());
		return "list";
	}

	@Override
	public ArticleBean getModel() {
		return articleBean;
	}

	public List<ArticleBean> getArticles() {
		return articles;
	}

	public void setUsers(List<ArticleBean> articles) {
		this.articles = articles;
	}
}