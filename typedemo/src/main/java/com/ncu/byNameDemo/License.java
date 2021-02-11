package com.ncu.byNameDemo;

import java.util.List;

public class License {
	private List<String> names;

	@Override
	public String toString() {
		return "License [names=" + names + "]";
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

}
