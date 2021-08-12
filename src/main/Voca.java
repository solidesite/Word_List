package main;

public class Voca {
	String eng;
	String kor;

	public Voca(String eng, String kor) {
		this.eng = eng;
		this.kor = kor;
	}

	public Voca() {

	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getEng() {
		return eng;
	}

	public String getKor() {
		return kor;
	}
}
