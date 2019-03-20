package com.quzeng.gc_gradle_demo.core.util;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
/**
* 编号 生成器
* @author GC
* @2018年7月4日20:28:35
*/
public final class NoGeneratorUtil {

    /**
     *得到32位唯一的UUID
     * @return 唯一编号
     * */
    public static Serializable uuid() {
        UUID uid = UUID.randomUUID();
        return uid.toString().replace("-", "");
    }

    /**
     * 根据长度得到唯一编号
     * @param length
     * 长度
     */
    public static Serializable uuid(int length) {
        UUID uid = UUID.randomUUID();
        String temp = uid.toString().replace("-", "");
        if (length > 0 && length < temp.length()) {
            temp = temp.substring(temp.length() - length);
            return temp;
        }
        return null;
    }
        /**
         * 根据长度得到随机字符串，一位字母一位数字
         * @return 字符串
         */
    public static String unique ( int length){
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < length; i++) {
                if (i % 2 == 0) {
                    str.append(getRandom(97, 122));
                } else {
                    str.append(getRandom(48, 57));
                }
            }
            return String.valueOf(str);
        }
        /**
         * 得到纯数字编号
         * @return
         */
    public static String number(int i){
        StringBuilder string = new StringBuilder();
        while (i > 0){
            string.append(getRandom(49, 57));
            i--;
        }
        return string.toString();
    }

    /**
     * 根据开始和结束大小得到单一字符
     * @param begin
     * 开始值 97, 122 字母
     * @param end
     * 结束值 49, 57 數字
     * @return 单一字符
     */
    private static String getRandom ( int begin, int end){
        String str = "";
        Random rd = new Random();
        int number = 0;
        while (str.length() == 0) {
            number = rd.nextInt(end + 1);
            if (number >= begin && number <= end)
                str = String.valueOf((char) number);
        }
        return str;
    }

    /**
     * 获取YYYYMMDDhhmmss + length长度的编码
     * @param length 尾部随机数字的长度
     * @return 编码
     */
    private static String getNo(int length){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYYMMDDhhmmss");
        String format = simpleDateFormat.format(date);
        return format + number(length);
    }
}
