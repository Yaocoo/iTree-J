package cn.immunet.itree.service;

import java.util.HashMap;
import java.util.Map;

import cn.immunet.itree.model.AASeqs;
import cn.immunet.itree.model.DNASeqs;

public class DNAServ {
	
	private static DNAServ instance;
	private Map<String, String> codenMap;
	
	private DNAServ() {
		init();
	}
	
	public static DNAServ getInstance() {
		if (instance == null) {
			instance = new DNAServ();
		}
		return instance;
	}
	
	public AASeqs translate(DNASeqs dnaSeqs, boolean sixFrame) {
		AASeqs aaSeqs = new AASeqs();
		String seqStr;
		String complementarySeqStr;
		StringBuilder seq1;
		StringBuilder seq2;
		for (int i = 0; i < dnaSeqs.size(); i++) {
			seqStr = dnaSeqs.get(i);
			if (sixFrame) {
				complementarySeqStr = createComplementarySeq(seqStr);
				for (int j = 0; j < 3; j++) {
					seq1 = new StringBuilder();
					seq2 = new StringBuilder();
					for (int k = j; k < seqStr.length() - 2; k += 3) {
						seq1.append(codenMap.get(seqStr.substring(k, k + 3)));
						seq2.append(codenMap.get(complementarySeqStr.substring(k, k + 3)));
					}
					aaSeqs.add(seq1.toString());
					aaSeqs.add(seq2.toString());
				}
			} else {
				seq1 = new StringBuilder();
				for (int j = 0; j < seqStr.length() - 2; j += 3) {
					seq1.append(codenMap.get(seqStr.substring(j, j + 3)));
				}
				aaSeqs.add(seq1.toString());
			}
		}
		return aaSeqs;
	}
	
	public String tranCoden(String seq, int start) {
		String coden;
		if((coden = codenMap.get(seq.substring(start, start + 3))) == null) {
			return "X";
		} else {
			return coden;
		}
	}
	
	public String createComplementarySeq(String seqStr) {
		return new StringBuffer(seqStr).reverse().toString()
				.replace("A", "t")
				.replace("T", "A")
				.replace("t", "T")
				.replace("G", "c")
				.replace("C", "G")
				.replace("c", "C");
	}
	
	private void init() {
		codenMap = new HashMap<String, String>(86);
		codenMap.put("TCA", "S"); //Serine
		codenMap.put("TCC", "S"); //Serine
		codenMap.put("TCG", "S"); //Serine
		codenMap.put("TCT", "S"); //Serine
		codenMap.put("TTC", "F"); //Phenylalanine
		codenMap.put("TTT", "F"); //Phenylalanine
		codenMap.put("TTA", "L"); //Leucine
		codenMap.put("TTG", "L"); //Leucine
		codenMap.put("TAC", "Y"); //Tyrosine
		codenMap.put("TAT", "Y"); //Tyrosine
		codenMap.put("TAA", "-"); //Stop
		codenMap.put("TAG", "-"); //Stop
		codenMap.put("TGA", "-"); //Stop
		codenMap.put("TGC", "C"); //Cysteine
		codenMap.put("TGT", "C"); //Cysteine
		codenMap.put("TGG", "W"); //Tryptophan
		codenMap.put("CTA", "L"); //Leucine
		codenMap.put("CTC", "L"); //Leucine
		codenMap.put("CTG", "L"); //Leucine
		codenMap.put("CTT", "L"); //Leucine
		codenMap.put("CCA", "P"); //Proline
		codenMap.put("CCC", "P"); //Proline
		codenMap.put("CCG", "P"); //Proline
		codenMap.put("CCT", "P"); //Proline
		codenMap.put("CAC", "H"); //Histidine
		codenMap.put("CAT", "H"); //Histidine
		codenMap.put("CAA", "Q"); //Glutamine
		codenMap.put("CAG", "Q"); //Glutamine
		codenMap.put("CGA", "R"); //Arginine
		codenMap.put("CGC", "R"); //Arginine
		codenMap.put("CGT", "R"); //Arginine
		codenMap.put("CGG", "R"); //Arginine
		codenMap.put("ATA", "I"); //Isoleucine
		codenMap.put("ATC", "I"); //Isoleucine
		codenMap.put("ATT", "I"); //Isoleucine
		codenMap.put("ATG", "M"); //Methionine
		codenMap.put("ACA", "T"); //Threonine
		codenMap.put("ACC", "T"); //Threonine
		codenMap.put("ACG", "T"); //Threonine
		codenMap.put("ACT", "T"); //Threonine
		codenMap.put("AAC", "N"); //Asparagine
		codenMap.put("AAT", "N"); //Asparagine
		codenMap.put("AAA", "K"); //Lysine
		codenMap.put("AAG", "K"); //Lysine
		codenMap.put("AGC", "S"); //Serine
		codenMap.put("AGT", "S"); //Serine
		codenMap.put("AGA", "R"); //Arginine
		codenMap.put("AGG", "R"); //Arginine
		codenMap.put("GTA", "V"); //Valine
		codenMap.put("GTC", "V"); //Valine
		codenMap.put("GTG", "V"); //Valine
		codenMap.put("GTT", "V"); //Valine
		codenMap.put("GCA", "A"); //Alanine
		codenMap.put("GCC", "A"); //Alanine
		codenMap.put("GCG", "A"); //Alanine
		codenMap.put("GCT", "A"); //Alanine
		codenMap.put("GAC", "D"); //Aspartic Acid
		codenMap.put("GAT", "D"); //Aspartic Acid
		codenMap.put("GAA", "E"); //Glutamic Acid
		codenMap.put("GAG", "E"); //Glutamic Acid
		codenMap.put("GGA", "G"); //Glycine
		codenMap.put("GGC", "G"); //Glycine
		codenMap.put("GGG", "G"); //Glycine
		codenMap.put("GGT", "G"); //Glycine
	}
}
