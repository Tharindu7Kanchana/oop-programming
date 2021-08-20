package com.week5;

class MyOwnException extends Exception{
	public MyOwnException(String s) {
		super(s);
	}
}

class ThrowableDemo
{
	public void Exception1() throws MyOwnException
	{
		try
		{	
			Exception2();
		}
		catch(ArithmeticException e)
		{
			MyOwnException at=new MyOwnException("From MyOwnException");
			at.initCause(e);
			throw at;
		}
	}
	public void Exception2() throws ArithmeticException
	{
		throw new ArithmeticException();
	}
	
}

public class q12 {
	public static void main(String[] args)
	{
		try
		{
			ThrowableDemo td=new ThrowableDemo();
			td.Exception1();
		}
		catch(MyOwnException ex)
		{
			System.out.println(ex.getCause());
			ex.printStackTrace();
		}
	}
}
