package org.lang;

public class StateDetails extends LanguageInfo { 
	String nName;
	String sName;
	public void southIndia() {
		System.out.println(sName);
		
	}
	public void northindia() {
		System.out.println(nName);
		}
	public static void main(String[]args) {
		StateDetails obj=new StateDetails();
		obj.Tamil=247;
		obj.English=26;
		obj.Hindi=48;
		obj.sName="Tamilnadu\nKerala\n";
		obj.nName="Delhi\n HP\n";
		obj.tamilLanguage();
		obj.englishLanguage();
		obj.hindiLanguage();
		obj.southIndia();
		obj.northindia();
	}
	

}
