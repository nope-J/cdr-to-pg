package com.cdr.model;

import java.io.Serializable;
import java.util.Date;

public class Cdr implements Serializable {
    private Integer wBillVersion;
    private Integer wSsId;
    private Integer dwBillId;
    private Integer bRecType;
    private Integer bPartRecId;
    private Integer wSeqNum;
    private Integer bOpProp;
    private String sdnOpNo;
    private Integer sdnOpNoNet;
    private String sdnOpNoLata;
    private Integer bOutpOpProp;
    private String sdnOutpOpNo;
    private Integer sdnOutpOpNoNet;
    private String sdnOutpOpNoLata;
    private Integer bDialTpProp;
    private String sdnDialTpNo;
    private Integer sdnDialTpNoNet;
    private String sdnDialTpNoLata;
    private Integer bDialTpPreLen;
    private Integer bTpProp;
    private String sdnTpNo;
    private Integer sdnTpNoNet;
    private String sdnTpNoLata;
    private Integer bTpNoPreLen;
    private Integer bOutpTpProp;
    private String sdnOutpTpNo;
    private Integer sdnOutpTpNoNet;
    private String sdnOutpTpNoLata;
    private Integer bOutpTpPreLen;
    private Date tAnswerTime;
    private Integer bServiceCat;
    private Date tEndTime;
    private Integer bEndReason;
    private Integer bOpType;
    private Integer overseasId;
    private Integer anaTpId;
    private Integer anaOpId;
    private Integer answerId;
    private Integer attempCall;
    private Integer freeId;
    private Integer clockId;
    private Integer validId;
    private Integer bInTrkGrpType;
    private Integer tInTrkGrpNo;
    private Integer tInTrkCrctNo;
    private Date tInTrkConnectTime;
    private Date tInTrkDisConnectTime;
    private String bIngressOpc;
    private String bIngressDpc;
    private Integer bInMgType;
    private Integer wInMgId;
    private String bOpSsIpAddr;
    private String bOpMgIpAddr;
    private String bOpRtpIpAddr;
    private Integer bOpProtocol;
    private Integer bCallDirect;
    private Integer bCallType;
    private Integer bCoding;
    private Integer bCallParty;
    private Integer bOutTrkGrpType;
    private Integer tOutTrkGrpNo;
    private Integer tOutTrkCircuitNo;
    private Date tOutTrkConnectTime;
    private Date tOutTrkDisConnectTime;
    private String bEgressOpc;
    private String bEgressDpc;
    private Integer wOutMgType;
    private Integer wOutMgId;
    private String bTpSsIpAddr;
    private String bTpMgIpAddr;
    private String bTpRtpIpAddr;
    private Integer bTpProtocol;
    private Integer dwFaxPage;
    private String bSs;
    private Integer bChargeId;
    private Integer bLinkProp;
    private String sdnLinkNo;
    private Integer sdnLinkNoNet;
    private String sdnLinkNoLata;
    private Float dwFee;
    private Integer dwCustomerId;
    private String dwCustLocationId;
    private Integer bAccountCodeType;
    private String bAccountCode;
    private String tAccountNumber;
    private String tCarrierId;
    private Integer wOpCtxNo;
    private Integer wTpCtxNo;
    private Integer tIngressBytes;
    private Integer tEgressBytes;
    private Integer bLrnProp;
    private String bLocRoutNo;
    private Integer wCarrierSelInfo;
    private Integer bBearerSvc;
    private Integer bTelSvc;
    private Integer bUss1;
    private Integer bUss3;
    private String tSpOpNo;
    private String tSpTpNo;
    private Integer bBillProp;
    private String sdnBillNo;
    private Integer sdnBillNoNet;
    private String sdnBillNoLata;
    private Integer bTransNoProp;
    private String sdnTransNo;
    private Integer sdnTransNoNet;
    private String sdnTransNoLata;
    private Integer bLocaNoProp;
    private String sdnLocaNo;
    private Integer sdnLocaNoNet;
    private String sdnLocaNoLata;
    private Integer wChgRateKind;
    private Integer bChgModulatorType;
    private Integer bChgModulatorVal;
    private Integer bInAttachFeeKind;
    private Float dwInAttachFeeVal;
    private Integer bTransparentParameter;

