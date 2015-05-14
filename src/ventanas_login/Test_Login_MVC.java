package ventanas_login;

public class Test_Login_MVC {

	public static void main(String[] args) {

		Vista1Impl MiVista1 = new Vista1Impl();
		Vista2Impl MiVista2 = new Vista2Impl();
		Vista3Impl MiVista3 = new Vista3Impl();

		MiVista1.setMiVista2(MiVista2);
		MiVista2.setMiVista1(MiVista1);
		
		//Mivista1.setMiVista3(Vista3);
		//Mivista2.setMiVista3(Vista3);

		MiVista1.setVisible(true);
	}

}
