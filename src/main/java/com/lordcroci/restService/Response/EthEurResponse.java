package com.lordcroci.restService.Response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

public class EthEurResponse
{
    @JsonProperty("EUR")
    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
