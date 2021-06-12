package com.wipro.eb.entity;

public class Commercial extends Connection{

	public Commercial(int currentReading, int previousReading, float[] slabs) {
		super(currentReading, previousReading, slabs);	
	}
	
	public float computeBill()
	{
		float bill =0;
		if(currentReading < 51)
		{
			 bill =  (float) (currentReading*5.2);
			//return bill;
		}
		else if(currentReading >50 && currentReading<101)
		{
			int k=currentReading-50;
			 bill =  (float) ((50*5.2)+(k*6.8));
			//return bill;
		}
		else
		{
			int k=currentReading-100;
			bill =  (float) ((50*5.2)+(50*6.8)+(k*8.3));
			//return bill;
		}
		
		
		if(bill>=10000)
		{
			float ed=(float) (bill*0.09);
			bill=bill+ed;
			return bill;
		}
		if(bill>=5000)
		{
			float ed=(float) (bill*0.06);
			bill=bill+ed;
			return bill;
		}
		if(bill <5000)
		{
			float ed=(float) (bill*0.02);
			bill=bill+ed;
			return bill;
		}
		return bill;
	}
	

}
