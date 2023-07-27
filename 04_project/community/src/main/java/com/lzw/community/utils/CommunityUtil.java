package com.lzw.community.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import java.util.UUID;

/**
 * @author lzw
 * @create 2023-07-27 10:33
 * 描述：
 * 名称：CommunityUtil
 */
public class CommunityUtil {

    //生成随机字符串
    public static String generateUUID() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    //MD5加密
    //hello --> abc123def456
    // hello + 3e4a8 -> abc123def456abc
    //就是在设定的密码基础上在后面加上一段随机字符串进行加密
    //提高解密的难度，保证了密码的复杂性和安全性
    public static String MD5(String key) {
        if (StringUtils.isBlank(key)) {
            return null;
        }

        return DigestUtils.md5DigestAsHex(key.getBytes());
    }


}
