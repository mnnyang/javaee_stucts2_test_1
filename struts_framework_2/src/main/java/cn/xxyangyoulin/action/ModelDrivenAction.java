package cn.xxyangyoulin.action;

import cn.xxyangyoulin.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;


@Namespace("/model")
@ResultPath(value = "/")
public class ModelDrivenAction extends ActionSupport implements ModelDriven {

    private User user = new User();

    @Override
    public User getModel() {
        return user;
    }

    @Action(value = "index",
            results = {@Result(name = "success", location = "/success.jsp"),})
    @Override
    public String execute() throws Exception {
        System.out.println(user.getName());
        System.out.println(user.getPwd());
        return super.execute();
    }
}
