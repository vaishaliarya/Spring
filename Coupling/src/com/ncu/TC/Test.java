package com.ncu.TC;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SmartWorker sw=new SmartWorker();
LazyWorker lw=new LazyWorker();
ExtraOrdinary ew=new ExtraOrdinary();
ManageWorker mw=new ManageWorker(sw,lw,ew);
mw.manageWorker();
	}

}
