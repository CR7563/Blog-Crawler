package blog.open1111.service;

import java.util.List;
import java.util.Map;

import blog.open1111.entity.ArcType;

/**
 * ��������Service�ӿ�
 * @author java1234_С��
 *
 */
public interface ArcTypeService {

	/**
	 * ����������ѯ�û�����
	 * @param map
	 * @return
	 */
	public List<ArcType> list(Map<String,Object> map);
	
	/**
	 * ͨ��id��ѯ��������
	 * @param id
	 * @return
	 */
	public ArcType findById(Integer id);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * �����������
	 * @param arcType
	 * @return
	 */
	public Integer update(ArcType arcType);
	
	
	/**
	 * ����������
	 * @param arcType
	 * @return
	 */
	public Integer add(ArcType arcType);
	
	/**
	 * ɾ�����������Ϣ
	 * @param id
	 * @return
	 */
	public Integer delete(Integer id);
}
