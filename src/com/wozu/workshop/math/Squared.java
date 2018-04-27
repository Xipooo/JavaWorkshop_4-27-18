package com.wozu.workshop.math;

public class Squared {
	private int _result;
	public int Result() {
		return _result;
	}
    public Squared(int baseNumber)
    {
        _result = baseNumber * baseNumber;
    }
}
