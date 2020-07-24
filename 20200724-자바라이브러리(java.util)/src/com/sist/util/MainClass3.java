package com.sist.util; 
//p.507
import java.util.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r=new Random();
		int[] resDay=new int[r.nextInt(10)+5]; //5~14
		
		String day="";
		for(int i=0;i<resDay.length;i++)
		{
			resDay[i]=r.nextInt(31)+1;
			day+=resDay[i]+"|";
		}
		day=day.substring(0, day.lastIndexOf("|")); // lastIndexOf("|") 마지막 오아 제거
		
		System.out.println(day);
		
		
		
		
		
		// 날짜별 분리
		String[] resdays=day.split("\\|");
		
		/*
		 *    정규식
		 *     ^ => 시작 문자    ^A  => ^[가-힣] ^[A-Za-z] ^[0-9]
		 *                          [^가-힣] => 제외 
		 *     $ => 끝문자
		 *     . => 임의의 한글자(모든글자) ==> \\.
		 *     | => 선택
		 *     ? => 있으면출력, 없으면 미출력
		 */
		for(String s:resdays)
		{
			System.out.println(s);
		}
		
		System.out.println("===========StirngTokenizer=====");
		
		StringTokenizer st=new StringTokenizer(day, "|");
		while(st.hasMoreTokens())

			System.out.println(st.nextToken());
		}
		
	}

