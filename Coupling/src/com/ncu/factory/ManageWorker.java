package com.ncu.factory;

public class ManageWorker {
//SmartWorker sw;
//LazyWorker lw;
	Iworker iw;
public ManageWorker(Iworker iw) {
	this.iw=iw;
}
public void manageWorker() {
  iw.work();
	
}
}