    public Integer getwBillVersion() {
        return wBillVersion;
    }

    public void setwBillVersion(Integer wBillVersion) {
        this.wBillVersion = wBillVersion;
    }

    public Integer getwSsId() {
        return wSsId;
    }

    public void setwSsId(Integer wSsId) {
        this.wSsId = wSsId;
    }

    public Integer getDwBillId() {
        return dwBillId;
    }

    public void setDwBillId(Integer dwBillId) {
        this.dwBillId = dwBillId;
    }

    public Integer getbRecType() {
        return bRecType;
    }

    public void setbRecType(Integer bRecType) {
        this.bRecType = bRecType;
    }

    public Integer getwSeqNum() {
        return wSeqNum;
    }

    public void setwSeqNum(Integer wSeqNum) {
        this.wSeqNum = wSeqNum;
    }

    public Integer getbPartRecId() {
        return bPartRecId;
    }

    public void setbPartRecId(Integer bPartRecId) {
        this.bPartRecId = bPartRecId;
    }

    public Integer getbOpProp() {
        return bOpProp;
    }

    public void setbOpProp(Integer bOpProp) {
        this.bOpProp = bOpProp;
    }

    public Integer getSdnOpNoNet() {
        return sdnOpNoNet;
    }

    public void setSdnOpNoNet(Integer sdnOpNoNet) {
        this.sdnOpNoNet = sdnOpNoNet;
    }

    public String getSdnOpNo() {
        return sdnOpNo;
    }

    public void setSdnOpNo(String sdnOpNo) {
        this.sdnOpNo = sdnOpNo;
    }

    public String getSdnOpNoLata() {
        return sdnOpNoLata;
    }

    public void setSdnOpNoLata(String sdnOpNoLata) {
        this.sdnOpNoLata = sdnOpNoLata;
    }

    public Integer getbOutpOpProp() {
        return bOutpOpProp;
    }

    public void setbOutpOpProp(Integer bOutpOpProp) {
        this.bOutpOpProp = bOutpOpProp;
    }

    public String getSdnOutpOpNo() {
        return sdnOutpOpNo;
    }

    public void setSdnOutpOpNo(String sdnOutpOpNo) {
        this.sdnOutpOpNo = sdnOutpOpNo;
    }

    public Integer getSdnOutpOpNoNet() {
        return sdnOutpOpNoNet;
    }

    public void setSdnOutpOpNoNet(Integer sdnOutpOpNoNet) {
        this.sdnOutpOpNoNet = sdnOutpOpNoNet;
    }

    public String getSdnOutpOpNoLata() {
        return sdnOutpOpNoLata;
    }

    public void setSdnOutpOpNoLata(String sdnOutpOpNoLata) {
        this.sdnOutpOpNoLata = sdnOutpOpNoLata;
    }

    public Integer getbDialTpProp() {
        return bDialTpProp;
    }

    public void setbDialTpProp(Integer bDialTpProp) {
        this.bDialTpProp = bDialTpProp;
    }

    public String getSdnDialTpNo() {
        return sdnDialTpNo;
    }

    public void setSdnDialTpNo(String sdnDialTpNo) {
        this.sdnDialTpNo = sdnDialTpNo;
    }

    public Integer getSdnDialTpNoNet() {
        return sdnDialTpNoNet;
    }

    public void setSdnDialTpNoNet(Integer sdnDialTpNoNet) {
        this.sdnDialTpNoNet = sdnDialTpNoNet;
    }

    public String getSdnDialTpNoLata() {
        return sdnDialTpNoLata;
    }

    public void setSdnDialTpNoLata(String sdnDialTpNoLata) {
        this.sdnDialTpNoLata = sdnDialTpNoLata;
    }

