package com.lordcroci.entity.expenseTracker;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "expense")
public class Expense implements Serializable
{
    private static final long serialVersionUID = -7179454458042397155L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "description")
    private String description;

    @Column(name = "on_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date spentOnDate;

    public Expense(){};
    public Expense(Long userId, BigDecimal amount, String description, Date spentOnDate)
    {
        this.userId = userId;
        this.amount = amount;
        this.description = description;
        this.spentOnDate = spentOnDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getSpentOnDate() {
        return spentOnDate;
    }

    public void setSpentOnDate(Date spentOnDate) {
        this.spentOnDate = spentOnDate;
    }
}
