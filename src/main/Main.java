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
		arrKor.add("������");

		// 1.�ܾ��߰� 2.�ܾ���� 3.�ܾ���� 4.����
		while (true) {
			System.out.println("--------------------");
			System.out.println("���� �ܾ� ��� :");
			for (int i = 0; i < arrEng.size(); i++) {
				System.out.print((i+1) + ". " + arrEng.get(i) + " : ");
				System.out.println(arrKor.get(i));
			}
			System.out.println("������ �Ͻðڽ��ϱ�?");
			System.out.println("1.�ܾ� �߰� 2.�ܾ� ���� 3.�ܾ� ���� 4.����");
			input = scan.nextLine();
			if (input.equals("1")) {
				System.out.println("�߰��� ���� �ܾ �Է��ϼ���.");
				input = scan.nextLine();
				arrEng.add(input);
				System.out.println("�߰��� �ܾ��� �ѱ� ���� �Է��ϼ���");
				input = scan.nextLine();
				arrKor.add(input);
				System.out.println("�߰��Ǿ����ϴ�.");
			} else if (input.equals("2")) {
				System.out.println("������ �ܾ �����ϼ���.");
				input = scan.nextLine();
				int num = Integer.parseInt(input);
				arrEng.remove(num - 1);
				arrKor.remove(num - 1);
				System.out.println(num + "���� �����Ǿ����ϴ�.");
			} else if (input.equals("3")) {
				System.out.println("������ �ܾ �����ϼ���.");
				input = scan.nextLine();
				System.out.println("������ ���� �ܾ �Է��ϼ���.");
				String input2 = scan.nextLine();
				System.out.println("������ �ܾ��� �ѱ� ���� �Է��ϼ���.");
				String input3 = scan.nextLine();
				int num = Integer.parseInt(input);
				arrEng.set(num - 1, input2);
				arrKor.set(num - 1, input3);
				System.out.println(num + "���� �����Ǿ����ϴ�.");
			} else if (input.equals("4")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
	}

}
