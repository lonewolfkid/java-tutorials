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
public class MyMethodsDemo {
	public static int min(int x, int y) {
		return x < y ? x : y;
	}

	public static int min(int w, int x, int y, int z) {
		return min(min(w, x), min(y, z));
	}

	public static void main(String[] args) {
		System.out.println("Minimum is " + min(4, 3, 2, 1));
	}
}
