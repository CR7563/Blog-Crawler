package blog.open1111.entity;

/**
 * 帖子类别实体
 * @author user
 *
 */
public class ArcType {

	private Integer id; // 编号
	private String typeName; // 类别名称
	private Integer sortNo; // 排列序号 从小到大排序
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Integer getSortNo() {
		return sortNo;
	}
	public void setSortNo(Integer sortNo) {
		this.sortNo = sortNo;
	}
	
	
	
}
