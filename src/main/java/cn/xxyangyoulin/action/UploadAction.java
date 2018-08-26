package cn.xxyangyoulin.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

public class UploadAction extends ActionSupport {

    private File file1;
    /**
     * 固定写法
     */
    private String file1FileName;
    private String fileContentType;

    public void setFile1(File file1) {
        this.file1 = file1;
    }

    public void setFile1FileName(String file1FileName) {
        this.file1FileName = file1FileName;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }

    @Override
    public String execute() throws Exception {
        String path = ServletActionContext.getServletContext().getRealPath("/upload");
        System.out.println(path);
        System.out.println(file1FileName);
        System.out.println(fileContentType);

        File destFile = new File(path, file1FileName);


        FileUtils.copyFile(file1, destFile);

        return SUCCESS;
    }

    public String list() throws Exception {
        System.out.println("list");

        String path = ServletActionContext.getServletContext().getRealPath("/upload");
        File file = new File(path);
        String[] list = file.list();
        ActionContext ac = ActionContext.getContext();
        Map<String,Object> request = (Map<String, Object>) ac.get("request");

        request.put("fileNames",list);


        return "list";
    }

    private String fileName;

    public void setFileName(String fileName) {
        /*处理传入的参数问题（get提交）*/
        /*try {
            fileName = new String(fileName.getBytes("ISO8859-1"),
                    StandardCharsets.UTF_8);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }*/

        System.out.println("请求的文件名="+fileName);
        this.fileName = fileName;
    }

    /**
     * 下载
     */
    public String down() throws Exception {
        //nothing
        return SUCCESS;
    }

    /**
     * 返回流的方法
     */
    public InputStream getAttrInputStream(){
        return ServletActionContext.getServletContext()
                .getResourceAsStream("/upload/"+fileName);
    }

    /**浏览器显示的文件名*/
    public String getDownFileName(){
        try {
            fileName = URLEncoder.encode(fileName,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println("浏览器文件名输出："+fileName);
        return fileName;
    }
}


























