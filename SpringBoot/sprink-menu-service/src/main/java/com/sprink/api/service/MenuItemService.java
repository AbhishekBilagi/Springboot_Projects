package com.sprink.api.service;

import java.util.List;
import java.util.Optional;

import com.sprink.api.exception.MenuItemNotFoundException;
import com.sprink.api.model.MenuItem;

public interface MenuItemService {

	public MenuItem save(MenuItem menuitem);
	public List<MenuItem> getAll();
	
	public Optional<MenuItem> getMenuById(int id) throws MenuItemNotFoundException;
	
	public MenuItem updateMenuById(MenuItem menuitem, int id) throws MenuItemNotFoundException;
	
	public int deleteMenuBYId(int id);
	
}
