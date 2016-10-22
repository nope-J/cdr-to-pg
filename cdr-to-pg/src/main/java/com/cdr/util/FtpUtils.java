package com.cdr.util;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.SCPClient;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class FtpUtils {

    public static List<String> getFileNames(String fileKey) {
        List<String> fileNames = new ArrayList<>();
        try {
            for(int i=0;i<144;i++) {
                String fileName = "JF"+fileKey+"00000";
                if (i<10) {
                    fileName += "00" + i;
                }
                else if (i<100) {
                    fileName += "0" + i;
                }
                else {
                    fileName += i;
                }
                fileNames.add(fileName+".DAT");
            }
            return fileNames;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public static List<String> getAllFileNames(){
        List<String> fileNames = new ArrayList<>();
        Connection conn = getConn();
        try {
            Session session = conn.openSession();
            session.execCommand("ls /home/tmp/cdr");
            InputStream stdout = new StreamGobbler(session.getStdout());
            BufferedReader br = new BufferedReader(new InputStreamReader(stdout));
            while(true){
                String line = br.readLine();
                if (line == null){
                    break;
                }
                fileNames.add(line);
            }
            stdout.close();
            session.close();
            conn.close();
            //不是DAT文件
            fileNames.remove(0);

            //不是599格式，先不处理
            fileNames.remove("JF2016092300000088.DAT");
            fileNames.remove("JF2016092800000067.DAT");
            return fileNames;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public static void loadFiles(String[] fileNames,String localPath){
        Connection conn = null;
        conn=getConn();

        try {
            Session session = conn.openSession();
            SCPClient ftp = conn.createSCPClient();

            File file = new File(localPath);
            if (!file.exists()){
                file.mkdir();
            }

            for (int i=0;i<fileNames.length;i++){
                ftp.get(fileNames[i],localPath);
            }
            session.close();
            conn.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static Connection getConn(){
        Connection conn = null;
        conn=new Connection("172.16.203.243",22);
        try {
            conn.connect();
            boolean ok = conn.authenticateWithPassword("root", "59222999");
            if (ok == true){
                return conn;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
