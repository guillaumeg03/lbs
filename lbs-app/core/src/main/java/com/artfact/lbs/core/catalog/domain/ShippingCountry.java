package com.artfact.lbs.core.catalog.domain;

import java.io.Serializable;
import java.util.List;

public interface ShippingCountry extends Serializable{

	public Long getId();
	
	public void setId(Long id);
	
	public String getCurrencyCode();
	
	public void setCurrencyCode(String currencyCode);
	
	public String getCountryISO();
	
	public void setCountryISO(String countryIso);
	
	public List<MyCompanyProduct> getProducts();

	public void setProducts(List<MyCompanyProduct> products);
}
