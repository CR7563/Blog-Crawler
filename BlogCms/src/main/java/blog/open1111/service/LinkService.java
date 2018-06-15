package blog.open1111.service;

import java.util.List;
import java.util.Map;

import blog.open1111.entity.Link;

/**
 * ��������Service�ӿ�
 * @author java1234_С��
 *
 */
public interface LinkService {

	/**
	 * ����������ҳ��ѯ�������Ӽ���
	 * @param map
	 * @return
	 */
	public List<Link> list(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * ���������������
	 * @param link
	 * @return
	 */
	public Integer update(Link link);
	
	
	/**
	 * ���������������
	 * @param link
	 * @return
	 */
	public Integer add(Link link);
	
	/**
	 * ɾ���������������Ϣ
	 * @param id
	 * @return
	 */
	public Integer delete(Integer id);
	
}