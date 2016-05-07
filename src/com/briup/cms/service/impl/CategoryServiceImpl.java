package com.briup.cms.service.impl;

import java.util.List;

import com.briup.cms.bean.Category;
import com.briup.cms.dao.CategoryDao;
import com.briup.cms.service.ICategoryService;
/**
 * 业务逻辑实现类
 * 事务管理
 * 复杂业务逻辑处理
 * */
public class CategoryServiceImpl implements ICategoryService {
	/**
	 * 关联Dao对象
	 * */
	private CategoryDao categoryDao= new CategoryDao();
		@Override
	public void add(Category category) {
		categoryDao.save(category);
	}
	/**
	 * 添加栏目
	 * */
	@Override
	public List<Category> list() {
		return null;
	}
	
	@Override
	public void delete(long id) {
		
	}

}
