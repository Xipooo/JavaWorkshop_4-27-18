package com.wozu.workshop.math;

public class StringToIntConverter {
	int _result;
	Boolean _success;
	
	public int Result() {
		return _result;
	}

	public Boolean Success() { 
		return _success; 
	}

	public StringToIntConverter(String stringToConvert)
    {
        try {
        	_result = Integer.parseInt(stringToConvert);
        	_success = true;
        }
        catch (Exception ex) {
        	_success = false;
        }
    }
}
