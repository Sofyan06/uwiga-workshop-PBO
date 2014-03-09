package org.uwiga.penjualan.penjualan;

import org.uwiga.penjualan.cutomer.CustomerFrame;

public class OrderPenjualanView extends CustomerFrame {
	private OrderPenjualanModel model;
	public OrderPenjualanView(OrderPenjualanModel parModel){
		this.model = parModel;
		
		initVariable();
		
		initForms();
		
	}
	public void initVariable(){
		
	}
	public void initForms(){
		
	}

	public void reloadAll() {
		
	}

	public void reset() {
		getTextAddress().setText(" ");
		getTextIdCust().setText(" ");
		getTextName().setText(" ");
		getTextTransDate().setText(" ");
		getTextFind().setText(" ");
		
	}
	public static void main(String[] args) {
		OrderPenjualanModel model= new OrderPenjualanModel();
		OrderPenjualanView f = new OrderPenjualanView(model);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}
