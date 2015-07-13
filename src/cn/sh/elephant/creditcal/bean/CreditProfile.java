package cn.sh.elephant.creditcal.bean;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by xiangqing on 2015/07/06.
 */
public class CreditProfile {
    private BigDecimal cPrincipal;
    private BigDecimal bPrincipal;
    private BigDecimal cRate;
    private BigDecimal bRate;
    private int period;
    private Date creditDate;
    private Date repaymentDate;

    public CreditProfile() {
    }

    public BigDecimal getcPrincipal() {
        return cPrincipal;
    }

    public void setcPrincipal(BigDecimal cPrincipal) {
        this.cPrincipal = cPrincipal;
    }

    public BigDecimal getbPrincipal() {
        return bPrincipal;
    }

    public void setbPrincipal(BigDecimal bPrincipal) {
        this.bPrincipal = bPrincipal;
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

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public Date getCreditDate() {
        return creditDate;
    }

    public void setCreditDate(Date creditDate) {
        this.creditDate = creditDate;
    }

    public Date getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }
}
