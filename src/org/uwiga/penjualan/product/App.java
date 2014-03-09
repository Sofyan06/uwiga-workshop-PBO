package org.uwiga.penjualan.product;

public class App {

	public static void main(String[] args) {
		MasterProductModel Model= new MasterProductModel();
		MasterProductView View= new MasterProductView(Model);
		MasterProductController controller=new MasterProductController(View, Model);
		View.setVisible(true);
	}

}
