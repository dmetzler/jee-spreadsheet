package org.isen.jee.spreadsheet;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SheetImpl implements Sheet {


	private final Map<String,Serializable> cells = new HashMap<>();

	@Override
	public void setValue(String cellAdress, Serializable value) {
		cells.put(cellAdress, value);
	}

	@Override
	public Serializable getValue(String cellAddress) {
		return cells.get(cellAddress);
	}

}
