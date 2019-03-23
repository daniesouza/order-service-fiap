package br.com.fiap.order.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDTO {

    private Long id;
    private String idTransaction;
    private LocalDate cardExpirationDate;
    private Long cardNumber;
    private String cardFlag;

}
