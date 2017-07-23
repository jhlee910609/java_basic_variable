package variable;

public class Scope {
	
	// 1. 전역변수 a 선언 
    int a = 1;
    
    public int plus(int c, int d){
    	int e = 30;
    	// 2. 전역변수는 아래와 같이 Scope class 코드블록 안에서 언제든 사용할 수 있다.
    	return c + d + a;
	}
}
