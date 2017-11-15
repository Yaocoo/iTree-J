package cn.immunet.itree.model;

import java.util.ArrayList;

public class DNASeqs extends ArrayList<String> {
	
	private static String[] extension = {"fa", "fna"};
	
	public static boolean validExtension(String ext) {
		boolean flag = false;
		for (int i = 0, iLimit = extension.length; i < iLimit; i ++ ) {
			if (extension[i].equals(ext)) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
}
