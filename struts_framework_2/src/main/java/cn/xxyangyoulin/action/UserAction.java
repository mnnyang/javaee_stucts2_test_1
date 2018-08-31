package cn.xxyangyoulin.action;

import cn.xxyangyoulin.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

@Namespace("/user")
@ResultPath(value = "/")
public class UserAction extends ActionSupport {

    private User user = new User();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public void validate() {
    }

    /**
     * 验证单个方法，
     * 命名规则：
     * validate+方法名
     */
    /*public void validateLogin() {

        if (user.getName() == null || user.getName().equals("")) {
            super.addFieldError("name", "name can't to be empty");
        }

        if (user.getPwd() == null || user.getPwd().equals("")) {
            super.addFieldError("pwd", "pwd can't to be empty");
        }
    }*/
    @Action(value = "login", results = {
            @Result(name = "success", location = "/success.jsp"),
            @Result(name = "input", location = "/login.jsp"),
    })
    public String login() {
        System.out.println("执行login");
        return "success";
    }

    @Action(value = "list",
            results = {@Result(name = "success", location = "/success.jsp"),})
    public String list() {
        System.out.println("执行list");
        return "success";
    }
}