    public Integer getbDialTpPreLen() {
        return bDialTpPreLen;
    }

    public void setbDialTpPreLen(Integer bDialTpPreLen) {
        this.bDialTpPreLen = bDialTpPreLen;
    }

    public Integer getbTpProp() {
        return bTpProp;
    }

    public void setbTpProp(Integer bTpProp) {
        this.bTpProp = bTpProp;
    }

    public String getSdnTpNo() {
        return sdnTpNo;
    }

    public void setSdnTpNo(String sdnTpNo) {
        this.sdnTpNo = sdnTpNo;
    }

    public Integer getSdnTpNoNet() {
        return sdnTpNoNet;
    }

    public void setSdnTpNoNet(Integer sdnTpNoNet) {
        this.sdnTpNoNet = sdnTpNoNet;
    }

    public String getSdnTpNoLata() {
        return sdnTpNoLata;
    }

    public void setSdnTpNoLata(String sdnTpNoLata) {
        this.sdnTpNoLata = sdnTpNoLata;
    }

    public Integer getbTpNoPreLen() {
        return bTpNoPreLen;
    }

    public void setbTpNoPreLen(Integer bTpNoPreLen) {
        this.bTpNoPreLen = bTpNoPreLen;
    }

    public Integer getbOutpTpProp() {
        return bOutpTpProp;
    }

    public void setbOutpTpProp(Integer bOutpTpProp) {
        this.bOutpTpProp = bOutpTpProp;
    }

    public String getSdnOutpTpNo() {
        return sdnOutpTpNo;
    }

    public void setSdnOutpTpNo(String sdnOutpTpNo) {
        this.sdnOutpTpNo = sdnOutpTpNo;
    }

    public Integer getSdnOutpTpNoNet() {
        return sdnOutpTpNoNet;
    }

    public void setSdnOutpTpNoNet(Integer sdnOutpTpNoNet) {
        this.sdnOutpTpNoNet = sdnOutpTpNoNet;
    }

    public String getSdnOutpTpNoLata() {
        return sdnOutpTpNoLata;
    }

    public void setSdnOutpTpNoLata(String sdnOutpTpNoLata) {
        this.sdnOutpTpNoLata = sdnOutpTpNoLata;
    }

    public Integer getbOutpTpPreLen() {
        return bOutpTpPreLen;
    }

    public void setbOutpTpPreLen(Integer bOutpTpPreLen) {
        this.bOutpTpPreLen = bOutpTpPreLen;
    }

    public Date gettAnswerTime() {
        return tAnswerTime;
    }

    public void settAnswerTime(Date tAnswerTime) {
        this.tAnswerTime = tAnswerTime;
    }

    public Integer getbServiceCat() {
        return bServiceCat;
    }

    public void setbServiceCat(Integer bServiceCat) {
        this.bServiceCat = bServiceCat;
    }

    public Date gettEndTime() {
        return tEndTime;
    }

    public void settEndTime(Date tEndTime) {
        this.tEndTime = tEndTime;
    }

    public Integer getbEndReason() {
        return bEndReason;
    }

    public void setbEndReason(Integer bEndReason) {
        this.bEndReason = bEndReason;
    }

    public Integer getbOpType() {
        return bOpType;
    }

    public void setbOpType(Integer bOpType) {
        this.bOpType = bOpType;
    }

    public Integer getOverseasId() {
        return overseasId;
    }

    public void setOverseasId(Integer overseasId) {
        this.overseasId = overseasId;
    }

    public Integer getAnaTpId() {
        return anaTpId;
    }

    public void setAnaTpId(Integer anaTpId) {
        this.anaTpId = anaTpId;
    }

    public Integer getAnaOpId() {
        return anaOpId;
    }

