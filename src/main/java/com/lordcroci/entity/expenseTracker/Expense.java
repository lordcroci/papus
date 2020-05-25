package com.lordcroci.entity.expenseTracker;

import com.lordcroci.entity.account.User;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = " expenses")
public class Expense implements Serializable
{
    private static final long serialVersionUID = -7179454458042397155L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="customer_id", nullable=false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;

    @NotNull
    @DecimalMax("1000000")
    @Column(name = "amount")
    private BigDecimal amount;

    @Size(max = 250)
    @Column(name = "description")
    private String description;

    @NotNull
    @PastOrPresent
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "on_date", columnDefinition = "DATETIME")
    private LocalDate spentOnDate;

    public Expense(){};
    public Expense(User user, BigDecimal amount, String description, LocalDate spentOnDate)
    {
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public LocalDate getSpentOnDate() {
        return spentOnDate;
    }

    public void setSpentOnDate(LocalDate spentOnDate) {
        this.spentOnDate = spentOnDate;
    }
}
