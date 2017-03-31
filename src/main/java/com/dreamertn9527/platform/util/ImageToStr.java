package com.dreamertn9527.platform.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.*;

/**
 * 类描述: 图片转base64编码
 *
 * @date:2017/3/31
 * @修改描述：
 * @modifier ${tags}
 */
public class ImageToStr {

    public static boolean generateImage(String imgStr, String path) {
        if (imgStr == null)
            return false;
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            // 解密
            byte[] b = decoder.decodeBuffer(imgStr);
            // 处理数据
            for (int i = 0; i < b.length; ++i) {
                if (b[i] < 0) {
                    b[i] += 256;
                }
            }
            OutputStream out = new FileOutputStream(path);
            out.write(b);
            out.flush();
            out.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    /**
     * @return
     * @Description: 根据图片转换为base64编码字符串
     * @Author:
     * @CreateTime:
     */
    public static String getImageStr(String imgFile) {
        InputStream inputStream = null;
        byte[] data = null;
        try {
            inputStream = new FileInputStream(imgFile);
            data = new byte[inputStream.available()];
            inputStream.read(data);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 加密
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(data);
    }

    public static void main(String[] args) {
        String strImg = getImageStr("C:\\Users\\tang\\Desktop\\7.png");
        System.out.println("data:image/png;base64," + strImg);
//        generateImage(strImg, "F:/86619-107.jpg");
    }
}
