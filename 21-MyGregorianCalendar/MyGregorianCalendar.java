/***************************************************************************
*
* Project: MyJavaTutorials
*
* Copyright (c) 2012 - 2014, Kyle Wickens, <kylewickens@gmail.com>, et al.
*
* This software is licensed as described in the file COPYING, which you
* should have received as part of this distribution. The terms are also
* available at http://kylewickens.blogspot.co.uk/p/copyright-license.html.
*
* You may opt to use, copy, modify, merge, publish, distribute and/or sell
* copies of the Software, and permit persons to whom the Software is
* furnished to do so, under the terms of the COPYING file.
*
* This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY
* KIND, either express or implied.
*
***************************************************************************/
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyGregorianCalendar {
	public static void main(String args[]) {
		String months[]={
			"Jan", "Feb", "Mar", "Apr",
			"May", "Jun", "Jul", "Aug",
			"Sep", "Oct", "Nov", "Dec" };

		GregorianCalendar gcalendar = new GregorianCalendar();

		System.out.println("Date: "
			+ months[gcalendar.get(Calendar.MONTH)]
			+ " "
			+ gcalendar.get(Calendar.DATE)
			+ " "
			+ gcalendar.get(Calendar.YEAR));

		System.out.println("Time: "
			+ gcalendar.get(Calendar.HOUR)
			+ ":"
			+ gcalendar.get(Calendar.MINUTE)
			+ ":"
			+ gcalendar.get(Calendar.SECOND));

		if (gcalendar.isLeapYear(gcalendar.get(Calendar.YEAR))) {
			System.out.println("The current year is a leap year");
		} else {
			System.out.println("The current year is not a leap year");
		}
	}
}

