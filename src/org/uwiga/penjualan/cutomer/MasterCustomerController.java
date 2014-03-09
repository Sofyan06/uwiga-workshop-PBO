package org.uwiga.penjualan.cutomer;

public class MasterCustomerController {
	MasterCustomerView view;
	MasterCustomerModel model;
	public MasterCustomerController(MasterCustomerModel parModel, MasterCustomerView parView){
		this.view = parView;
		view.reset();
	}
	public static void main(String[] args) {
		
	}
}
