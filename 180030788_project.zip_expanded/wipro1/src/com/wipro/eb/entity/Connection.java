package com.wipro.eb.entity;

public abstract class Connection {
 int previousReading;
 int currentReading;
 float[] slabs;
 public Connection(int currentReading, int
		 previousReading,float slabs[])
 {
	 this.currentReading=currentReading;
	 this.previousReading=previousReading;
	 this.slabs=slabs;
 }
 public abstract float computeBill();
 public int getpreviousReading()
 {
	 return previousReading;
 }
 public int getcurrentReading()
 {
	 return currentReading;
 }
 public float[] getslabs()
 {
	 return slabs;
 }
}
