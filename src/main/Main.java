package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		
		ArrayList<Voca> vocaArr = new ArrayList <Voca>();
		Voca voca = new Voca();
		voca.eng = "orange";
		voca.kor = "오렌지";
		vocaArr.add(voca);

		// 1.단어추가 2.단어삭제 3.단어수정 4.종료
		while (true) {
			System.out.println("--------------------");
			System.out.println("현재 단어 목록 :");
			for (int i = 0; i < vocaArr.size(); i++) {
				System.out.print((i+1) + ". " + vocaArr.get(i).eng + " : ");
				System.out.println(vocaArr.get(i).kor);
			}
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("1.단어 추가 2.단어 삭제 3.단어 수정 4.종료");
			input = scan.nextLine();
			if (input.equals("1")) {
				System.out.println("추가할 영어 단어를 입력하세요.");
				input = scan.nextLine();
				voca.eng = input;
				System.out.println("추가할 단어의 한글 뜻을 입력하세요");
				input = scan.nextLine();
				voca.kor = input;
				vocaArr.add(voca);
				System.out.println("추가되었습니다.");
			} else if (input.equals("2")) {
				System.out.println("삭제할 단어를 선택하세요.");
				input = scan.nextLine();
				int num = Integer.parseInt(input);
				vocaArr.remove(num - 1);
				System.out.println(num + "번이 삭제되었습니다.");
			} else if (input.equals("3")) {
				System.out.println("수정할 단어를 선택하세요.");
				input = scan.nextLine();
				System.out.println("수정할 영어 단어를 입력하세요.");
				String input2 = scan.nextLine();
				System.out.println("수정할 단어의 한글 뜻을 입력하세요.");
				String input3 = scan.nextLine();
				int num = Integer.parseInt(input);
				voca.eng = input2;
				voca.kor = input3;
				System.out.println(num + "번이 수정되었습니다.");
			} else if (input.equals("4")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
