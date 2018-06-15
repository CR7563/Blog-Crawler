package blog.open1111.service;

import java.util.List;
import java.util.Map;

import blog.open1111.entity.Article;

/**
 * ����Service�ӿ�
 * @author java1234_С��
 *
 */
public interface ArticleService {

	
	/**
	 * ��ѯָ������������µ���������
	 * @param typeId
	 * @return
	 */
	public Integer getNumByTypeId(Integer typeId);
	
	/**
	 * ����������ҳ��ѯ����
	 * @param map
	 * @return
	 */
	public List<Article> list(Map<String,Object> map);
	
	/**
	 * ����������ҳ��ѯ���� ���ݷ������ڽ�������
	 * @param map
	 * @return
	 */
	public List<Article> list2(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * ��ȡ�Ѿ����������ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal2(Map<String,Object> map);
	
	/**
	 * ͨ��id��ѯ����
	 * @param id
	 * @return
	 */
	public Article findById(Integer id);
	
	/**
	 * ���������Ϣ
	 * @param article
	 * @return
	 */
	public Integer add(Article article);
	
	/**
	 * �޸�������Ϣ
	 * @param article
	 * @return
	 */
	public Integer update(Article article);
	
	/**
	 * ɾ��������Ϣ
	 * @param id
	 * @return
	 */
	public Integer delete(Integer id);
	
	/**
	 * ��ȡ7����������
	 * @return
	 */
	public List<Article> getHot();
	
	/**
	 * ��ȡ��һ������
	 * @param id
	 * @return
	 */
	public Article getLastArticle(Integer id);
	
	/**
	 * ��ȡ��һ������
	 * @param id
	 * @return
	 */
	public Article getNextArticle(Integer id);
}
