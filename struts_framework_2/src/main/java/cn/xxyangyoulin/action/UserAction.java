package cn.xxyangyoulin.action;

import cn.xxyangyoulin.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import java.util.Map;

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

    /**
     * 参数验证
     */
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

    /**
     * 数据回显
     */
    @Action(value = "view_update",
            results = {@Result(name = "success", location = "/view_update.jsp"),})
    public String viewUpdate() {

        User user = new User();
        user.setName("Tom");
        user.setEmail("8888@qq.com");

        ActionContext context = ActionContext.getContext();
        ValueStack valueStack = context.getValueStack();
        valueStack.push(user);

        user = new User();
        user.setName("Bob");
        user.setEmail("9999@qq.com");
        Map<String, Object> requestMap = (Map<String, Object>) context.get("request");
        requestMap.put("user", user);

        return "success";
    }
}
