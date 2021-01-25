package com.ncu.LC;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Iworker sw=Factory.getObject();
//Iworker ew=new ExtraOrdinary();
//LazyWorker lw=new LazyWorker();
ManageWorker mw=new ManageWorker(sw);
mw.manageWorker();
	}

}
