package com.lx.sendmessage;

public class FileUtil {
    private static final String TAG = "FileUtil";

    public static boolean hasExtentsion(String filename) {
        int dot = filename.lastIndexOf('.');
        if ((dot > -1) && (dot < (filename.length() - 1))) {
            return true;
        } else {
            return false;
        }
    }

    // 获取文件扩展名
    public static String getExtensionName(String filename) {
        if ((filename != null) && (filename.length() > 0)) {
            int dot = filename.lastIndexOf('.');
            if ((dot > -1) && (dot < (filename.length() - 1))) {
                return filename.substring(dot + 1);
            }
        }
        return "";
    }

}
