package blog.open1111.realm;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import blog.open1111.entity.Manager;
import blog.open1111.service.ManagerService;

/**
 * 自定义Realm
 * @author java1234_小锋
 *
 */
public class MyRealm extends AuthorizingRealm{

	@Resource
	private ManagerService managerService;
	
	/**
	 * 为当限前登录的用户授予角色和权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		return null;
	}

	/**
	 * 验证当前登录的用户
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String userName=(String)token.getPrincipal();
		Manager manager=managerService.getByUserName(userName);
		if(manager!=null){
			SecurityUtils.getSubject().getSession().setAttribute("currentUser", manager); // 当前用户信息存到session中
			AuthenticationInfo authcInfo=new SimpleAuthenticationInfo(manager.getUserName(),manager.getPassword(),"xx");
			return authcInfo;
		}else{
			return null;			
		}
	}

}
