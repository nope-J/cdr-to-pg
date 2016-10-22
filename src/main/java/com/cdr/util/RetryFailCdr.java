package com.cdr.util;

import com.cdr.model.Cdr;
import com.cdr.model.FailRecord;
import com.cdr.model.SuccessRecord;
import com.cdr.service.IService;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by nope-J on 2016/10/17.
 */
public class RetryFailCdr implements Runnable {
    private String localPath = "E:/DAT/";
    private FailRecord failRecord;
    private IService cdrBaseService;
    private IService successRecordBaseService;
    private IService failRecordBaseService;

    public RetryFailCdr(FailRecord failRecord,IService cdrBaseService, IService successRecordBaseService, IService failRecordBaseService){
        this.failRecord = failRecord;
        this.cdrBaseService = cdrBaseService;
        this.successRecordBaseService = successRecordBaseService;
        this.failRecordBaseService = failRecordBaseService;
    }

    @Override
    public void run() {

        File file = new File(localPath+failRecord.getFileName());
        int failIndex = failRecord.getIndex();
        try {
            FileInputStream in = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(in);
            if (failRecord.getIndex() != 0) {
                dis.read(new byte[failRecord.getIndex()*559]);
            }
            System.out.println(failRecord.getFileName()+"-------");

            byte[] byte1 = new byte[1];
            byte[] byte2 = new byte[2];
            byte[] byte3 = new byte[3];
            byte[] byte4 = new byte[4];
            byte[] byte5 = new byte[5];
            byte[] byte7 = new byte[7];
            byte[] byte8 = new byte[8];
            byte[] byte16 = new byte[16];
            byte[] byte32 = new byte[32];
            while (dis.available() != 0) {
                Cdr cdr = new Cdr();


                //版本号，待确认
                cdr.setwBillVersion((int) dis.readShort());

                //SSID
                cdr.setwSsId((int) dis.readShort());

                //billId
                cdr.setDwBillId(dis.readInt());

                //记录类型
                dis.read(byte1);
                cdr.setbRecType(Integer.parseInt(ReadData.getBCD(byte1)));

                //部分记录指示
                dis.read(byte1);
                cdr.setbPartRecId(Integer.parseInt(ReadData.getBCD(byte1)));

                //顺序号
                cdr.setwSeqNum((int) dis.readShort());

                //主叫号码性质
                dis.read(byte1);
                cdr.setbOpProp(Integer.parseInt(ReadData.getBCD(byte1)));

                //主叫号码
                dis.read(byte32);
                cdr.setSdnOpNo(ReadData.getTel(byte32));

                //主叫网号
                dis.read(byte1);
                cdr.setSdnOpNoNet((int) ReadData.getShort(byte1));

                //主叫区号
                dis.read(byte2);
                cdr.setSdnOpNoLata(ReadData.getBCD2(byte2));

                //最终主叫号码地性质
                dis.read(byte1);
                cdr.setbOutpOpProp(Integer.parseInt(ReadData.getBCD(byte1)));

                //最终主叫号码
                dis.read(byte32);
                cdr.setSdnOutpOpNo(ReadData.getTel(byte32));

                //
                dis.read(byte1);
                cdr.setSdnOutpOpNoNet((int) ReadData.getShort(byte1));

                dis.read(byte2);
                cdr.setSdnOutpOpNoLata(ReadData.getBCD2(byte2));

                dis.read(byte1);
                cdr.setbDialTpProp((int) ReadData.getShort(byte1));

                dis.read(byte32);
                cdr.setSdnDialTpNo(ReadData.getTel(byte32));

                dis.read(byte1);
                cdr.setSdnDialTpNoNet(Integer.parseInt(ReadData.getBCD(byte1)));

                dis.read(byte2);
                cdr.setSdnDialTpNoLata(ReadData.getBCD2(byte2));

                dis.read(byte1);
                cdr.setbDialTpPreLen((int) ReadData.getShort(byte1));

                dis.read(byte1);
                cdr.setbTpProp(Integer.parseInt(ReadData.getBCD(byte1)));

                dis.read(byte32);
                cdr.setSdnTpNo(ReadData.getTel(byte32));

                dis.read(byte1);
                cdr.setSdnTpNoNet((int) ReadData.getShort(byte1));

                dis.read(byte2);
                cdr.setSdnTpNoLata(ReadData.getBCD2(byte2));

                dis.read(byte1);
                cdr.setbTpNoPreLen((int) ReadData.getShort(byte1));

                dis.read(byte1);
                cdr.setbOutpTpProp(Integer.parseInt(ReadData.getBCD(byte1)));

                dis.read(byte32);
                cdr.setSdnOutpTpNo(ReadData.getTel(byte32));

                dis.read(byte1);
                cdr.setSdnOutpTpNoNet((int) ReadData.getShort(byte1));

                dis.read(byte2);
                cdr.setSdnOutpTpNoLata(ReadData.getBCD2(byte2));

                dis.read(byte1);
                cdr.setbOutpTpPreLen((int) ReadData.getShort(byte1));

                cdr.settAnswerTime(ReadData.getDate(dis));

                dis.read(byte1);
                cdr.setbServiceCat((int) ReadData.getShort(byte1));

                cdr.settEndTime(ReadData.getDate(dis));

                dis.read(byte1);
                cdr.setbEndReason((int) ReadData.getShort(byte1));

                //待
                dis.read(byte1);
                cdr.setbOpType((int) ReadData.getShort(byte1));

                dis.read(byte1);
                String bString = ReadData.getBitString(byte1[0]);
                cdr.setOverseasId(Integer.parseInt(bString.substring(0,1)));
                cdr.setAnaTpId(Integer.parseInt(bString.substring(1,2)));
                cdr.setAnaOpId(Integer.parseInt(bString.substring(2,3)));
                cdr.setAnswerId(Integer.parseInt(bString.substring(3,4)));
                cdr.setAttempCall(Integer.parseInt(bString.substring(4,5)));
                cdr.setFreeId(Integer.parseInt(bString.substring(5,6)));
                cdr.setClockId(Integer.parseInt(bString.substring(6,7)));
                cdr.setValidId(Integer.parseInt(bString.substring(7,8)));

                dis.read(byte1);
                cdr.setbInTrkGrpType((int) ReadData.getShort(byte1));

                cdr.settInTrkGrpNo((int) dis.readShort());

                cdr.settInTrkCrctNo((int) dis.readShort());

                cdr.settInTrkConnectTime(ReadData.getDate(dis));
                cdr.settInTrkDisConnectTime(ReadData.getDate(dis));

                dis.read(byte3);
                cdr.setbIngressOpc(ReadData.getODPC(byte3));

                dis.read(byte3);
                cdr.setbIngressDpc(ReadData.getODPC(byte3));

                dis.read(byte1);
                cdr.setbInMgType((int) ReadData.getShort(byte1));

                cdr.setwInMgId((int) dis.readShort());

                dis.read(byte4);
                cdr.setbOpSsIpAddr(ReadData.getIp(byte4));

                dis.read(byte4);
                cdr.setbOpMgIpAddr(ReadData.getIp(byte4));

                dis.read(byte4);
                cdr.setbOpRtpIpAddr(ReadData.getIp(byte4));

                dis.read(byte1);
                cdr.setbOpProtocol((int) ReadData.getShort(byte1));

                dis.read(byte1);
                cdr.setbCallDirect((int) ReadData.getShort(byte1));

                dis.read(byte1);
                cdr.setbCallType((int) ReadData.getShort(byte1));

                dis.read(byte1);
                cdr.setbCoding((int) ReadData.getShort(byte1));

                dis.read(byte1);
                cdr.setbCallParty((int) ReadData.getShort(byte1));

                dis.read(byte1);
                cdr.setbOutTrkGrpType((int) ReadData.getShort(byte1));

                cdr.settOutTrkGrpNo((int) dis.readShort());

                cdr.settOutTrkCircuitNo((int) dis.readShort());

                cdr.settOutTrkConnectTime(ReadData.getDate(dis));

                cdr.settOutTrkDisConnectTime(ReadData.getDate(dis));

                dis.read(byte3);
                cdr.setbEgressOpc(ReadData.getODPC(byte3));

                dis.read(byte3);
                cdr.setbEgressDpc(ReadData.getODPC(byte3));

                dis.read(byte1);
                cdr.setwOutMgType((int) ReadData.getShort(byte1));
                cdr.setwOutMgId((int) dis.readShort());

                dis.read(byte4);
                cdr.setbTpSsIpAddr(ReadData.getIp(byte4));

                dis.read(byte4);
                cdr.setbTpMgIpAddr(ReadData.getIp(byte4));

                dis.read(byte4);
                cdr.setbTpRtpIpAddr(ReadData.getIp(byte4));

                dis.read(byte1);
                cdr.setbTpProtocol((int) ReadData.getShort(byte1));

                cdr.setDwFaxPage(dis.readInt());

                //补充业务
                dis.read(byte7);
                String bStr = "";
                int index = -1;
                for (int j=0;j<7;j++) {
                    if ((int)ReadData.getShort(new byte[]{byte7[j]})!=0){
                        bStr = ReadData.getBitString(byte7[j]);
                        index = j;
                        break;
                    }
                }
                if (index != -1) {
                    int type = 0;
                    if (index == 0) {
                        type = bStr.indexOf("1");
                        if (type == 7) {
                            cdr.setbSs("A");
                        } else if (type == 6) {
                            cdr.setbSs("B");
                        } else if (type == 5) {
                            cdr.setbSs("C");
                        } else if (type == 4) {
                            cdr.setbSs("D");
                        } else if (type == 3) {
                            cdr.setbSs("E");
                        } else if (type == 2) {
                            cdr.setbSs("F");
                        } else if (type == 1) {
                            cdr.setbSs("G");
                        } else if (type == 0) {
                            cdr.setbSs("H");
                        }
                    } else if (index == 1) {
                        type = bStr.indexOf("1");
                        if (type == 7) {
                            cdr.setbSs("I");
                        } else if (type == 6) {
                            cdr.setbSs("J");
                        } else if (type == 5) {
                            cdr.setbSs("K");
                        } else if (type == 4) {
                            cdr.setbSs("L");
                        } else if (type == 3) {
                            cdr.setbSs("M");
                        } else if (type == 2) {
                            cdr.setbSs("N");
                        } else if (type == 1) {
                            cdr.setbSs("O");
                        } else if (type == 0) {
                            cdr.setbSs("P");
                        }
                    } else if (index == 2) {
                        type = bStr.indexOf("1");
                        if (type == 7) {
                            cdr.setbSs("Q");
                        } else if (type == 6) {
                            cdr.setbSs("R");
                        } else if (type == 5) {
                            cdr.setbSs("S");
                        } else if (type == 4) {
                            cdr.setbSs("T");
                        } else if (type == 3) {
                            cdr.setbSs("U");
                        } else if (type == 2) {
                            cdr.setbSs("V");
                        } else if (type == 1) {
                            cdr.setbSs("W");
                        } else if (type == 0) {
                            cdr.setbSs("X");
                        }
                    } else if (index == 3) {
                        type = bStr.indexOf("1");
                        if (type == 7) {
                            cdr.setbSs("Y");
                        } else if (type == 6) {
                            cdr.setbSs("Z");
                        } else if (type == 5) {
                            cdr.setbSs("AA");
                        } else if (type == 4) {
                            cdr.setbSs("AB");
                        } else if (type == 3) {
                            cdr.setbSs("AC");
                        } else if (type == 2) {
                            cdr.setbSs("AD");
                        } else if (type == 1) {
                            cdr.setbSs("AE");
                        } else if (type == 0) {
                            cdr.setbSs("AF");
                        }
                    } else if (index == 4) {
                        type = bStr.indexOf("1");
                        if (type == 7) {
                            cdr.setbSs("AG");
                        } else if (type == 6) {
                            cdr.setbSs("AH");
                        } else if (type == 5) {
                            cdr.setbSs("AI");
                        } else if (type == 4) {
                            cdr.setbSs("AJ");
                        } else if (type == 3) {
                            cdr.setbSs("AK");
                        } else if (type == 2) {
                            cdr.setbSs("AL");
                        } else if (type == 1) {
                            cdr.setbSs("AM");
                        } else if (type == 0) {
                            cdr.setbSs("AN");
                        }
                    } else if (index == 5) {
                        type = bStr.indexOf("1");
                        if (type == 7) {
                            cdr.setbSs("AO");
                        } else if (type == 6) {
                            cdr.setbSs("AP");
                        } else if (type == 5) {
                            cdr.setbSs("AQ");
                        } else if (type == 4) {
                            cdr.setbSs("AR");
                        } else if (type == 3) {
                            cdr.setbSs("AS");
                        } else if (type == 2) {
                            cdr.setbSs("AT");
                        } else if (type == 1) {
                            cdr.setbSs("AU");
                        } else if (type == 0) {
                            cdr.setbSs("AV");
                        }
                    } else if (index == 6) {
                        type = bStr.indexOf("1");
                        if (type == 7) {
                            cdr.setbSs("AW");
                        } else if (type == 6) {
                            cdr.setbSs("AX");
                        } else if (type == 5) {
                            cdr.setbSs("AY");
                        } else if (type == 4) {
                            cdr.setbSs("AZ");
                        } else if (type == 3) {
                            cdr.setbSs("BA");
                        } else if (type == 2) {
                            cdr.setbSs("BB");
                        } else if (type == 1) {
                            cdr.setbSs("BC");
                        } else if (type == 0) {
                            cdr.setbSs("BD");
                        }
                    }
                }

                dis.read(byte1);
                cdr.setbChargeId((int) ReadData.getShort(byte1));

                dis.read(byte1);
                cdr.setbLinkProp(Integer.parseInt(ReadData.getBCD(byte1)));

                dis.read(byte32);
                cdr.setSdnLinkNo(ReadData.getTel(byte32));

                dis.read(byte1);
                cdr.setSdnLinkNoNet((int) ReadData.getShort(byte1));

                dis.read(byte2);
                cdr.setSdnLinkNoLata(ReadData.getBCD2(byte2));

                cdr.setDwFee(dis.readFloat());

                cdr.setDwCustomerId(dis.readInt());
                //客户ID物理地址
                //dis.read(byte4);
                cdr.setDwCustLocationId(""+dis.readInt());

                dis.read(byte1);
                cdr.setbAccountCodeType((int) ReadData.getShort(byte1));

//                dis.read(byte10);
                String accountCode = ""+dis.readShort()+dis.readInt()+dis.readInt();
                cdr.setbAccountCode(accountCode);


                dis.read(byte4);
                cdr.settAccountNumber(ReadData.getTel(byte4));

                dis.read(byte2);
                cdr.settCarrierId(ReadData.getBCD2(byte2));

                cdr.setwOpCtxNo((int) dis.readShort());

                cdr.setwTpCtxNo((int) dis.readShort());

                cdr.settIngressBytes(dis.read(byte8));

                cdr.settEgressBytes(dis.read(byte8));

                //忽略
                dis.read(byte1);

                //忽略
                dis.read(byte4);

                dis.read(byte1);
                cdr.setbLrnProp((int) ReadData.getShort(byte1));

                dis.read(byte16);
                cdr.setbLocRoutNo(ReadData.getTel(byte16));

                cdr.setwCarrierSelInfo((int) dis.readShort());

                dis.read(byte1);
                cdr.setbBearerSvc(Integer.parseInt(ReadData.getBCD(byte1)));

                dis.read(byte1);
                cdr.setbTelSvc(Integer.parseInt(ReadData.getBCD(byte1)));

                dis.read(byte1);
                cdr.setbUss1((int) ReadData.getShort(byte1));

                dis.read(byte1);
                cdr.setbUss3((int) ReadData.getShort(byte1));

                dis.read(byte5);
                cdr.settSpOpNo(ReadData.getTel(byte5));

                dis.read(byte5);
                cdr.settSpTpNo(ReadData.getTel(byte5));

                dis.read(byte1);
                cdr.setbBillProp(Integer.parseInt(ReadData.getBCD(byte1)));

                dis.read(byte32);
                cdr.setSdnBillNo(ReadData.getTel(byte32));

                dis.read(byte1);
                cdr.setSdnBillNoNet((int) ReadData.getShort(byte1));

                dis.read(byte2);
                cdr.setSdnBillNoLata(ReadData.getBCD2(byte2));

                dis.read(byte1);
                cdr.setbTransNoProp(Integer.parseInt(ReadData.getBCD(byte1)));

                dis.read(byte32);
                cdr.setSdnTransNo(ReadData.getTel(byte32));

                dis.read(byte1);
                cdr.setSdnTransNoNet((int) ReadData.getShort(byte1));

                dis.read(byte2);
                cdr.setSdnTransNoLata(ReadData.getBCD2(byte2));

                dis.read(byte1);
                cdr.setbLocaNoProp(Integer.parseInt(ReadData.getBCD(byte1)));

                dis.read(byte32);
                cdr.setSdnLocaNo(ReadData.getTel(byte32));

                dis.read(byte1);
                cdr.setSdnLocaNoNet((int) ReadData.getShort(byte1));

                dis.read(byte2);
                cdr.setSdnLocaNoLata(ReadData.getBCD2(byte2));

                dis.read(byte2);
                cdr.setwChgRateKind(0);

                dis.read(byte1);
                cdr.setbChgModulatorType((int) ReadData.getShort(byte1));

                dis.read(byte1);
                cdr.setbChgModulatorVal((int) ReadData.getShort(byte1));

                dis.read(byte1);
                cdr.setbInAttachFeeKind(Integer.parseInt(ReadData.getBCD(byte1)));

                cdr.setDwInAttachFeeVal(dis.readFloat());

                //待完成透明参数
                dis.read(new byte[16]);
                cdr.setbTransparentParameter(dis.readInt());

                cdrBaseService.save(cdr);
                failIndex ++;
            }
            SuccessRecord successRecord = new SuccessRecord();
            successRecord.setFileName(failRecord.getFileName());
            successRecord.setSize(file.length());
            successRecord.setCreateTime(new Date());
            successRecordBaseService.save(successRecord);
            dis.close();
            file.delete();
        } catch (Exception e) {
            FailRecord failRecord = new FailRecord();
            failRecord.setFileName(failRecord.getFileName());
            failRecord.setIndex(failIndex);
            failRecord.setCreateTime(new Date());
            failRecordBaseService.save(failRecord);
            e.printStackTrace();
        }
    }
}
