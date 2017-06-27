package com.easyhousing.dao;

import com.easyhousing.model.BuyHouseComment;

public interface BuyHouseCommentDao {
	
	public void insertBuyHouseComment(BuyHouseComment u);
	public int deleteBuyHouseComment(BuyHouseComment u);
	public int updateBuyHouseComment(BuyHouseComment u);
	public BuyHouseComment selectBuyHouseComment(BuyHouseComment u);
}
