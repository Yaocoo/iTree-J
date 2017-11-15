package cn.immunet.itree.model;

import cn.immunet.itree.service.Util;

public class Config {
	
	final private String lineBreak = "\n";
	final private int aaSeqUpperLimit = 6000;
	final private int ipsUpperLimit = 1000000;
	
	private int peptideLength = 9;
	private String workPath = Util.normalizePathName(System.getProperty("user.dir") + "\\work\\");
	private String includePath = Util.normalizePathName(System.getProperty("user.dir") + "\\include\\");	
    
	private boolean sixFrameTranslation = false;

    public boolean isSixFrameTranslation() {
        return sixFrameTranslation;
    }

    public void setSixFrameTranslation(boolean sixFrameTranslation) {
        this.sixFrameTranslation = sixFrameTranslation;
    }

	public int getIpsUpperLimit() {
		return ipsUpperLimit;
	}

	public int getPeptideLength() {
		return peptideLength;
	}

	public void setPeptideLength(int peptideLength) {
		this.peptideLength = peptideLength;
	}

	public int getAASeqUpperLimit() {
		return aaSeqUpperLimit;
	}

	public String getWorkPath() {
		return workPath;
	}

    public void setWorkPath(String workspacePath) {
        this.workPath = workspacePath;
    }
    
    public String getIncludePath() {
		return includePath;
	}

	public void setIncludePath(String includePath) {
		this.includePath = includePath;
	}
    
	public String getLineBreak() {
		return lineBreak;
	}

	private static Config instance;
	
	private Config() {}

	public static Config getInstance() {
		if(instance == null) {
			instance = new Config();
		}
		return instance;
	}
}
