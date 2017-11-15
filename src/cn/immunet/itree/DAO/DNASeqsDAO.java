package cn.immunet.itree.DAO;

import cn.immunet.itree.model.DNASeqs;

public interface DNASeqsDAO {
	
	DNASeqs read(String pathName);
	
}
