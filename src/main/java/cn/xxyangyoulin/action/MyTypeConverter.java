package cn.xxyangyoulin.action;

import org.apache.struts2.util.StrutsTypeConverter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class MyTypeConverter extends StrutsTypeConverter {

    DateFormat[] df = { new SimpleDateFormat("yyyy-MM-dd"),
            new SimpleDateFormat("yyyyMMdd"),
            new SimpleDateFormat("yyyy/MM/dd"),
            new SimpleDateFormat("yyyy!MM!dd") };


    @Override
    public Object convertFromString(Map map, String[] values, Class aClass) {

        if (values == null || values.length == 0) {
            return null;
        }

        if (Date.class != aClass) {
            return null;
        }


        for (int i=0; i<df.length; i++) {
            try {
                return df[i].parse(values[0]);
            } catch (ParseException e) {
                continue;
            }
        }
        return null;

    }

    @Override
    public String convertToString(Map map, Object o) {
        return null;
    }
}
