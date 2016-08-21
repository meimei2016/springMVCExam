package com.hand.springMVCExam.jdbc.dao;

import java.util.List;

import com.hand.springMVCExam.bean.Inventory;

public interface InventoryManageDao {
	public List<Inventory> getInventoryByFilmId(int filmId);
	public int deleteByFilmId(int filmId);
}
