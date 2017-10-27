package com.sdhsie.railway.common.utils;

/**
 */
public class SqlUtils {

    /**
     * 转换javaboolean与mysql的int值
     * @param intBoolean
     * @return
     */
    public static   boolean toBoolean(int intBoolean){
        return  intBoolean==1;
    }


    public  static int toInt(boolean booleanValue){
        return  booleanValue?1:0;
    }

}
