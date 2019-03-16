package com.greenworld.EcomBackend.dao;

import java.util.List;

import com.greenworld.EcomBackend.model.Seller;

public interface SellerDao
{
	boolean insertSeller(Seller seller);
	boolean updateSeller(Seller seller);
	boolean deleteSeller(Seller seller);
	List<Seller>selectAllSellers();
	Seller selectOneSeller();
}
