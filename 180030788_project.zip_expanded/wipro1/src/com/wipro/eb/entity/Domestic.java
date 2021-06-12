package com.wipro.eb.entity;

public class Domestic extends Connection{

	public Domestic(int currentReading, int previousReading, float[] slabs) {
		super(currentReading, previousReading, slabs);	
	}
	
	public float computeBill()
	{
		if(currentReading < 51)
		{
			float bill =  (float) (currentReading*2.3);
			return bill;
		}
		else if(currentReading >50 && currentReading<101)
		{
			int k=currentReading-50;
			float bill =  (float) ((50*2.3)+(k*4.2));
			return bill;
		}
		else
		{
			int k=currentReading-100;
			float bill =  (float) ((50*2.3)+(50*4.2)+(k*5.5));
			return bill;
		}
	}

}
