package com.jeff.web.util;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by liuren on 2017/11/5.
 *
 * 加载资源文件
 */
public class PropertiesBLL {

    private static Map<String,Properties> propertiesMap = new HashMap<String,Properties>();

    //传入文件名字
    public static void load(String file){

        if(propertiesMap.containsKey(file)){
            System.out.println("文件"+file+"已经加载过了");
            return;
        }
        String path = null;
        Properties properties = new Properties();
        try {
            path = Thread.currentThread().getContextClassLoader().getResource(file).getPath();
            InputStream in = new BufferedInputStream(new FileInputStream(path));
            properties.load(in);
            //关闭资源
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        propertiesMap.put(file,properties);

    }

    public static String getValue(String key){
        if(propertiesMap.size() == 0){
            System.out.println("先要加载配置文件");
            return null;
        }

        for (Map.Entry<String,Properties> entry : propertiesMap.entrySet()){
            Properties properties = entry.getValue();
            for (Map.Entry<Object,Object> e : properties.entrySet()){
                    if(e.getKey().equals(key)){
                        return (String) e.getValue();
                    }
            }
        }

        return null;
    }
}
