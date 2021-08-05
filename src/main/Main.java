package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";

		ArrayList<String> arrEng = new ArrayList<>();
		ArrayList<String> arrKor = new ArrayList<>();
		arrEng.add("orange");
		arrKor.add("오렌지");

		// 1.단어추가 2.단어삭제 3.단어수정 4.종료
		while (true) {
			System.out.println("현재 단어 목록 :");
			for (int i = 0; i < arrEng.size(); i++) {
				System.out.print((i+1) + ". " + arrEng.get(i) + " : ");
				System.out.println(arrKor.get(i));
			}
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("1.단어 추가 2.단어 삭제 3.단어 수정 4.종료");
			input = scan.nextLine();
			if (input.equals("1")) {
				System.out.println("추가할 영어 단어를 입력하세요.");
				input = scan.nextLine();
				arrEng.add(input);
				System.out.println("추가할 단어의 한글 뜻을 입력하세요");
				input = scan.nextLine();
				arrKor.add(input);
				System.out.println("추가되었습니다.");
			} else if (input.equals("2")) {
				System.out.println("삭제할 단어를 선택하세요.");
				input = scan.nextLine();
				int num = Integer.parseInt(input);
				arrEng.remove(num - 1);
				arrKor.remove(num - 1);
				System.out.println(num + "번이 삭제되었습니다.");
			} else if (input.equals("3")) {
				System.out.println("수정할 단어를 선택하세요.");
			} else if (input.equals("4")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
