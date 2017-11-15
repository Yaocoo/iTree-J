package cn.immunet.itree.BO;

public class SystemHelperFactory {

	public static SystemHelper getSystemHelper() {
		return WinHelper.getInstance();
	}
	
}
