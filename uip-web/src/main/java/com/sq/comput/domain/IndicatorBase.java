package com.sq.comput.domain;

import com.sq.entity.AbstractEntity;

import javax.persistence.MappedSuperclass;

/**
 * 指标基类.
 * User: shuiqing
 * Date: 2015/4/1
 * Time: 11:36
 * Email: shuiqing301@gmail.com
 * GitHub: https://github.com/ShuiQing301
 * Blog: http://shuiqing301.github.io/
 * _
 * |_)._ _
 * | o| (_
 */
@MappedSuperclass
public abstract class IndicatorBase extends AbstractEntity<Long> implements Cloneable {

    /** 计算范围 */
    private Integer calculatedRate;

    /** 指标编码 */
    private String indicatorCode;

    /** 指标名称 */
    private String indicatorName;

    private String description;

    /**
     * 数据来源方式
     * 字典值  tableName->INDICATORBASE  attribute->DATASOURCE
     * 1---录入
     * 2---计算
     * 3---接口
     */
    private int dataSource;

    /**
     * 计算类型
     *    1、元计算
     *    2、累计计算
     *    3、库存计算
     */
    private Integer calType;

    /**
     * 指标数值单位
     * 字典值 tableName->INDICATORBASE  attribute->UNIT
     */
    private int unit;

    /** 获取频率    */
    private int fetchCycle;

    /**
     * 数据聚合方式
     *   最大值、最小值、算术平均值、加权平均值、积分值、累计值、差值
     */
    private Integer operCalType;

    public String getIndicatorCode() {
        return indicatorCode;
    }

    public void setIndicatorCode(String indicatorCode) {
        this.indicatorCode = indicatorCode;
    }

    public String getIndicatorName() {
        return indicatorName;
    }

    public void setIndicatorName(String indicatorName) {
        this.indicatorName = indicatorName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDataSource() {
        return dataSource;
    }

    public void setDataSource(int dataSource) {
        this.dataSource = dataSource;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getFetchCycle() {
        return fetchCycle;
    }

    public void setFetchCycle(int fetchCycle) {
        this.fetchCycle = fetchCycle;
    }

    public Integer getOperCalType() {
        return operCalType;
    }

    public void setOperCalType(Integer operCalType) {
        this.operCalType = operCalType;
    }

    public Integer getCalType() {
        return calType;
    }

    public void setCalType(Integer calType) {
        this.calType = calType;
    }

    public Integer getCalculatedRate() {
        return calculatedRate;
    }

    public void setCalculatedRate(Integer calculatedRate) {
        this.calculatedRate = calculatedRate;
    }
}