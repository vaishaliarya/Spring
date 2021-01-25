package com.ncu.factory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Iworker sw=Factory.getObject();
//LazyWorker lw=new LazyWorker();
ManageWorker mw=new ManageWorker(sw);
mw.manageWorker();
	}

}
