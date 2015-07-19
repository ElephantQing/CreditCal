package cn.sh.elephant.creditcal.bean;

import java.math.BigDecimal;

/**
 * Created by HomeStudio on 2015/7/19.
 */
public class CreditRate {
    private int creditRateNo;
    private String year;
    private int period;
    private BigDecimal cRate;
    private BigDecimal bRate;

    public int getCreditRateNo() {
        return creditRateNo;
    }

    public void setCreditRateNo(int creditRateNo) {
        this.creditRateNo = creditRateNo;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public BigDecimal getcRate() {
        return cRate;
    }

    public void setcRate(BigDecimal cRate) {
        this.cRate = cRate;
    }

    public BigDecimal getbRate() {
        return bRate;
    }

    public void setbRate(BigDecimal bRate) {
        this.bRate = bRate;
    }
}
