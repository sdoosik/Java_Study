package chapter02;

public class VariableEx01 {

	public static void main(String[] args) {
		
		// 화면에 글자 출력해보기
		System.out.println("Hello, World"); // 화면에 Hello, world를 출력하고 줄바꿈을 한다.
		System.out.print("Hello"); // 화면에 Hello를 출력하고 줄바꿈을 하지않는다.
		System.out.println("Java"); // 위에 Hello가 줄바꿈을 하지않아서 Java가 붙어서 출력된다.
		
		System.out.println();
		
		System.out.println("3+5"); // ""안에 내용을 입력할 경우 연산이 안 되고 문자처럼 출력된다.
		System.out.println(3+5); // ""를 제거하면 연산이 된다.
	}

}
