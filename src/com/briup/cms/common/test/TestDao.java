package com.briup.cms.common.test;

import com.briup.cms.bean.Category;
import com.briup.cms.dao.CategoryDao;

public class TestDao {
public static void main(String args[]){
	CategoryDao categoryDao = new CategoryDao();
	categoryDao.save(new Category("点击","122365"));
}
}
