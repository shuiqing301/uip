package com.sq.loadometer_nj.domain;

import com.sq.entity.AbstractEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;

/**
 * 地磅数据进出场流水记录.
 * User: shuiqing
 * Date: 2015/5/12
 * Time: 11:57
 * Email: shuiqing301@gmail.com
 * GitHub: https://github.com/ShuiQing301
 * Blog: http://shuiqing301.github.io/
 * _
 * |_)._ _
 * | o| (_
 */
/*@Entity
@Table(name="T_Trade")*/
public class Trade extends AbstractEntity<Long> implements Serializable {

    private static final long serialVersionUID = 2211368658057245960L;

    public Trade(){

    }

    public Trade(HashMap<String,Object> map) {
        this.ticketno1 = map.get("ticketno1") != null ? map.get("ticketno1").toString() : null;
        this.ticketno2 = map.get("ticketno2") != null ? map.get("ticketno2").toString() : null;
        this.station1 = map.get("station1") != null ? map.get("station1").toString() : null;
        this.station2 = map.get("station2") != null ? map.get("station2").toString() : null;
        this.scaleno1 = map.get("scaleno1") != null ? map.get("scaleno1").toString() : null;
        this.scaleno2 = map.get("scaleno2") != null ? map.get("scaleno2").toString() : null;
        this.truckno = map.get("truckno") != null ? map.get("truckno").toString() : null;
        this.cardno = map.get("cardno") != null ? map.get("cardno").toString() : null;
        this.contractno = map.get("contractno") != null ? map.get("contractno").toString() : null;
        this.productcode = map.get("productcode") != null ? map.get("productcode").toString() : null;
        this.product = map.get("product") != null ? map.get("product").toString() : null;
        this.specification = map.get("specification") != null ? map.get("specification").toString() : null;
        this.sender = map.get("sender") != null ? map.get("sender").toString() : null;
        this.receiver = map.get("receiver") != null ? map.get("receiver").toString() : null;
        this.transporter = map.get("transporter") != null ? map.get("transporter").toString() : null;
        this.firstdatetime = map.get("firstdatetime") != null ? map.get("firstdatetime").toString() : null;
        this.seconddatetime = map.get("seconddatetime") != null ? map.get("seconddatetime").toString() : null;
        this.grossdatetime = map.get("grossdatetime") != null ? map.get("grossdatetime").toString() : null;
        this.taredatetime = map.get("taredatetime") != null ? map.get("taredatetime").toString() : null;
        this.firstweight = map.get("firstweight") != null ? map.get("firstweight").toString() : null;
        this.secondweight = map.get("secondweight") != null ? map.get("secondweight").toString() : null;
        this.gross = map.get("gross") != null ? map.get("gross").toString() : null;
        this.tare = map.get("tare") != null ? map.get("tare").toString() : null;
        this.net = map.get("net") != null ? map.get("net").toString() : null;
        this.productnet = map.get("productnet") != null ? map.get("productnet").toString() : null;
        this.exceptwater = map.get("exceptwater") != null ? map.get("exceptwater").toString() : null;
        this.exceptother = map.get("exceptother") != null ? map.get("exceptother").toString() : null;
        this.userid1 = map.get("userid1") != null ? map.get("userid1").toString() : null;
        this.username1 = map.get("username1") != null ? map.get("username1").toString() : null;
        this.userid2 = map.get("userid2") != null ? map.get("userid2").toString() : null;
        this.username2 = map.get("username2") != null ? map.get("username2").toString() : null;
        this.bc1 = map.get("bc1") != null ? map.get("bc1").toString() : null;
        this.bc2 = map.get("bc2") != null ? map.get("bc2").toString() : null;
        this.scaleweightflag = map.get("scaleweightflag") != null ? map.get("scaleweightflag").toString() : null;
        this.uploadflag = map.get("uploadflag") != null ? map.get("uploadflag").toString() : null;
        this.dataeditflag = map.get("dataeditflag") != null ? map.get("dataeditflag").toString() : null;
        this.datastatus = map.get("datastatus") != null ? map.get("datastatus").toString() : null;
        this.manualinputflag = map.get("manualinputflag") != null ? map.get("manualinputflag").toString() : null;
        this.scalemode = map.get("scalemode") != null ? map.get("scalemode").toString() : null;
        this.finalflag = map.get("finalflag") != null ? map.get("finalflag").toString() : null;
        this.leftweight = map.get("leftweight") != null ? map.get("leftweight").toString() : null;
        this.autosaveflag = map.get("autosaveflag") != null ? map.get("autosaveflag").toString() : null;
    }

