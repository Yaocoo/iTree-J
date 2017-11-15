package cn.immunet.itree.DAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import cn.immunet.itree.BO.IpsHandler;
import cn.immunet.itree.BO.SeqStrHandler;
import cn.immunet.itree.model.Config;
import cn.immunet.itree.model.ImmunetPeptides;

public class ImmunetPeptidesDAOImpl implements ImmunetPeptidesDAO {

	@Override
	public void write(ImmunetPeptides ips, String targetPathName) {
		try {
			PrintWriter out = new PrintWriter(new FileWriter(new File(targetPathName), true));
			try {
				write(ips, targetPathName, out);
			} finally {
				out.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void write(ImmunetPeptides ips, String targetPathName, PrintWriter out) {
		File targetFile = new File(targetPathName);
		try {
			if (targetFile.exists()) {
				BufferedReader in = new BufferedReader(new FileReader(targetFile));
				try {
					String line;
					while ((line = in.readLine()) != null) {
						if (ips.contains(line)) {
							ips.remove(line);
						}
					}
				} finally {
					in.close();
				}
			}
			Iterator<String> it = ips.iterator();
			while (it.hasNext()) {
				out.println(it.next());
			}
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void BufferedRead(String pathName, IpsHandler hdl) {
		try {
			File file = new File(pathName);
			BufferedReader in = new BufferedReader(new FileReader(file));
			try {
				String line;
				int upperLimit = Config.getInstance().getIpsUpperLimit();
				int count = 0;
				ImmunetPeptides ips = new ImmunetPeptides();
				while ((line = in.readLine()) != null) {
					if (count < upperLimit) {
						count ++;
					} else {
						hdl.handle(ips);
						ips.clear();
						count = 0;
					}
					ips.add(line);
				}
				hdl.handle(ips);
			} finally {
				in.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void read(String pathName, SeqStrHandler hdl) {
		try {
			File file = new File(pathName);
			BufferedReader in = new BufferedReader(new FileReader(file));
			try {
				String line;
				while ((line = in.readLine()) != null) {
					hdl.handle(line);
				}
			} finally {
				in.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
