package org.CoreJava;

public class LanguageInfo {
	private void tamilLanguage() {
    System.out.println("This is TamilLanguage");
	}
	private void EnglishLanguage() {
    System.out.println("This is EnglishLanguage");
	}
	private void hindiLanguage() {
    System.out.println("This is HindiLanguage");
	}
	public class StateInfo  extends LanguageInfo{
		private void southIndia() {
        System.out.println("This is SouthIndia");
		}
		private void northIndia() {
        System.out.println("This is NorthIndia");
		}
	}
	public static void main(String[] args) {
		LanguageInfo l=new LanguageInfo();
		l.tamilLanguage();
		l.EnglishLanguage();
		l.hindiLanguage();
		
	}

}
