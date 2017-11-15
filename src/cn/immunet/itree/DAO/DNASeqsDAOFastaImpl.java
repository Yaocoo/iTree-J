package cn.immunet.itree.DAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import cn.immunet.itree.model.DNASeqs;

public class DNASeqsDAOFastaImpl implements DNASeqsDAO {

	@Override
	public DNASeqs read(String pathName) {
		DNASeqs dnaSeqs = new DNASeqs();
		try {
			File file = new File(pathName);
			BufferedReader in = new BufferedReader(new FileReader(file));
			try {
				String line;
				in.readLine();
				StringBuilder sb = new StringBuilder();
				while ((line = in.readLine()) != null) {
					if(line.charAt(0) == '>') {
						dnaSeqs.add(sb.toString());
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
		return dnaSeqs;
	}
}
