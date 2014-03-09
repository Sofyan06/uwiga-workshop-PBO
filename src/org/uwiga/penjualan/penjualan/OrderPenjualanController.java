package org.uwiga.penjualan.penjualan;

import org.uwiga.penjualan.cutomer.MasterCustomerController;

public class OrderPenjualanController {
	private OrderPenjualanView view;
	private OrderPenjualanModel model;
	public OrderPenjualanController(OrderPenjualanView parvView, OrderPenjualanModel parModel){
		this.view=parvView;
		view.reset();
	}
	
	public static void main(String[] args) {
		
	}
}
