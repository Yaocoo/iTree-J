package cn.immunet.itree.BO;

import java.io.IOException;

import cn.immunet.itree.model.Config;
import cn.immunet.itree.service.Util;


public class WinHelper implements SystemHelper {
	
	private static WinHelper instance;
	
	private WinHelper() {};
	
	public static WinHelper getInstance() {
		if (instance == null) {
			instance = new WinHelper();
		}
		return instance;
	}

	@Override
	public void exec(String command) {
		try {
			Runtime.getRuntime().exec(command);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void execMega() {
		String workPath = Util.denormalizePathName(Config.getInstance().getWorkPath());
		String includePath = Util.denormalizePathName(Config.getInstance().getIncludePath());
		String mega = includePath + "megacc.exe";
		String mao = includePath + "infer_NJ_distances.mao";
		String data = workPath + "matrix.meg";
		String output = workPath + "outtree";
		String command = "cmd /c start " + mega
				+ " -a " + mao
				+ " -d " + data
				+ " -o " + output;
		try {
			Runtime.getRuntime().exec(command);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void execHelp() {
		String rootPath = System.getProperty("user.dir");
        String path = rootPath + "\\Help\\";
        String commond = "notepad.exe \"" + path + "help.txt\"";
        SystemHelperFactory.getSystemHelper().exec(commond);
	}

	@Override
	public void openWorkspace() {
		String commond = "cmd /c start explorer " + Util.denormalizePathName(Config.getInstance().getWorkPath());
        SystemHelperFactory.getSystemHelper().exec(commond);
	}
	
}