    /**
     * 唯一标示
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //临时磅单号
    private String ticketno1;

    //交易磅单号
    private String ticketno2;

    //临时磅站
    private String station1;

    //交易磅站
    private String station2;

    //临时秤号
    private String scaleno1;

    //交易秤号
    private String scaleno2;

    //车号
    private String truckno;

    //卡号
    private String cardno;

    //合同号
    private String contractno;

    //货物名称
    private String productcode;

    //货物编号
    private String product;

    //规格号
    private String specification;

    //发货单位
    private String sender;

    //收货单位
    private String receiver;

    //运输单位
    private String transporter;

    //临时称重时间
    private String firstdatetime;

    //交易称重时间
    private String seconddatetime;

    //毛重称重时间
    private String grossdatetime;

    //皮重称重时间
    private String taredatetime;

    //临时重量
    private String firstweight;

    //交易重量
    private String secondweight;

    //毛重
    private String gross;

    //皮重
    private String tare;

    //净重
    private String net;

    //货物净重
    private String productnet;

    //扣水
    private String exceptwater;

    //扣杂
    private String exceptother;

    //临时称重操作员Id
    private String userid1;

    //临时称重操作员名
    private String username1;

    //交易称重操作员Id
    private String userid2;

    //交易称重操作员名
    private String username2;

    //临时称重班次
    private String bc1;

    //交易称重班次
    private String bc2;

    /**
     * 自动处理、先皮、先毛标识
     * 0 自动处理  1 先皮重  2 先毛重
     */
    private String scaleweightflag;

    /**
     * 上传标识'
     * 0 未上传 1 已上传
     */
    private String uploadflag;

    /**
     * 数据修改标志
     * 0 未修改  1 已经修改
     */
    private String dataeditflag;

    /**
     * 数据状态
     * 1 正常  9 已经删除 3 表示错误
     */
    private String datastatus;

    /**
     * 手工补单标志
     * 1 手工补单
     */
    private String manualinputflag;

    /**
     * 称重模式
     * 10 称重模式的代号
     */
    private String scalemode;

    /**
     * 多次称重结束的标志
     * 0 临时称重 1 交易称重
     */
    private String finalflag;

    //交易余额
    private String leftweight;

    //自动保存标识 0 未自动保存 1 自动保存
    private String autosaveflag;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getTicketno1() {
        return ticketno1;
    }

    public void setTicketno1(String ticketno1) {
        this.ticketno1 = ticketno1;
    }

    public String getTicketno2() {
        return ticketno2;
    }

    public void setTicketno2(String ticketno2) {
        this.ticketno2 = ticketno2;
    }

    public String getStation1() {
        return station1;
    }

    public void setStation1(String station1) {
        this.station1 = station1;
    }

    public String getStation2() {
        return station2;
    }

    public void setStation2(String station2) {
        this.station2 = station2;
    }

    public String getScaleno1() {
        return scaleno1;
    }

    public void setScaleno1(String scaleno1) {
        this.scaleno1 = scaleno1;
    }

    public String getScaleno2() {
        return scaleno2;
    }

    public void setScaleno2(String scaleno2) {
        this.scaleno2 = scaleno2;
    }

    public String getTruckno() {
        return truckno;
    }

