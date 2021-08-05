package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		
		ArrayList<String> arrEng = new ArrayList<>();
		ArrayList<String> arrKor = new ArrayList<>();

		// 1.단어추가 2.단어삭제 3.단어수정 4.종료
		while (true) {
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("1.단어 추가 2.단어 삭제 3.단어 수정 4.종료");
			input = scan.nextLine();
			
			if (input.equals("1")) {
				System.out.println("추가할 영어 단어를 입력하세요.");
			} else if (input.equals("2")) {
				System.out.println("삭제할 단어를 선택하세요.");
			} else if (input.equals("3")) {
				System.out.println("수정할 단어를 선택하세요.");
			} else if (input.equals("4")){
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
