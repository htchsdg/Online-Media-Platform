package com.zhuang.utils.thread;

import com.zhuang.model.user.pojos.ApUser;

public class AppThreadLocalUtil {

    private final static ThreadLocal<ApUser> WM_USER_THREAD_LOCAL = new ThreadLocal<>();

    /**
     * 添加用户
     * @param apUser
     */
    public static void  setUser(ApUser apUser){
        WM_USER_THREAD_LOCAL.set(apUser);
    }

    /**
     * 获取用户
     */
    public static ApUser getUser(){
        return WM_USER_THREAD_LOCAL.get();
    }

    /**
     * 清理用户
     */
    public static void clear(){
        WM_USER_THREAD_LOCAL.remove();
    }
}
