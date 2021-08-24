package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class Main {
	public static void main(String[] args) {
		Control con = new Control();
		ArrayList<Voca> vocaArr = new ArrayList<Voca>();
		Voca v = new Voca();

		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Frame frame = new Frame("frame");
		int frameWidth = 500;
		int frameHeigh = 700;
		frame.setSize(frameWidth, frameHeigh);
		frame.setLocation(screen.width / 2 - frameWidth / 2, screen.height / 2 - frameHeigh / 2);
		frame.setResizable(false);
		frame.setLayout(null);

		JLabel title = new JLabel("단어장");
		title.setSize(100, 40);
		title.setLocation(frameWidth / 2 - 50, 50);
		title.setOpaque(true);
//		title.setBackground(Color.white);
		title.setHorizontalAlignment(JLabel.CENTER);
		Font font = new Font("serif", Font.BOLD, 20);
		title.setFont(font);
		frame.add(title);

		JLabel engLb = new JLabel("영어 입력");
		engLb.setSize(100, 35);
		engLb.setLocation(30, 100);
		engLb.setOpaque(true);
		engLb.setBackground(Color.white);
		frame.add(engLb);

		JLabel korLb = new JLabel("한글 입력");
		korLb.setSize(100, 35);
		korLb.setLocation(30, 140);
		korLb.setOpaque(true);
		korLb.setBackground(Color.white);
		frame.add(korLb);

		JTextField engTf = new JTextField();
		engTf.setLocation(130, 100);
		engTf.setSize(200, 35);
		frame.add(engTf);

		JTextField korTf = new JTextField();
		korTf.setLocation(130, 140);
		korTf.setSize(200, 35);
		frame.add(korTf);

		JButton addBtn = new JButton("추가");
		addBtn.setLocation(340, 100);
		addBtn.setSize(130, 35);
		frame.add(addBtn);

		JButton changeBtn = new JButton("수정");
		changeBtn.setLocation(340, 140);
		changeBtn.setSize(130, 35);
		frame.add(changeBtn);

		JButton deleteBtn = new JButton("삭제");
		deleteBtn.setLocation(340, 640);
		deleteBtn.setSize(130, 35);
		frame.add(deleteBtn);

		DefaultListModel arr = new DefaultListModel();
		JList list = new JList(arr);
		list.setLocation(30, 200);
		list.setSize(440, 400);
		arr.addElement("aaa");
		frame.add(list);

		frame.setVisible(true);

		// 추가 버튼
		addBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String eng = engTf.getText();
				String kor = korTf.getText();
				Voca voca = new Voca(eng, kor);
				vocaArr.add(voca);
				arr.clear();
				for (int i = 0; i < vocaArr.size(); i++) {
					Voca temp = vocaArr.get(i);
					arr.addElement(temp.getEng() + " : " + temp.getKor());
				}
			}
		});

		// 삭제 버튼
		deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int idx = list.getSelectedIndex();
				if (idx == -1) {

				} else {
					vocaArr.remove(idx);
					arr.clear();
					for (int i = 0; i < vocaArr.size(); i++) {
						Voca temp = vocaArr.get(i);
						arr.addElement(temp.getEng() + " : " + temp.getKor());
					}
				}
			}
		});
		// 닫기 버튼
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}
}