package cn.xxyangyoulin.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

@Namespace("/hello")
@ResultPath(value = "/")
public class HelloAction extends ActionSupport {

    @Action(value = "hello", results = {
            @Result(name = "success", location = "/login.jsp")
    })
    @Override
    public String execute() throws Exception {
        System.out.println("test 2 ");
        return super.execute();
    }
}
