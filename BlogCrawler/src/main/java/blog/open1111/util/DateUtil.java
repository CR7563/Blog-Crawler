package blog.open1111.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 * @author user
 *
 */
public class DateUtil {

	/**
	 * 获取当前年月日时分秒字符串
	 * @return
	 * @throws Exception
	 */
	public static String getCurrentDateStr()throws Exception{
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
		return sdf.format(date);
	}
	
	/**
	 * 通过当前年月日路径
	 * @return
	 * @throws Exception
	 */
	public static String getCurrentDatePath()throws Exception{
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
		return sdf.format(date);
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(getCurrentDatePath());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
