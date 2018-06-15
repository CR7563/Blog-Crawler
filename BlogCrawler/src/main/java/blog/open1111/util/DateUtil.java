package blog.open1111.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���ڹ�����
 * @author user
 *
 */
public class DateUtil {

	/**
	 * ��ȡ��ǰ������ʱ�����ַ���
	 * @return
	 * @throws Exception
	 */
	public static String getCurrentDateStr()throws Exception{
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
		return sdf.format(date);
	}
	
	/**
	 * ͨ����ǰ������·��
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
