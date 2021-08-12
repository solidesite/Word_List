package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Control {
	Scanner scan = new Scanner(System.in);
	String input = "";

	ArrayList<Voca> vocaArr = new ArrayList<Voca>();

	// 초기설정
	public void start() {
		while (true) {

			System.out.println("--------------------");
			System.out.println("현재 단어 목록 :");
			for (int i = 0; i < vocaArr.size(); i++) {
				System.out.print((i + 1) + ". " + vocaArr.get(i).eng + " : ");
				System.out.println(vocaArr.get(i).kor);
			}
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("1.단어 추가 2.단어 삭제 3.단어 수정 4.종료");
			input = scan.nextLine();
			if (input.equals("1")) {
				create();
			} else if (input.equals("2")) {
				delite();
			} else if (input.equals("3")) {
				update();
			} else if (input.equals("4")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

	// 단어 추가
	public void create() {
		Voca voca = new Voca();
		System.out.println("추가할 영어 단어를 입력하세요.");
		input = scan.nextLine();
		voca.eng = input;
		System.out.println("추가할 단어의 한글 뜻을 입력하세요");
		input = scan.nextLine();
		voca.kor = input;
		vocaArr.add(voca);
		System.out.println("추가되었습니다.");
	}

	// 단어 삭제
	public void delite() {
		System.out.println("삭제할 단어를 선택하세요.");
		input = scan.nextLine();
		int num = Integer.parseInt(input);
		vocaArr.remove(num - 1);
		System.out.println(num + "번이 삭제되었습니다.");
	}

	// 단어 수정
	public void update() {
		System.out.println("수정할 단어를 선택하세요.");
		input = scan.nextLine();
		System.out.println("수정할 영어 단어를 입력하세요.");
		String input2 = scan.nextLine();
		System.out.println("수정할 단어의 한글 뜻을 입력하세요.");
		String input3 = scan.nextLine();
		int num = Integer.parseInt(input) - 1;
		Voca voca = vocaArr.get(num);
		voca.eng = input2;
		voca.kor = input3;
		System.out.println(num + "번이 수정되었습니다.");
	}

	public void save() {
		FileWriter fw;
		try {
			fw = new FileWriter("c:/filesave/word_list.txt");
			for (int i = 0; i < vocaArr.size(); i++) {
				String data = vocaArr.get(i).eng + "," + vocaArr.get(i).kor + "\r\n";
				fw.write(data);
			}
			fw.close();
			System.out.println("정상 실행");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void load() {
		File file = new File("c:/filesave/test2.txt");
		if (file.exists() == true) {
			try {
				// 한 줄씩 읽기
				BufferedReader br = new BufferedReader(new FileReader("c:/filesave/test2.txt"));
				while (true) {
					String line = br.readLine();
					if (line == null)
						break;
					String[] arr = line.split(",");
					String eng = arr[0];
					String kor = arr[1];
					vocaArr.add(new Voca(eng, kor));
				}
				br.close();

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
