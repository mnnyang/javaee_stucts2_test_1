package cn.xxyangyoulin.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;
import java.util.Map;

public class TypeAction extends ActionSupport {

    private Date date;

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String execute() throws Exception {

        ActionContext context = ActionContext.getContext();
        Map<String, Object> session = context.getSession();
        session.put("key", date.toString());

        return SUCCESS;
    }
}
