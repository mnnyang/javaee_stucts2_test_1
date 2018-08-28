package cn.xxyangyoulin.demo1.dao;

import java.sql.SQLException;
import java.util.List;

import cn.xxyangyoulin.demo1.entity.Admin;
import cn.xxyangyoulin.demo1.utils.JdbcUtils;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;


public class AdminDao {

	public Admin login(Admin admin){
		String sql = "select * from admin where userName=? and pwd=?";
		try {
			return JdbcUtils.getQuerrRunner()
				.query(
					sql, new BeanHandler<Admin>(Admin.class), admin.getUserName(), admin.getPwd());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Admin> getAll(){
		String sql = "select * from admin ";
		try {
			return JdbcUtils.getQuerrRunner()
				.query(
					sql, 
					new BeanListHandler<Admin>(Admin.class));
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
