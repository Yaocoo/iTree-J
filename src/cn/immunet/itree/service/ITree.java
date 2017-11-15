package cn.immunet.itree.service;

import cn.immunet.itree.BO.SystemHelperFactory;
import cn.immunet.itree.DAO.AASeqsDAO;
import cn.immunet.itree.DAO.AASeqsDAOFastaImpl;
import cn.immunet.itree.DAO.DNASeqsDAO;
import cn.immunet.itree.DAO.DNASeqsDAOFastaImpl;
import cn.immunet.itree.model.AASeqs;
import cn.immunet.itree.model.Config;
import cn.immunet.itree.model.DNASeqs;

public class ITree {
	
	AASeqsDAO aaSeqsDAO = new AASeqsDAOFastaImpl();
	DNASeqsDAO dnaSeqsDAO = new DNASeqsDAOFastaImpl();
	AAServ aaServ = AAServ.getInstance();
	DNAServ dnaServ = DNAServ.getInstance();
	
	public void generateTree(String[] pathNames) {
		pathNames = Util.normalizePathName(pathNames);
		String[] ipFilePathNames = createImmunetPepFile(pathNames);
		float[][] matrix = calculateMatrix(ipFilePathNames);
		String[] names = Util.getNames(pathNames);
		Util.printMatrixForMega(names, matrix);
		SystemHelperFactory.getSystemHelper().execMega();
		System.out.println("Finished!");
	}
	
	public void generateDistance(String[] pathNames1, String[] pathNames2) {
		pathNames1 = Util.normalizePathName(pathNames1);
		pathNames2 = Util.normalizePathName(pathNames2);
		String[] ipFilePathNames1 = createImmunetPepFile(pathNames1);
		String[] ipFilePathNames2 = createImmunetPepFile(pathNames2);
		float[][] matrix = calculateMatrix(ipFilePathNames1, ipFilePathNames2);
		String[] names1 = Util.getNames(pathNames1);
		String[] names2 = Util.getNames(pathNames2);
		Util.printMatrix(names1, names2, matrix);
		System.out.println("Finished!");
	}
	
	public float calculateJCD(String ipFilepathName1, String ipFilePathName2) {
		float jcd = 0;
		jcd = ImmunetPeptideServ.getInstance().getJCDistance(ipFilepathName1, ipFilePathName2);
		System.out.println(jcd);
		return jcd;
	}
	
	public float[][] calculateMatrix(String[] ipFilePathNames) {
		int len = ipFilePathNames.length;
		float[][] matrix = new float[len][len];
		for (int i = 0; i < len; i++ ) {
			matrix[i][i] = 0;
			for (int  j = 0; j < i; j++ ) {
				matrix[j][i] = matrix[i][j] = calculateJCD(ipFilePathNames[i], ipFilePathNames[j]);
			}
		}
		return matrix;
	}
	
	public float[][] calculateMatrix(String[] ipFilePathNames1, String[] ipFilePathNames2) {
		int len1 = ipFilePathNames1.length;
		int len2 = ipFilePathNames2.length;
		float[][] matrix = new float[len1][len2];
		for (int i = 0; i< len1; i ++ ) {
			for (int j = 0; j < len2; j ++ ) {
				matrix[i][j] = calculateJCD(ipFilePathNames1[i], ipFilePathNames2[j]);
			}
		}
		return matrix;
	}
	
	public String[] createImmunetPepFile(String[] pathNames) {
		int len = pathNames.length;
		String[] ipFilePathNames = new String[len];
		for (int i = 0; i < len; i ++ ) {
			ipFilePathNames[i] = Util.getPEPTIDEPathName(pathNames[i]);
			String ext = Util.getExtensionName(pathNames[i]);
			if (AASeqs.validExtension(ext)) {
				AASeqs aaSeqs = aaSeqsDAO.read(pathNames[i]);
				aaServ.createImmunetPeptideFile(aaSeqs,
						ipFilePathNames[i],
						Config.getInstance().getPeptideLength());
				System.gc();
			} else if (DNASeqs.validExtension(ext)) {
				DNASeqs dnaSeqs = dnaSeqsDAO.read(pathNames[i]);
				AASeqs aaSeqs = dnaServ.translate(dnaSeqs, Config.getInstance().isSixFrameTranslation());
				aaServ.createImmunetPeptideFile(aaSeqs,
						ipFilePathNames[i],
						Config.getInstance().getPeptideLength());
				System.gc();
			}
		}
		return ipFilePathNames;
	}
}
