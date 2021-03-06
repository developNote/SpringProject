package com.example.pacong.Jsoup;

import org.eclipse.jetty.util.IO;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.URL;

/**
 * Created by xuwencong on 2019/4/18
 */
public class Douban {
    private static final String URL = "http://www.dbmeinv.com/?p=";
    private static final String PIC_PATH = "E:/douban/girl";
    private static String USER_AGENT = "Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; WOW64; Trident/5.0";

    public static void main(String[] args) {
        System.out.println("开始下载图片");
        for (int i = 0; i < 50; i++) {
            try {
                Elements img = CommonUtil.getElements(URL, i);
                for (Element element : img) {
                    CommonUtil.getAndDownloadImage(element,PIC_PATH);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("图片下载完成！");
    }


}
