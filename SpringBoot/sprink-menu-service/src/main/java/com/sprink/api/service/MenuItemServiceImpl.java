package com.sprink.api.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprink.api.exception.MenuItemNotFoundException;
import com.sprink.api.model.MenuItem;
import com.sprink.api.repository.MenuItemRepository;

@Service
public class MenuItemServiceImpl implements MenuItemService {

	@Autowired
	private MenuItemRepository repo;
	
	@Override
	public MenuItem save(MenuItem menuitem) {
		menuitem.setCreatedTime(LocalDateTime.now());
		return repo.save(menuitem);
	}

	@Override
	public List<MenuItem> getAll() {
		
		return repo.findAll();
	}

	@Override
	public Optional<MenuItem> getMenuById(int id) throws MenuItemNotFoundException {
		
		Optional<MenuItem> menuitem=repo.findById(id);
	    if(menuitem.isEmpty()) {
	    	throw new MenuItemNotFoundException("item not found");
	    }
		return menuitem;
	}

	@Override
	public MenuItem updateMenuById(MenuItem item1,int id) throws MenuItemNotFoundException{
		Optional<MenuItem> item=repo.findById(id);
	
		item1.setId(id);
		 if(item.isEmpty()) {
		    	throw new MenuItemNotFoundException("item not found");
		   }
			item1.setUpdatedTime(LocalDateTime.now());
		return repo.save(item1);
	}

	@Override
	public int deleteMenuBYId(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
