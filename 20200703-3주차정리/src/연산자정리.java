//20200703(3)

/*
 * 		연산자 => 데이터 가공
 * 		================
 * 		= 연산시  데이터형이 동일해야 연산이 된다 => 데이터형을 같게 만든 다음 연산 수행
 * 									             ==========> 형변환 
 * 															  자동 변환 => 작은 데이터~> 큰데이터
 * 															  강제변환 => 큰 데이터 ~> 작은 데이터 (프로그래머가 직접 처리)
 * 															 *** int이하는 연산이 되면 int로 결과값 나옴
 * 		= char는 모든 연산시에 정수로 변경
 * 		= 연산자 => 약간의 우선순위
 * 					=> 산술 ( +, = => *, /, % 우선순위)
 * 		= 연산자의 종류
 * 			단독사용 : 산술연산자, 증감연산자, 대입연산자
 * 			조건사용 : 비교연산자, 논리연산자, 부정연산자 (********)
 * 					==========================
 * 					1) if문  for문  while문 	
 * 
 * 		변수+연산자+제어문 ( 기능 : 라이브러리 )
 * 		==============															
 */
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1=10;
		byte b2=20;
//		byte b3=b1+b2; => 오류 왜? int됨 => byte+byte=int
		
		int a=10;
		long b=20L;
		double d=10.5;
		double r=a+b+d; // 큰데이터 타입으로 형변환
						// a+b+d
						// a=10.0 b=20.0 d=10.5 => double로 형변환
		
		String s=""; // 가장 큰 데이터는 String
	}

}
