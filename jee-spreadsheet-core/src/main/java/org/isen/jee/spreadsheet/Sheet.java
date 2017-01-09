package org.isen.jee.spreadsheet;

import java.io.Serializable;

public interface Sheet {

	void setValue(String cellAdresse, Serializable value);

	Serializable getValue(String cellAddress);

}
