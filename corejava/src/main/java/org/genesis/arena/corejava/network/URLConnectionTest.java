package org.genesis.arena.corejava.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by KG on 2017/5/24.
 */
public class URLConnectionTest {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.baidu.com");
            URLConnection connection = url.openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(connection.getInputStream())
            );
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
