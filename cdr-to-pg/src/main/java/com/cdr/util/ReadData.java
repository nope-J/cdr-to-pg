package com.cdr.util;

import java.io.DataInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by nope-J on 2016/10/17.
 */
public class ReadData {
    public static Date getDate(DataInputStream dis) {
        try {
            byte[] byte1 = new byte[1];
            long time = dis.readInt();
            dis.read(byte1);
            int ms = getShort(byte1) * 10;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            long l1 = 0;
            Date d1 = sdf.parse("2000-01-01");
            l1 = d1.getTime();
            Date date = new Date(time * 1000 + l1 + ms);
            if (time == 0) {
                return null;
            }
            return date;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getBitString(byte b) {
        return ""
                + (byte) ((b >> 7) & 0x1) + (byte) ((b >> 6) & 0x1)
                + (byte) ((b >> 5) & 0x1) + (byte) ((b >> 4) & 0x1)
                + (byte) ((b >> 3) & 0x1) + (byte) ((b >> 2) & 0x1)
                + (byte) ((b >> 1) & 0x1) + (byte) ((b >> 0) & 0x1);
    }

    public static Short getShort(byte[] bytes) {
        short n = 0;
        n |= (bytes[0] & 0x00ff);
        return n;
    }

    public static String getBCD(byte[] bytes) {
        StringBuffer temp = new StringBuffer(bytes.length * 2);
        for (int i = 0; i < bytes.length; i++) {
            temp.append((byte) ((bytes[i] & 0xf0) >>> 4));
            temp.append((byte) (bytes[i] & 0x0f));
        }
        String s = temp.toString().substring(0, 1).equalsIgnoreCase("0") ? temp.toString().substring(1) : temp.toString();
        return s;
    }

    public static String getBCD2(byte[] b) {
        StringBuffer temp = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            int n = b[i];
            String str = Integer.toHexString(n);
            char[] chars = str.toCharArray();
            if (chars.length > 1) {
                char c1 = chars[chars.length - 1];
                char c2 = chars[chars.length - 2];
                temp.append(c1);
                temp.append(c2);
            } else {
                if (chars[0] != '0')
                    temp.append(chars[0]);
            }
        }
        String s = temp.toString();
        return s.replace('a', '0');
    }

    public static String getTel(byte[] b) {
        StringBuffer temp = new StringBuffer();

        for (int i = 0; i < b.length; i++) {
            int n = b[i];
            String str = Integer.toHexString(n);
            char[] chars = str.toCharArray();
            if (chars.length > 1) {
                char c1;
                char c2;
                c1 = chars[chars.length - 2];
                c2 = chars[chars.length - 1];
                temp.append(c2);
                temp.append(c1);
            } else {
                if (chars[0] == '0') {
                    break;
                } else
                    temp.append(chars[0]);
            }
        }
        String s = temp.toString();
        String tel = s.replace('a', '0');
        return tel;
    }

    public static String getIp(byte[] b) {
        StringBuffer ip = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            int n = 0x000000FF & b[i];
            ip.append(n + ".");
        }
        ip.delete(ip.lastIndexOf("."), ip.length());
        return ip.toString();
    }

    public static String getODPC(byte[] b) {
        StringBuffer temp = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            temp.append((int) b[i] + "-");
        }
        temp.delete(temp.lastIndexOf("-"), temp.length());
        return temp.toString();
    }
}
