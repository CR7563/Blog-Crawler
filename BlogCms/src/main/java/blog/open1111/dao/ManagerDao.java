package blog.open1111.dao;

import blog.open1111.entity.Manager;

/**
 * ����ԱDao�ӿ�
 * @author java1234_С��
 *
 */
public interface ManagerDao {

	/**
	 * ͨ���û�����ѯ�û�
	 * @param userName
	 * @return
	 */
	public Manager getByUserName(String userName);
	
	/**
	 * ���¹���Ա��Ϣ
	 * @param manager
	 * @return
	 */
	public Integer update(Manager manager);
	

}
