package com.week6;

class SeriesCalculator extends Thread
{
	private int start;
	private int end;
	private int sum_return;
	public SeriesCalculator(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	public int getSummation()
	{
		return this.sum_return;
	}
	public void run()
	{
		int sum=0;
		for(int i=start;i<=end;i++)
		{
		sum+=i;
		}
		sum_return=sum;
	}
}
public class q5 {
	public static void main(String[] args) {
		SeriesCalculator class1 = new SeriesCalculator(1, 20);
		SeriesCalculator class2 = new SeriesCalculator(21, 40);
		SeriesCalculator class3 = new SeriesCalculator(41, 60);
		SeriesCalculator class4 = new SeriesCalculator(61, 80);
		SeriesCalculator class5 = new SeriesCalculator(81, 100);
		class1.start();
		class2.start();
		class3.start();
		class4.start();
		class5.start();
		System.out.println(class1.getSummation() + class2.getSummation() + class3.getSummation() + class4.getSummation() + class5.getSummation());
	}
}
