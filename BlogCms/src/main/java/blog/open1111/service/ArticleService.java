package blog.open1111.service;

import java.util.List;
import java.util.Map;

import blog.open1111.entity.Article;

/**
 * 帖子Service接口
 * @author java1234_小锋
 *
 */
public interface ArticleService {

	
	/**
	 * 查询指定的帖子类别下的帖子数量
	 * @param typeId
	 * @return
	 */
	public Integer getNumByTypeId(Integer typeId);
	
	/**
	 * 根据条件分页查询帖子
	 * @param map
	 * @return
	 */
	public List<Article> list(Map<String,Object> map);
	
	/**
	 * 根据条件分页查询帖子 根据发布日期降序排列
	 * @param map
	 * @return
	 */
	public List<Article> list2(Map<String,Object> map);
	
	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * 获取已经发布帖子总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal2(Map<String,Object> map);
	
	/**
	 * 通过id查询帖子
	 * @param id
	 * @return
	 */
	public Article findById(Integer id);
	
	/**
	 * 添加帖子信息
	 * @param article
	 * @return
	 */
	public Integer add(Article article);
	
	/**
	 * 修改帖子信息
	 * @param article
	 * @return
	 */
	public Integer update(Article article);
	
	/**
	 * 删除帖子信息
	 * @param id
	 * @return
	 */
	public Integer delete(Integer id);
	
	/**
	 * 获取7条热门帖子
	 * @return
	 */
	public List<Article> getHot();
	
	/**
	 * 获取上一个帖子
	 * @param id
	 * @return
	 */
	public Article getLastArticle(Integer id);
	
	/**
	 * 获取下一个帖子
	 * @param id
	 * @return
	 */
	public Article getNextArticle(Integer id);
}
