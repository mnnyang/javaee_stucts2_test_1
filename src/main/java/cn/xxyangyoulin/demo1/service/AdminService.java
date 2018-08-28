package cn.xxyangyoulin.demo1.service;

import cn.xxyangyoulin.demo1.dao.AdminDao;
import cn.xxyangyoulin.demo1.entity.Admin;

import java.util.List;

public class AdminService {

	private AdminDao adminDao = new AdminDao();
	
	public Admin login(Admin admin){
		try {
			return adminDao.login(admin);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Admin> getAll(){
		try {
			return adminDao.getAll();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
