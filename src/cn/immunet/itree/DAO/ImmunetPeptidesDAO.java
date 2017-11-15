package cn.immunet.itree.DAO;

import java.io.PrintWriter;

import cn.immunet.itree.BO.IpsHandler;
import cn.immunet.itree.BO.SeqStrHandler;
import cn.immunet.itree.model.ImmunetPeptides;

public interface ImmunetPeptidesDAO {
	void write(ImmunetPeptides ips, String targetPathName);
	void write(ImmunetPeptides ips, String tatgetPathName, PrintWriter out);
	void BufferedRead(String pathName, IpsHandler hdl);
	void read(String pathName, SeqStrHandler hdl);
}
