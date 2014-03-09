package org.uwiga.penjualan.cutomer;

public class App {
	public App(){
		System.out.println("Coba Tambahan saya");
	}
	public void tambahanHadi(){
		System.out.println("tambahan");
	}

	public static void main(String[] args) {
		App app = new App();
		MasterCustomerModel Model = new MasterCustomerModel();
		MasterCustomerView View = new MasterCustomerView(Model);
		MasterCustomerController controller = new MasterCustomerController(Model,View);
		View.setVisible(true);
		app.tambahanHadi();
		System.out.println("Finish Loading");
	}

}
