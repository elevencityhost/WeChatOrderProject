package com.eric.sell.util;

import java.util.Random;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/22 23:08
 */
public class KeyUtil {
    /**
     * 生成唯一的主键
     * @return
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        int number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