    public void setAnaOpId(Integer anaOpId) {
        this.anaOpId = anaOpId;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public Integer getAttempCall() {
        return attempCall;
    }

    public void setAttempCall(Integer attempCall) {
        this.attempCall = attempCall;
    }

    public Integer getFreeId() {
        return freeId;
    }

    public void setFreeId(Integer freeId) {
        this.freeId = freeId;
    }

    public Integer getValidId() {
        return validId;
    }

    public void setValidId(Integer validId) {
        this.validId = validId;
    }

    public Integer getClockId() {
        return clockId;
    }

    public void setClockId(Integer clockId) {
        this.clockId = clockId;
    }

    public Integer getbInTrkGrpType() {
        return bInTrkGrpType;
    }

    public void setbInTrkGrpType(Integer bInTrkGrpType) {
        this.bInTrkGrpType = bInTrkGrpType;
    }

    public Integer gettInTrkGrpNo() {
        return tInTrkGrpNo;
    }

    public void settInTrkGrpNo(Integer tInTrkGrpNo) {
        this.tInTrkGrpNo = tInTrkGrpNo;
    }

    public Integer gettInTrkCrctNo() {
        return tInTrkCrctNo;
    }

    public void settInTrkCrctNo(Integer tInTrkCrctNo) {
        this.tInTrkCrctNo = tInTrkCrctNo;
    }

    public Date gettInTrkConnectTime() {
        return tInTrkConnectTime;
    }

    public void settInTrkConnectTime(Date tInTrkConnectTime) {
        this.tInTrkConnectTime = tInTrkConnectTime;
    }

    public Date gettInTrkDisConnectTime() {
        return tInTrkDisConnectTime;
    }

    public void settInTrkDisConnectTime(Date tInTrkDisConnectTime) {
        this.tInTrkDisConnectTime = tInTrkDisConnectTime;
    }

    public String getbIngressOpc() {
        return bIngressOpc;
    }

    public void setbIngressOpc(String bIngressOpc) {
        this.bIngressOpc = bIngressOpc;
    }

    public String getbIngressDpc() {
        return bIngressDpc;
    }

    public void setbIngressDpc(String bIngressDpc) {
        this.bIngressDpc = bIngressDpc;
    }

    public Integer getbInMgType() {
        return bInMgType;
    }

    public void setbInMgType(Integer bInMgType) {
        this.bInMgType = bInMgType;
    }

    public Integer getwInMgId() {
        return wInMgId;
    }

    public void setwInMgId(Integer wInMgId) {
        this.wInMgId = wInMgId;
    }

    public String getbOpSsIpAddr() {
        return bOpSsIpAddr;
    }

    public void setbOpSsIpAddr(String bOpSsIpAddr) {
        this.bOpSsIpAddr = bOpSsIpAddr;
    }

    public String getbOpMgIpAddr() {
        return bOpMgIpAddr;
    }

    public void setbOpMgIpAddr(String bOpMgIpAddr) {
        this.bOpMgIpAddr = bOpMgIpAddr;
    }

    public String getbOpRtpIpAddr() {
        return bOpRtpIpAddr;
    }

    public void setbOpRtpIpAddr(String bOpRtpIpAddr) {
        this.bOpRtpIpAddr = bOpRtpIpAddr;
    }

    public Integer getbOpProtocol() {
        return bOpProtocol;
    }

    public void setbOpProtocol(Integer bOpProtocol) {
        this.bOpProtocol = bOpProtocol;
    }

    public Integer getbCallDirect() {
        return bCallDirect;
    }

    public void setbCallDirect(Integer bCallDirect) {
        this.bCallDirect = bCallDirect;
    }

    public Integer getbCallType() {
        return bCallType;
    }

    public void setbCallType(Integer bCallType) {
        this.bCallType = bCallType;
    }

    public Integer getbCoding() {
        return bCoding;
    }

    public void setbCoding(Integer bCoding) {
        this.bCoding = bCoding;
    }

    public Integer getbCallParty() {
        return bCallParty;
    }

    public void setbCallParty(Integer bCallParty) {
        this.bCallParty = bCallParty;
    }

    public Integer gettOutTrkGrpNo() {
        return tOutTrkGrpNo;
    }

    public void settOutTrkGrpNo(Integer tOutTrkGrpNo) {
        this.tOutTrkGrpNo = tOutTrkGrpNo;
    }

    public Integer getbOutTrkGrpType() {
        return bOutTrkGrpType;
    }

    public void setbOutTrkGrpType(Integer bOutTrkGrpType) {
        this.bOutTrkGrpType = bOutTrkGrpType;
    }

    public Integer gettOutTrkCircuitNo() {
        return tOutTrkCircuitNo;
    }

    public void settOutTrkCircuitNo(Integer tOutTrkCircuitNo) {
        this.tOutTrkCircuitNo = tOutTrkCircuitNo;
    }

    public Date gettOutTrkConnectTime() {
        return tOutTrkConnectTime;
    }

    public void settOutTrkConnectTime(Date tOutTrkConnectTime) {
        this.tOutTrkConnectTime = tOutTrkConnectTime;
    }

    public Date gettOutTrkDisConnectTime() {
        return tOutTrkDisConnectTime;
    }

    public void settOutTrkDisConnectTime(Date tOutTrkDisConnectTime) {
        this.tOutTrkDisConnectTime = tOutTrkDisConnectTime;
    }

    public String getbEgressOpc() {
        return bEgressOpc;
    }

    public void setbEgressOpc(String bEgressOpc) {
        this.bEgressOpc = bEgressOpc;
    }

    public String getbEgressDpc() {
        return bEgressDpc;
    }

    public void setbEgressDpc(String bEgressDpc) {
        this.bEgressDpc = bEgressDpc;
    }

    public Integer getwOutMgType() {
        return wOutMgType;
    }

    public void setwOutMgType(Integer wOutMgType) {
        this.wOutMgType = wOutMgType;
    }

    public Integer getwOutMgId() {
        return wOutMgId;
    }

    public void setwOutMgId(Integer wOutMgId) {
        this.wOutMgId = wOutMgId;
    }

    public String getbTpSsIpAddr() {
        return bTpSsIpAddr;
    }

    public void setbTpSsIpAddr(String bTpSsIpAddr) {
        this.bTpSsIpAddr = bTpSsIpAddr;
    }

    public String getbTpMgIpAddr() {
        return bTpMgIpAddr;
    }

    public void setbTpMgIpAddr(String bTpMgIpAddr) {
        this.bTpMgIpAddr = bTpMgIpAddr;
    }

    public String getbTpRtpIpAddr() {
        return bTpRtpIpAddr;
    }

    public void setbTpRtpIpAddr(String bTpRtpIpAddr) {
        this.bTpRtpIpAddr = bTpRtpIpAddr;
    }

    public Integer getbTpProtocol() {
        return bTpProtocol;
    }

    public void setbTpProtocol(Integer bTpProtocol) {
        this.bTpProtocol = bTpProtocol;
    }

    public Integer getDwFaxPage() {
        return dwFaxPage;
    }

    public void setDwFaxPage(Integer dwFaxPage) {
        this.dwFaxPage = dwFaxPage;
    }

    public String getbSs() {
        return bSs;
    }

    public void setbSs(String bSs) {
        this.bSs = bSs;
    }

    public Integer getbChargeId() {
        return bChargeId;
    }

    public void setbChargeId(Integer bChargeId) {
        this.bChargeId = bChargeId;
    }

    public Integer getbLinkProp() {
        return bLinkProp;
    }

    public void setbLinkProp(Integer bLinkProp) {
        this.bLinkProp = bLinkProp;
    }

    public String getSdnLinkNo() {
        return sdnLinkNo;
    }

    public void setSdnLinkNo(String sdnLinkNo) {
        this.sdnLinkNo = sdnLinkNo;
    }

    public Integer getSdnLinkNoNet() {
        return sdnLinkNoNet;
    }

    public void setSdnLinkNoNet(Integer sdnLinkNoNet) {
        this.sdnLinkNoNet = sdnLinkNoNet;
    }

    public String getSdnLinkNoLata() {
        return sdnLinkNoLata;
    }

    public void setSdnLinkNoLata(String sdnLinkNoLata) {
        this.sdnLinkNoLata = sdnLinkNoLata;
    }

    public Float getDwFee() {
        return dwFee;
    }

    public void setDwFee(Float dwFee) {
        this.dwFee = dwFee;
    }

    public Integer getDwCustomerId() {
        return dwCustomerId;
    }

    public void setDwCustomerId(Integer dwCustomerId) {
        this.dwCustomerId = dwCustomerId;
    }

    public String getDwCustLocationId() {
        return dwCustLocationId;
    }

    public void setDwCustLocationId(String dwCustLocationId) {
        this.dwCustLocationId = dwCustLocationId;
    }

    public Integer getbAccountCodeType() {
        return bAccountCodeType;
    }

    public void setbAccountCodeType(Integer bAccountCodeType) {
        this.bAccountCodeType = bAccountCodeType;
    }

    public String getbAccountCode() {
        return bAccountCode;
    }

    public void setbAccountCode(String bAccountCode) {
        this.bAccountCode = bAccountCode;
    }

    public String gettAccountNumber() {
        return tAccountNumber;
    }

    public void settAccountNumber(String tAccountNumber) {
        this.tAccountNumber = tAccountNumber;
    }

    public String gettCarrierId() {
        return tCarrierId;
    }

    public void settCarrierId(String tCarrierId) {
        this.tCarrierId = tCarrierId;
    }

    public Integer getwOpCtxNo() {
        return wOpCtxNo;
    }

    public void setwOpCtxNo(Integer wOpCtxNo) {
        this.wOpCtxNo = wOpCtxNo;
    }

    public Integer getwTpCtxNo() {
        return wTpCtxNo;
    }

    public void setwTpCtxNo(Integer wTpCtxNo) {
        this.wTpCtxNo = wTpCtxNo;
    }

    public Integer gettIngressBytes() {
        return tIngressBytes;
    }

    public void settIngressBytes(Integer tIngressBytes) {
        this.tIngressBytes = tIngressBytes;
    }

    public Integer gettEgressBytes() {
        return tEgressBytes;
    }

    public void settEgressBytes(Integer tEgressBytes) {
        this.tEgressBytes = tEgressBytes;
    }

    public Integer getbLrnProp() {
        return bLrnProp;
    }

    public void setbLrnProp(Integer bLrnProp) {
        this.bLrnProp = bLrnProp;
    }

    public String getbLocRoutNo() {
        return bLocRoutNo;
    }

    public void setbLocRoutNo(String bLocRoutNo) {
        this.bLocRoutNo = bLocRoutNo;
    }

    public Integer getwCarrierSelInfo() {
        return wCarrierSelInfo;
    }

    public void setwCarrierSelInfo(Integer wCarrierSelInfo) {
        this.wCarrierSelInfo = wCarrierSelInfo;
    }

    public Integer getbBearerSvc() {
        return bBearerSvc;
    }

    public void setbBearerSvc(Integer bBearerSvc) {
        this.bBearerSvc = bBearerSvc;
    }

    public Integer getbTelSvc() {
        return bTelSvc;
    }

    public void setbTelSvc(Integer bTelSvc) {
        this.bTelSvc = bTelSvc;
    }

    public Integer getbUss1() {
        return bUss1;
    }

    public void setbUss1(Integer bUss1) {
        this.bUss1 = bUss1;
    }

    public Integer getbUss3() {
        return bUss3;
    }

    public void setbUss3(Integer bUss3) {
        this.bUss3 = bUss3;
    }

    public String gettSpOpNo() {
        return tSpOpNo;
    }

    public void settSpOpNo(String tSpOpNo) {
        this.tSpOpNo = tSpOpNo;
    }

    public String gettSpTpNo() {
        return tSpTpNo;
    }

    public void settSpTpNo(String tSpTpNo) {
        this.tSpTpNo = tSpTpNo;
    }

    public Integer getbBillProp() {
        return bBillProp;
    }

    public void setbBillProp(Integer bBillProp) {
        this.bBillProp = bBillProp;
    }

    public String getSdnBillNo() {
        return sdnBillNo;
    }

    public void setSdnBillNo(String sdnBillNo) {
        this.sdnBillNo = sdnBillNo;
    }

    public Integer getSdnBillNoNet() {
        return sdnBillNoNet;
    }

    public void setSdnBillNoNet(Integer sdnBillNoNet) {
        this.sdnBillNoNet = sdnBillNoNet;
    }

    public String getSdnBillNoLata() {
        return sdnBillNoLata;
    }

    public void setSdnBillNoLata(String sdnBillNoLata) {
        this.sdnBillNoLata = sdnBillNoLata;
    }

    public Integer getbTransNoProp() {
        return bTransNoProp;
    }

    public void setbTransNoProp(Integer bTransNoProp) {
        this.bTransNoProp = bTransNoProp;
    }

    public String getSdnTransNo() {
        return sdnTransNo;
    }

    public void setSdnTransNo(String sdnTransNo) {
        this.sdnTransNo = sdnTransNo;
    }

    public Integer getSdnTransNoNet() {
        return sdnTransNoNet;
    }

    public void setSdnTransNoNet(Integer sdnTransNoNet) {
        this.sdnTransNoNet = sdnTransNoNet;
    }

    public String getSdnTransNoLata() {
        return sdnTransNoLata;
    }

    public void setSdnTransNoLata(String sdnTransNoLata) {
        this.sdnTransNoLata = sdnTransNoLata;
    }

    public Integer getbLocaNoProp() {
        return bLocaNoProp;
    }

    public void setbLocaNoProp(Integer bLocaNoProp) {
        this.bLocaNoProp = bLocaNoProp;
    }

    public String getSdnLocaNo() {
        return sdnLocaNo;
    }

    public void setSdnLocaNo(String sdnLocaNo) {
        this.sdnLocaNo = sdnLocaNo;
    }

    public Integer getSdnLocaNoNet() {
        return sdnLocaNoNet;
    }

    public void setSdnLocaNoNet(Integer sdnLocaNoNet) {
        this.sdnLocaNoNet = sdnLocaNoNet;
    }

    public String getSdnLocaNoLata() {
        return sdnLocaNoLata;
    }

    public void setSdnLocaNoLata(String sdnLocaNoLata) {
        this.sdnLocaNoLata = sdnLocaNoLata;
    }

    public Integer getwChgRateKind() {
        return wChgRateKind;
    }

    public void setwChgRateKind(Integer wChgRateKind) {
        this.wChgRateKind = wChgRateKind;
    }

    public Integer getbChgModulatorType() {
        return bChgModulatorType;
    }

    public void setbChgModulatorType(Integer bChgModulatorType) {
        this.bChgModulatorType = bChgModulatorType;
    }

    public Integer getbChgModulatorVal() {
        return bChgModulatorVal;
    }

    public void setbChgModulatorVal(Integer bChgModulatorVal) {
        this.bChgModulatorVal = bChgModulatorVal;
    }

    public Integer getbInAttachFeeKind() {
        return bInAttachFeeKind;
    }

    public void setbInAttachFeeKind(Integer bInAttachFeeKind) {
        this.bInAttachFeeKind = bInAttachFeeKind;
    }

    public Float getDwInAttachFeeVal() {
        return dwInAttachFeeVal;
    }

    public void setDwInAttachFeeVal(Float dwInAttachFeeVal) {
        this.dwInAttachFeeVal = dwInAttachFeeVal;
    }

    public Integer getbTransparentParameter() {
        return bTransparentParameter;
    }

    public void setbTransparentParameter(Integer bTransparentParameter) {
        this.bTransparentParameter = bTransparentParameter;
    }
}
