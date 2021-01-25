package com.ncu.TC;

public class ManageWorker {
SmartWorker sw;
LazyWorker lw;
ExtraOrdinary ew;
public ManageWorker(SmartWorker sw, LazyWorker lw,ExtraOrdinary ew) {
	super();
	this.sw = sw;
	this.lw = lw;
	this.ew=ew;
}
public void manageWorker() {
	sw.work();
	lw.work();
	ew.work();
}
}
