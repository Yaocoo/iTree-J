package cn.immunet.itree.service;

import cn.immunet.itree.DAO.ImmunetPeptidesDAO;
import cn.immunet.itree.DAO.ImmunetPeptidesDAOImpl;
import cn.immunet.itree.model.AASeqs;
import cn.immunet.itree.model.Config;
import cn.immunet.itree.model.ImmunetPeptides;

public class AAServ {
	
	private static AAServ instance;
	
	private AAServ() {}
	
	public static AAServ getInstance() {
		if (instance == null) {
			instance = new AAServ();
		}
		return instance;
	}
	
	public void createImmunetPeptideFile(AASeqs aaSeqs, String targetPathName, int peptideLength) {
		ImmunetPeptides ips = new ImmunetPeptides();
		ImmunetPeptidesDAO ipsDAO = new ImmunetPeptidesDAOImpl();
		int limit = Config.getInstance().getAASeqUpperLimit();
		for (int i = 0, iLimit = aaSeqs.size(); i < iLimit; i++ ) {
			String seqStr = aaSeqs.get(i);
			if ((i % limit) == 0 && i != 0 ) {
				ipsDAO.write(ips, targetPathName);
				ips.clear();
			}
			ips.addAll(processAASeq2Ips(seqStr, peptideLength));
		}
		ipsDAO.write(ips, targetPathName);
	}
	
	private ImmunetPeptides processAASeq2Ips(String seqStr, int peptideLength) {
		ImmunetPeptides ips = new ImmunetPeptides();
		StringBuilder sb = new StringBuilder(seqStr);
		for (int i = 0, iLimit = sb.length() - peptideLength + 1; i < iLimit; i++ ) {
			ips.add(sb.substring(i, i + peptideLength));
		}
		return ips;
	}
	
}
