package com.example.xttttttt;

import android.content.Context;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SaveInfo {
    public static boolean SaveInfoRmation(Context Context, String username, String password_1) throws IOException {
        try {
            FileOutputStream fOS = Context.openFileOutput("data.txt", Context.MODE_APPEND);
            fOS.write(("用户名:" + username + "密码：" + password_1).getBytes());
            fOS.close();
            return true;
        } catch (EOFException e) {
            e.printStackTrace();
            return false;
        }

    }

    public static Map<String, String> getSaveInformation(Context context) {

            try {
                FileInputStream fis = context.openFileInput("data.txt");
                BufferedReader bt = new BufferedReader(new InputStreamReader(fis));
                String str = bt.readLine();
                String[] infos = str.split("用户名:" + "密码:");
                Map<String, String> map = new HashMap<String, String>();
                map.put("username", infos[0]);
                map.put("password", infos[1]);
                fis.close();
                return map;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }





