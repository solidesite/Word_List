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
		voca.kor = "������";
		vocaArr.add(voca);

		// 1.�ܾ��߰� 2.�ܾ���� 3.�ܾ���� 4.����
		while (true) {
			System.out.println("--------------------");
			System.out.println("���� �ܾ� ��� :");
			for (int i = 0; i < vocaArr.size(); i++) {
				System.out.print((i+1) + ". " + vocaArr.get(i).eng + " : ");
				System.out.println(vocaArr.get(i).kor);
			}
			System.out.println("������ �Ͻðڽ��ϱ�?");
			System.out.println("1.�ܾ� �߰� 2.�ܾ� ���� 3.�ܾ� ���� 4.����");
			input = scan.nextLine();
			if (input.equals("1")) {
				System.out.println("�߰��� ���� �ܾ �Է��ϼ���.");
				input = scan.nextLine();
				voca.eng = input;
				System.out.println("�߰��� �ܾ��� �ѱ� ���� �Է��ϼ���");
				input = scan.nextLine();
				voca.kor = input;
				vocaArr.add(voca);
				System.out.println("�߰��Ǿ����ϴ�.");
			} else if (input.equals("2")) {
				System.out.println("������ �ܾ �����ϼ���.");
				input = scan.nextLine();
				int num = Integer.parseInt(input);
				vocaArr.remove(num - 1);
				System.out.println(num + "���� �����Ǿ����ϴ�.");
			} else if (input.equals("3")) {
				System.out.println("������ �ܾ �����ϼ���.");
				input = scan.nextLine();
				System.out.println("������ ���� �ܾ �Է��ϼ���.");
				String input2 = scan.nextLine();
				System.out.println("������ �ܾ��� �ѱ� ���� �Է��ϼ���.");
				String input3 = scan.nextLine();
				int num = Integer.parseInt(input);
				voca.eng = input2;
				voca.kor = input3;
				System.out.println(num + "���� �����Ǿ����ϴ�.");
			} else if (input.equals("4")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
	}

}
