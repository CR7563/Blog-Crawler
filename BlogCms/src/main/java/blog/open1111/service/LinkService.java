package blog.open1111.service;

import java.util.List;
import java.util.Map;

import blog.open1111.entity.Link;

/**
 * 友情链接Service接口
 * @author java1234_小锋
 *
 */
public interface LinkService {

	/**
	 * 根据条件分页查询友情链接集合
	 * @param map
	 * @return
	 */
	public List<Link> list(Map<String,Object> map);
	
	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * 更新友情链接类别
	 * @param link
	 * @return
	 */
	public Integer update(Link link);
	
	
	/**
	 * 添加友情链接类别
	 * @param link
	 * @return
	 */
	public Integer add(Link link);
	
	/**
	 * 删除友情链接类别信息
	 * @param id
	 * @return
	 */
	public Integer delete(Integer id);
	
}
