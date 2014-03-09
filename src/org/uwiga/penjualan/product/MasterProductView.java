package org.uwiga.penjualan.product;

import org.uwiga.penjualan.cutomer.CustomerFrame;

public class MasterProductView extends CustomerFrame{
	private MasterProductModel model;
	public MasterProductView(MasterProductModel parModel){
		this.model=parModel;
		
		initVariable();
		
		initForms();
		
	}
	public void initVariable(){
		
	}
	public void initForms(){
		
	}

	public void reloadAll() {
		throw new UnsupportedOperationException();
	}

	public void reset() {
		getTextAddress().setText(" ");
		getTextIdCust().setText(" ");
		getTextName().setText(" ");
		getTextTransDate().setText(" ");
		getTextFind().setText(" ");
	}
	public static void main(String[] args) {
		MasterProductModel model= new MasterProductModel();
		MasterProductView f = new MasterProductView(model);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}
