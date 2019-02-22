package com.example.demo.Controller;

public class Test {

    public static void main(String[] args) {
        String aa = "http://test-img-oss.ipaychat.com/test/test175/audit/";

        String bb = "192.168.0.1";

        String cc = getDiskPathByWebpath(aa,bb);

        System.out.printf(cc);
    }

    public static String getDiskPathByWebpath(String pic_url, String disPath) {

        if (pic_url == null || pic_url.trim().length() == 0) {
            return null;
        }
        String url_path = pic_url.split("//")[1];

        String http_fix = pic_url.split("//")[0] + "//";

        int index = url_path.indexOf("/");

        String str = url_path.substring(0, index);

        String domain_name = http_fix + str;

        String path = pic_url.replace(domain_name, disPath);

        return path;
    }
}
