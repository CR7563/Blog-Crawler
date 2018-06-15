package blog.open1111.dao;

import java.util.List;
import java.util.Map;

import blog.open1111.entity.ArcType;

/**
 * 帖子类型Dao接口
 * @author java1234_小锋
 *
 */
public interface ArcTypeDao {

	/**
	 * 根据条件分页查询帖子类型集合
	 * @param map
	 * @return
	 */
	public List<ArcType> list(Map<String,Object> map);
	
	/**
	 * 通过id查询帖子类型
	 * @param id
	 * @return
	 */
	public ArcType findById(Integer id);
	
	
	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * 更新帖子类别
	 * @param arcType
	 * @return
	 */
	public Integer update(ArcType arcType);
	
	
	/**
	 * 添加帖子类别
	 * @param arcType
	 * @return
	 */
	public Integer add(ArcType arcType);
	
	/**
	 * 删除帖子类别信息
	 * @param id
	 * @return
	 */
	public Integer delete(Integer id);
}
