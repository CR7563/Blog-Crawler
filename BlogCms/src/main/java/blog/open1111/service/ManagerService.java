package blog.open1111.service;

import blog.open1111.entity.Manager;

/**
 * ����ԱService�ӿ�
 * @author java1234_С��
 *
 */
public interface ManagerService {

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
