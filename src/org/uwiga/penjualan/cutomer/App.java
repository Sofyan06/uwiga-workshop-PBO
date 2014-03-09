package org.uwiga.penjualan.cutomer;

public class App {

	public static void main(String[] args) {
		MasterCustomerModel Model = new MasterCustomerModel();
		MasterCustomerView View = new MasterCustomerView(Model);
		MasterCustomerController controller = new MasterCustomerController(Model,View);
		View.setVisible(true);
	}

}
