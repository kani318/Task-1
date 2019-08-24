package COmputer;

public class Desktop extends Computer {
	String size;
	public void desktopSize() {
		System.out.println(size);

	}
	public static void main(String[]args) {
		Desktop obj=new Desktop();
		obj.model="HP";
		obj.size="21inch";
		obj.computerModel();
		obj.desktopSize();
		
	}

}