    public void setTruckno(String truckno) {
        this.truckno = truckno;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getContractno() {
        return contractno;
    }

    public void setContractno(String contractno) {
        this.contractno = contractno;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getTransporter() {
        return transporter;
    }

    public void setTransporter(String transporter) {
        this.transporter = transporter;
    }

    public String getFirstdatetime() {
        return firstdatetime;
    }

    public void setFirstdatetime(String firstdatetime) {
        this.firstdatetime = firstdatetime;
    }

    public String getSeconddatetime() {
        return seconddatetime;
    }

    public void setSeconddatetime(String seconddatetime) {
        this.seconddatetime = seconddatetime;
    }

    public String getGrossdatetime() {
        return grossdatetime;
    }

    public void setGrossdatetime(String grossdatetime) {
        this.grossdatetime = grossdatetime;
    }

    public String getTaredatetime() {
        return taredatetime;
    }

    public void setTaredatetime(String taredatetime) {
        this.taredatetime = taredatetime;
    }

    public String getFirstweight() {
        return firstweight;
    }

    public void setFirstweight(String firstweight) {
        this.firstweight = firstweight;
    }

    public String getSecondweight() {
        return secondweight;
    }

    public void setSecondweight(String secondweight) {
        this.secondweight = secondweight;
    }

    public String getGross() {
        return gross;
    }

    public void setGross(String gross) {
        this.gross = gross;
    }

    public String getTare() {
        return tare;
    }

    public void setTare(String tare) {
        this.tare = tare;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public String getProductnet() {
        return productnet;
    }

    public void setProductnet(String productnet) {
        this.productnet = productnet;
    }

    public String getExceptwater() {
        return exceptwater;
    }

    public void setExceptwater(String exceptwater) {
        this.exceptwater = exceptwater;
    }

    public String getExceptother() {
        return exceptother;
    }

    public void setExceptother(String exceptother) {
        this.exceptother = exceptother;
    }

    public String getUserid1() {
        return userid1;
    }

    public void setUserid1(String userid1) {
        this.userid1 = userid1;
    }

    public String getUsername1() {
        return username1;
    }

    public void setUsername1(String username1) {
        this.username1 = username1;
    }

    public String getUserid2() {
        return userid2;
    }

    public void setUserid2(String userid2) {
        this.userid2 = userid2;
    }

    public String getUsername2() {
        return username2;
    }

    public void setUsername2(String username2) {
        this.username2 = username2;
    }

    public String getBc1() {
        return bc1;
    }

    public void setBc1(String bc1) {
        this.bc1 = bc1;
    }

    public String getBc2() {
        return bc2;
    }

    public void setBc2(String bc2) {
        this.bc2 = bc2;
    }

    public String getScaleweightflag() {
        return scaleweightflag;
    }

    public void setScaleweightflag(String scaleweightflag) {
        this.scaleweightflag = scaleweightflag;
    }

    public String getUploadflag() {
        return uploadflag;
    }

    public void setUploadflag(String uploadflag) {
        this.uploadflag = uploadflag;
    }

    public String getDataeditflag() {
        return dataeditflag;
    }

    public void setDataeditflag(String dataeditflag) {
        this.dataeditflag = dataeditflag;
    }

    public String getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(String datastatus) {
        this.datastatus = datastatus;
    }

    public String getManualinputflag() {
        return manualinputflag;
    }

    public void setManualinputflag(String manualinputflag) {
        this.manualinputflag = manualinputflag;
    }

    public String getScalemode() {
        return scalemode;
    }

    public void setScalemode(String scalemode) {
        this.scalemode = scalemode;
    }

    public String getFinalflag() {
        return finalflag;
    }

    public void setFinalflag(String finalflag) {
        this.finalflag = finalflag;
    }

    public String getLeftweight() {
        return leftweight;
    }

    public void setLeftweight(String leftweight) {
        this.leftweight = leftweight;
    }

    public String getAutosaveflag() {
        return autosaveflag;
    }

    public void setAutosaveflag(String autosaveflag) {
        this.autosaveflag = autosaveflag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ticketno1:" + this.ticketno1 + ",ticketno2:" + this.ticketno2);
        return sb.toString();
    }
}