package org.uwiga.penjualan.penjualan;

public class App {
	public static void main(String[] args) {
		OrderPenjualanModel Model= new OrderPenjualanModel();
		OrderPenjualanView View= new OrderPenjualanView(Model);
		OrderPenjualanController controller= new OrderPenjualanController(View, Model);
		View.setVisible(true);
	}

}
