package blog.open1111.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import blog.open1111.dao.ManagerDao;
import blog.open1111.entity.Manager;
import blog.open1111.service.ManagerService;

/**
 * ����ԱServiceʵ����
 * @author java1234_С��
 *
 */
@Service("managerService")
public class ManagerServiceImpl implements ManagerService{

	@Resource
	private ManagerDao managerDao;
	
	public Manager getByUserName(String userName) {
		return managerDao.getByUserName(userName);
	}

	public Integer update(Manager manager) {
		return managerDao.update(manager);
	}

}
