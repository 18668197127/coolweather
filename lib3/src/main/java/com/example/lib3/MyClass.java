package com.example.lib3;

import com.example.lib3.gson.Message;
import com.example.lib3.gson.User;
import com.example.lib3.util.JsonReaderUtil;
import com.example.lib3.util.JsonWriteUtil;
import com.google.gson.stream.JsonWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/*
读写json文件
 */

public class MyClass {
    public static void main(String[] args) throws IOException {
        File file=new File("E:/6.txt");

        //文件不存在则写入,文件存在则读取
        if (true != file.exists()) {
            JsonWriteUtil jsonWriteUtil=new JsonWriteUtil();
            OutputStream out = new FileOutputStream(file);
            List<Message> messages = new ArrayList<>();
            Message message = new Message();
            message.setId(1);
            message.setText("nihao");
            List<Double> geo = new ArrayList<>();
            geo.add(20.0);
            geo.add(21.1);
            message.setGeo(geo);
            User user = new User();
            user.setFollowers_count(11);
            user.setName("wo");
            message.setUser(user);
            messages.add(message);


           jsonWriteUtil.writeJsonStream(out, messages);
        }else {
            InputStream in = new FileInputStream(file);
            byte b[] = new byte[1024];
            in.read(b);
            System.out.println(new String(b));
        }
        InputStream in = new FileInputStream(file);
        JsonReaderUtil jsonReaderUtil=new JsonReaderUtil();
        List<Message> readMessages=jsonReaderUtil.readJsonStream(in);
        System.out.println(readMessages);


    }

}
