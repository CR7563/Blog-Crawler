package blog.open1111.entity;

/**
 * 管理员实体
 * @author java1234_小锋
 *
 */
public class Manager {

	private Integer id; // 编号
	private String userName; // 用户名
	private String password; // 密码
	
	
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Manager(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
