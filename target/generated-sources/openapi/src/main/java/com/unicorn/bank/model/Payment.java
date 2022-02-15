package com.unicorn.bank.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Payment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-15T21:07:09.231484Z[Europe/London]")
public class Payment   {
  @JsonProperty("id")
  private UUID id;

  @JsonProperty("reference")
  private String reference;

  @JsonProperty("fromAccountId")
  private UUID fromAccountId;

  @JsonProperty("toAccountId")
  private UUID toAccountId;

  @JsonProperty("amount")
  private Double amount;

  /**
   * Gets or Sets currency
   */
  public enum CurrencyEnum {
    GBP("GBP"),
    
    USD("USD");

    private String value;

    CurrencyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CurrencyEnum fromValue(String value) {
      for (CurrencyEnum b : CurrencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("currency")
  private CurrencyEnum currency;

  public Payment id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Payment reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
  */
  @ApiModelProperty(value = "")


  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Payment fromAccountId(UUID fromAccountId) {
    this.fromAccountId = fromAccountId;
    return this;
  }

  /**
   * Get fromAccountId
   * @return fromAccountId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UUID getFromAccountId() {
    return fromAccountId;
  }

  public void setFromAccountId(UUID fromAccountId) {
    this.fromAccountId = fromAccountId;
  }

  public Payment toAccountId(UUID toAccountId) {
    this.toAccountId = toAccountId;
    return this;
  }

  /**
   * Get toAccountId
   * @return toAccountId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UUID getToAccountId() {
    return toAccountId;
  }

  public void setToAccountId(UUID toAccountId) {
    this.toAccountId = toAccountId;
  }

  public Payment amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * minimum: 0
   * @return amount
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@DecimalMin("0")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Payment currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public CurrencyEnum getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.id, payment.id) &&
        Objects.equals(this.reference, payment.reference) &&
        Objects.equals(this.fromAccountId, payment.fromAccountId) &&
        Objects.equals(this.toAccountId, payment.toAccountId) &&
        Objects.equals(this.amount, payment.amount) &&
        Objects.equals(this.currency, payment.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, reference, fromAccountId, toAccountId, amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    fromAccountId: ").append(toIndentedString(fromAccountId)).append("\n");
    sb.append("    toAccountId: ").append(toIndentedString(toAccountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

