package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		
		ArrayList<String> arrEng = new ArrayList<>();
		ArrayList<String> arrKor = new ArrayList<>();

		// 1.�ܾ��߰� 2.�ܾ���� 3.�ܾ���� 4.����
		while (true) {
			System.out.println("������ �Ͻðڽ��ϱ�?");
			System.out.println("1.�ܾ� �߰� 2.�ܾ� ���� 3.�ܾ� ���� 4.����");
			input = scan.nextLine();
			
			if (input.equals("1")) {
				System.out.println("�߰��� ���� �ܾ �Է��ϼ���.");
			} else if (input.equals("2")) {
				System.out.println("������ �ܾ �����ϼ���.");
			} else if (input.equals("3")) {
				System.out.println("������ �ܾ �����ϼ���.");
			} else if (input.equals("4")){
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
	}

}
