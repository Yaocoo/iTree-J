package cn.immunet.itree.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import cn.immunet.itree.model.Config;
import cn.immunet.itree.model.ImmunetPeptides;

public class ImmunetPeptideServ {
	
	private static ImmunetPeptideServ instance;
	
	private ImmunetPeptideServ() {}

	public static ImmunetPeptideServ getInstance() {
		if (instance == null) {
			instance = new ImmunetPeptideServ();
		}
		return instance;
	}
	
	public float getJCDistance(String pathName1, String pathName2) {
		int intersection = 0, union = 0;
		File file1 = new File(pathName1);
		File file2 = new File(pathName2);
		try {
			BufferedReader in1 = new BufferedReader(new FileReader(file1));
			try {
				String line1;
				int upperLimit = Config.getInstance().getIpsUpperLimit();
				int count = 0;
				ImmunetPeptides ips = new ImmunetPeptides();
				while ((line1 = in1.readLine()) != null) {
					if (count < upperLimit) {
						count ++;
					} else {
						intersection += execute(ips, file2);
						ips.clear();
						count = 0;
					}
					ips.add(line1);
				}
				intersection += execute(ips, file2);
			} finally {
				in1.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		int set1Num = Util.getFileLineNumber(file1);
		int set2Num = Util.getFileLineNumber(file2);
		union = set1Num + set2Num - intersection;
		return 1 - ((float)intersection / union);
	}
	
	private int execute(ImmunetPeptides ips, File file2) {
		int intersection = 0;
		try {
			BufferedReader in2 = new BufferedReader(new FileReader(file2));
			try {
				String line2;
				while ((line2 = in2.readLine()) != null) {
					if(ips.contains(line2)) {
						intersection ++;
					}
				}
			} finally {
				in2.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return intersection;
	}
}
