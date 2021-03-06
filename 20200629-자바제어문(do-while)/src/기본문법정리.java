//202006299(12)

/*
 * 	1.변수 : 한가지 데이터를 저장하는 공간
 * 	  ===
 * 		사용)
 * 			식별자 (변수 명칭법)	=> 메소드,클래스 적용
 * 			=> 알파벳, 한글로 시작(단 알파벳은 대소문자 구분)
 * 			=> 숫자 사용이 가능 (앞에 사용금지)
 * 			=> 특수문자 사용이 가능( _ , $)
 * 			=> 키워드는 사용 금지
 * 			=> 글자수는 제한이 없다 ==> 3~7자 사용
 * 			*** 헝거리언식 표기법
 * 				변수 : fileName , fileSize...
 * 			================================ 메모리의 주소의 별칭 (저장된 위치 확인)
 * 			*** 중복이 되면 안된다..
 * 			=> 변수 ==> 현재(지역변수) => 사용범위가 {}안에서만 사용이 가능
 * 					=> {}이 끝나면 자동 소멸
 * 			=> 선언 방식
 * 				데이터크기 변수명=값;
 * 				=======
 * 				데이터형 ( 정수,실수,논리,문자,문자열)
 * 				*** 지역변수는 반드시 초기값을 설정해야 한다(if문 여러개 사용할때 주의)
 * 				
 * 	2.데이터형
 * 		=====================================================================
 * 					1byte(8bit)   2byte(16bit)   4byte(32bit)   8byte(64bit)
 * 		=====================================================================
 * 			정수		byte			short			int				long	  
 * 		=====================================================================
 * 			실수										float			double
 * 		=====================================================================
 * 			문자						char
 * 		=====================================================================
 * 			논리		boolean
 * 		=====================================================================
 * 			참조										String
 * 		=====================================================================
 * 
 * 
 * 	3.연산자
 *			= 단항연산자
 *
 *				= 증감연산자 (++, --)
 *					★★★무조건 한개를 증가, 한개를 감소
 *					a++ : 다른 연산을 수행한 다음에 증가
 *					++a : 증가를 하고 나중에 다른 연산 수행
 *					=============================== 제어문에서 주로 사용
 *
 *				= 부정연산자 (!)
 *					★★★ 조건문에서 주로 사용 ==> true=>false , false=>true
 *
 *				= 형변환연산자 ((type))
 *					프로그램에서는 연산 처리시에 같은 데이터형만 연산이 된다
 *					10+10.5
 *					==
 *					10.0
 *					10.0 + 10.5 => 20.5 ==> 자동 형변환( 작은데이터 => 큰 데이터로 변경)
 *
 *					109+(int)10.5 => 20 ==> 강제 형변환( 큰데이터 => 작은 데이터로 변경)
 *
 *			= 이항연산자
 *
 *				= 산술연산자( + , - , * , / , %) => 기본 처리 (단독)
 *					=> / (정수/정수=정수)
 *					=> % (부호가 왼쪽편이 남는다)  -5%-2=-1  ★나머지는 부호 조심 -5*-2=10 -5/-2=2
 *					=> int이하 데이터형은 연산시에 => int
 *					   ======
 *						byte, short, char
 *						'A'+'B' ==> char(X) => 131
 *
 *				= 비교연산자(== , != , < , > , <= , >=) : booelan
 *						  ===같다 (정수,실수,논리,문자)
 *						          문자열 => equals()
 *
 *				= 논리연산자( &&, ||)
 *					=> 효율적인 연산
 *						&& ==> 앞에 조건이 false => 뒤에 조건은 연산처리하지 않는다
 *							==> 두 조건이 true일때만 true				
 *						|| ==> 앞에 조건이 true => 뒤에 조건은 연산처리하지 않는다
 *							==> 두조건중에 한개이상 true면 true
 *						===================================
 *										&&       ||
 *						===================================
 *							TT			T		 T
 *						===================================
 *							TF			F 		 T
 *						===================================
 *							FT			F 	     T
 *						===================================
 *							FF			F	 	 F		   
 *						===================================
 *					
 *				=	대입연산자 : 연산결과를 메모리에 저장 (= , += , -=)
 *
 *
 *			= 삼항연산자
 *							조건 ? 값1 : 값2
 *							===
 *							true ==> 값1
 *						   false ==> 값2
 *				
 * 	4.제어문
 * 		= 조건문
 * 			= if : 단일 조건문
 * 				형식)
 * 					if(조건문)
 * 					{
 * 						조건문이 true일 경우에 처리
 * 					}
 * 					==> false => 건너뜀
 * 			= if~else : 선택 조건문 ★★★가장 많이 등장 ( ex) 댓글게시물(2) )
 * 					if(조건문)
 * 					{
 * 					else
 * 					{
 * 						조건문이 false일 조건
 * 					}
 * 			= if~else if~else if~else : 다중조건문 (웹,모바일)
 * 					if(조건문)
 * 					{
 * 						조건문이 true일때 수행 =>종료
 * 					}
 * 					else if(조건문)
 * 					{
 * 						조건문이 true일때 수행 =>종료
 * 					}
 * 					else if(조건문)
 * 					{
 * 						조건문이 true일때 수행 =>종료
 * 					}
 * 					else
 * 					{	
 * 						해당 조건이 없는 경우에 수행
 * 					}
 * 					★★★★★★ 한개의 문장은 반드시 수행한다
 * 		= 선택문
 * 				switch(문자,정수,문자열)     ==>다중 조건문과 동일
 * 				{
 * 					case 문자:
 * 					      실행문자
 * 					   break; ==> 수행 후 종료
 *					case 문자:
 *					      실행문자
 * 					   break; ==> 수행 후 종료
 * 					case 문자:
 * 					      실행문자
 * 					   break; ==> 수행 후 종료
 * 					 default: => 문자가 없는 경우
 *    				      실행문자
 *    			}
 * 		= 반복문
 * 				= for ==>2차 for문 ==> 향상된  for (for~each):횟수지정(배열)
 * 					형식)
 * 								 1     2     4  
 * 							for(초기값;조건식;증가식)
 * 								 반복실행문장  3
 * 
 * 							1-> 2-> 3-> 4
 *  							2-> 3-> 4
 * 								2-> 3-> 4 ==> 2번이 false면 종료
 * 							=> 루프변수 ==> 초기값 ==> 증가를 시켜서 조건이 false
 * 	
 * 							for(int i=1;i<=10;i++)
 * 								System.out.println(i) ==> 1~10까지 출력
 * 
 * 				= while : 횟수가 지정이 없는 경우
 * 							=> 데이터베이스, 파일읽기 사용
 * 							
 * 							초기값		====> 1
 * 							while(조건식)	====> 2
 * 							{
 * 								실행문장 	====> 3
 * 								증가식	====> 4 ==> 2번으로 이동 ( 2번 false가 되면 종료)
 * 							}
 * 			
 * 							int i=1;
 * 							while(i<=10)
 * 							{
 * 								System.out.println(i);
 * 								i++;
 * 							}
 * 	
 * 				= do~while
 * 					형식)
 * 							초기값				=====> 1
 * 							do{
 * 									반복실행문장  	=====> 2
 * 									증가식		=====> 3
 * 							} while(조건식); 		=====> 4 ==> 2,3,4 반복 ==>
 * 		= 반복제어문 ===> 조건문을 동반
 * 			= break => 반복문 종료
 * 					for(int i=1;i<=10;i++)
 * 					{
 * 						if(i==5)
 * 						break;
 * 					}
 * 
 * 			= continue => 원하는 부분을 제외
 * 
 * 					for(int i=1;i<=10;i++)
 * 					{
 * 						if(i==5)
 * 						continue;  ==> i++이동 ==> 6
 * 					}
 * 
 * 				while => continue : 조건식으로 이동(처음에서부터 실행)
 * 				for => continue : 제외 ==> 증가식
 * 
 * 				
 * 			이중  for문
 * 			
 * 			for(초기값;조건식;증가식)    //줄수
 * 			{
 * 				for(초기값;조건시기 증가식) // 한줄에 무엇을 출력하지 여부
 * 				{
 * 					=> 실제 출력내용
 * 								
 * 				}
 * 				====> 다음줄에 내려준다
 * 			}
 * 
 * 	=====================================
 * 	5.데이터를 묶어서 사용 => 배열, 클래스
 * 	6.명령문을 묶어서 사용 => 메소드
 * 	=====================================
 * 	7.데이터+명령문 ==> 객체지향 프로그램
 * 	8.종료하지 않는 프로그램 제작 => 예외처리
 * 	9.자바에서 제공하는 기능
 * 	10.자바에서 제공하는 기능
 * 	11.조립( 사용자 정의 + 라이브러리)
 */
public class 기본문법정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
