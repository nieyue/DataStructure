package com.nieyue.classloader;

import sun.misc.Launcher;

import java.net.URL;

/**
 * Created by 聂跃 on 2017/11/22.
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        URL[] urls = Launcher.getBootstrapClassPath().getURLs();
        for (int i = 0; i < urls.length; i++) {
            System.out.println(urls[i].toExternalForm());
        }
    }
}
