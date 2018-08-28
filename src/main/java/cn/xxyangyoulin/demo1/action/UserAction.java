package cn.xxyangyoulin.demo1.action;

import cn.xxyangyoulin.demo1.entity.Admin;
import cn.xxyangyoulin.demo1.service.AdminService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class UserAction extends ActionSupport {

	private Admin admin;
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	private AdminService adminService = new AdminService();
	
	public String login() {
		System.out.println("UserAction login()");
		try {
			Admin userInfo = adminService.login(admin);
			System.out.println("login result->"+userInfo);
			if (userInfo == null){
				return "input";
			}
			ActionContext.getContext().getSession().put("userInfo", userInfo);
			
			return "loginSuccess";
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	
	public String list() {
		try {
			List<Admin> list = adminService.getAll();
			ActionContext.getContext().getContextMap().put("listAdmin", list);
			return "list";
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	
	public String add() {
		return null;
	}

	public static void main(String[] args) {
		System.out.println("hello");
	}
	
}
