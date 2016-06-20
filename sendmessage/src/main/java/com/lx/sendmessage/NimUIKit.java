package com.lx.sendmessage;

import android.content.Context;
import android.location.LocationProvider;

/**
 * UIKit能力输出类。
 */
public final class NimUIKit {

    // context
    private static Context context;

    // 自己的用户帐号
    private static String account;


    // 地理位置信息提供者
    private static LocationProvider locationProvider;

    /**
     * 初始化UIKit，须传入context以及用户信息提供者
     *
     * @param context 上下文
     */
    public static void init(Context context) {
        NimUIKit.context = context.getApplicationContext();
    }


    public static Context getContext() {
        return context;
    }


}
