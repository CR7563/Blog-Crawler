package blog.open1111.entity;

/**
 * ����Աʵ��
 * @author java1234_С��
 *
 */
public class Manager {

	private Integer id; // ���
	private String userName; // �û���
	private String password; // ����
	
	
	
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
