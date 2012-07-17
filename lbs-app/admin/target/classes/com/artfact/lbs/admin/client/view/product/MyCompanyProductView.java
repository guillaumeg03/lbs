package com.artfact.lbs.admin.client.view.product;

import com.artfact.lbs.admin.client.MyCompanyAdminModule;
import com.smartgwt.client.data.DataSource;
import org.broadleafcommerce.admin.client.view.catalog.product.OneToOneProductSkuView;
import org.broadleafcommerce.openadmin.client.view.dynamic.form.FormOnlyView;
import org.broadleafcommerce.openadmin.client.view.dynamic.grid.GridStructureDisplay;
import org.broadleafcommerce.openadmin.client.view.dynamic.grid.GridStructureView;


public class MyCompanyProductView extends OneToOneProductSkuView implements MyCompanyProductDisplay {

	protected GridStructureView shippingCountryDisplay;
	
	@Override
	public void build(DataSource entityDataSource, DataSource... additionalDataSources) {
		super.build(entityDataSource, additionalDataSources);
		shippingCountryDisplay = new GridStructureView(MyCompanyAdminModule.ADMINMESSAGES.shippingCountryListTitle(), false, false);
		((FormOnlyView) dynamicFormDisplay.getFormOnlyDisplay()).addMember(shippingCountryDisplay);
	}

	@Override
	public GridStructureDisplay getShippingCountryDisplay() {
		return shippingCountryDisplay;
	}
	
}
