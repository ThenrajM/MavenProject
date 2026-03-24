package com.netz.eurekaApplication;

import org.springframework.stereotype.Component;

@Component
public class DayOfYear 
{
	String cDate="";
	public String dateFirst(String tDate)
	{
		int cYear=Integer.parseInt(tDate.substring(4,8));
		int cMnth=Integer.parseInt(tDate.substring(2,4));
		int cDay=Integer.parseInt(tDate.substring(0,2));
		cDate=dayReturn(cDay,cMnth,cYear);
		return cDate;
	}
	public String monthFirst(String tDate)
	{
		int cYear=Integer.parseInt(tDate.substring(4,8));
		int cMnth=Integer.parseInt(tDate.substring(0,2));
		int cDay=Integer.parseInt(tDate.substring(2,4));
		cDate=dayReturn(cDay,cMnth,cYear);
		return cDate;
	}
	public String yearFirst(String tDate)
	{
		int cYear=Integer.parseInt(tDate.substring(0,4));
		int cMnth=Integer.parseInt(tDate.substring(4,6));
		int cDay=Integer.parseInt(tDate.substring(6,8));
		cDate=dayReturn(cDay,cMnth,cYear);
		return cDate;
	}
	public String yearFirstNC(String tDate)
	{
		int cYear=Integer.parseInt(tDate.substring(0,2));
		int cMnth=Integer.parseInt(tDate.substring(2,4));
		int cDay=Integer.parseInt(tDate.substring(4,6));
		cYear=2000+cYear;
		cDate=dayReturn(cDay,cMnth,cYear);
		return cDate;
	}
	public String dateFirstWS(String tDate)
	{
		int cYear=Integer.parseInt(tDate.substring(6,10));
		int cMnth=Integer.parseInt(tDate.substring(3,5));
		int cDay=Integer.parseInt(tDate.substring(0,2));
		cDate=dayReturn(cDay,cMnth,cYear);
		return cDate;
	}
	public String monthFirstWS(String tDate)
	{
		int cYear=Integer.parseInt(tDate.substring(6,10));
		int cMnth=Integer.parseInt(tDate.substring(0,2));
		int cDay=Integer.parseInt(tDate.substring(3,5));
		cDate=dayReturn(cDay,cMnth,cYear);
		return cDate;
	}
	public String yearFirstWS(String tDate)
	{
		int cYear=Integer.parseInt(tDate.substring(0,4));
		int cMnth=Integer.parseInt(tDate.substring(5,7));
		int cDay=Integer.parseInt(tDate.substring(8,10));
		cDate=dayReturn(cDay,cMnth,cYear);
		return cDate;
	}
	private String dayReturn(int cDay,int cMnth,int cYear)
	{
		String retDate="";
		int[] nDay={0,31,59,90,120,151,181,212,243,273,304,334};
		
		int currDay=nDay[cMnth-1]+cDay;
		if(cYear%4==0&&cMnth>2)
         {
			currDay=currDay+1;
         }
		retDate=Integer.toString(((cYear%10)*1000)+currDay);
		return retDate;
	}
}
