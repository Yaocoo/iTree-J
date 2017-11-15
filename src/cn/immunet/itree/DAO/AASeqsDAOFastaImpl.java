package cn.immunet.itree.DAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import cn.immunet.itree.model.AASeqs;

public class AASeqsDAOFastaImpl implements AASeqsDAO {

	@Override
	public AASeqs read(String pathName) {
		AASeqs aaSeqs = new AASeqs();
		try {
			File file = new File(pathName);
			BufferedReader in = new BufferedReader(new FileReader(file));
			try {
				String line;
				StringBuilder sb = new StringBuilder();
				in.readLine();
				while ((line = in.readLine()) != null) {
					if (line.charAt(0) == '>') {
						aaSeqs.add(sb.toString());
						sb = new StringBuilder();
					} else {
						sb.append(line);
					}
				}
			} finally {
				in.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return aaSeqs;
	}
	
}
