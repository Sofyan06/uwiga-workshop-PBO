package org.uwiga.penjualan.product;

import org.uwiga.penjualan.cutomer.MasterCustomerModel;

public class MasterProductController {
	private MasterProductView view;
	private MasterCustomerModel model;
	public MasterProductController(MasterProductView parView, MasterProductModel parModel){
		this.view=parView;
		view.reset();
		
	}
	public static void main(String[] args) {
	
	}
}
