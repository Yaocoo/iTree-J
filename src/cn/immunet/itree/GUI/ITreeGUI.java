package cn.immunet.itree.GUI;

import java.util.Arrays;

import cn.immunet.itree.service.ITree;

public class ITreeGUI {
	
	public static final int GENERATE_TREE = 0;
	public static final int GENERATE_DIST = 1;
	
	public static void run(int requestCode, Client clientContext) {
        ITree iTree = new ITree();
		if (requestCode == GENERATE_TREE) {
			Object[] objs = clientContext.group1ListModel.toArray();
			String[] pathNames = Arrays.asList(objs).toArray(new String[0]);
			iTree.generateTree(pathNames);
		} else if (requestCode == GENERATE_DIST) {
			Object[] objs1 = clientContext.group1ListModel.toArray();
			Object[] objs2 = clientContext.group2ListModel.toArray();
			String[] pathNames1 = Arrays.asList(objs1).toArray(new String[0]);
			String[] pathNames2 = Arrays.asList(objs2).toArray(new String[0]);
			iTree.generateDistance(pathNames1, pathNames2);
		}
	}
	
	
}
