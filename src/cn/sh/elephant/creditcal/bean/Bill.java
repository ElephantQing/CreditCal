package cn.sh.elephant.creditcal.bean;

import java.math.BigDecimal;

/**
 * Created by xiangqing on 2015/07/06.
 */
public class Bill {
    private int periodNo;                   //期数
    private String periodDate;              //日期
    private BigDecimal restCPrincipal;      //剩余公积金本金
    private BigDecimal restBPrincipal;      //剩余商贷本金
    private BigDecimal periodCPrincipal;    //本期归还公积金贷款本金
    private BigDecimal periodBPrincipal;    //本期归还商业贷款本金
    private BigDecimal periodCInterese;     //本期归还公积金贷款利息
    private BigDecimal periodBInterese;     //本期归还商业贷款利息
    private BigDecimal periodCRatePerYear;  //本期公积金贷款利率
    private BigDecimal periodBRatePerYear;  //本期归还商业贷款利率
    private int periodCategory;             //本期类别

    public Bill() {
    }

    public int getPeriodNo() {
        return periodNo;
    }

    public void setPeriodNo(int periodNo) {
        this.periodNo = periodNo;
    }

    public String getPeriodDate() {
        return periodDate;
    }

    public void setPeriodDate(String periodDate) {
        this.periodDate = periodDate;
    }

    public BigDecimal getRestCPrincipal() {
        return restCPrincipal;
    }

    public void setRestCPrincipal(BigDecimal restCPrincipal) {
        this.restCPrincipal = restCPrincipal;
    }

    public BigDecimal getRestBPrincipal() {
        return restBPrincipal;
    }

    public void setRestBPrincipal(BigDecimal restBPrincipal) {
        this.restBPrincipal = restBPrincipal;
    }

    public BigDecimal getPeriodCPrincipal() {
        return periodCPrincipal;
    }

    public void setPeriodCPrincipal(BigDecimal periodCPrincipal) {
        this.periodCPrincipal = periodCPrincipal;
    }

    public BigDecimal getPeriodBPrincipal() {
        return periodBPrincipal;
    }

    public void setPeriodBPrincipal(BigDecimal periodBPrincipal) {
        this.periodBPrincipal = periodBPrincipal;
    }

    public BigDecimal getPeriodCInterese() {
        return periodCInterese;
    }

    public void setPeriodCInterese(BigDecimal periodCInterese) {
        this.periodCInterese = periodCInterese;
    }

    public BigDecimal getPeriodBInterese() {
        return periodBInterese;
    }

    public void setPeriodBInterese(BigDecimal periodBInterese) {
        this.periodBInterese = periodBInterese;
    }

    public BigDecimal getPeriodCRatePerYear() {
        return periodCRatePerYear;
    }

    public void setPeriodCRatePerYear(BigDecimal periodCRatePerYear) {
        this.periodCRatePerYear = periodCRatePerYear;
    }

    public BigDecimal getPeriodBRatePerYear() {
        return periodBRatePerYear;
    }

    public void setPeriodBRatePerYear(BigDecimal periodBRatePerYear) {
        this.periodBRatePerYear = periodBRatePerYear;
    }

    public int getPeriodCategory() {
        return periodCategory;
    }

    public void setPeriodCategory(int periodCategory) {
        this.periodCategory = periodCategory;
    }
}
