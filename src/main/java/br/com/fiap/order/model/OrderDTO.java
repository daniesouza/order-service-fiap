package br.com.fiap.order.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private Long id;
    private String name;
    private String email;
    private String shippingAddress;
    private List<OrderItemDTO> orderItemDTOS;
    private BigDecimal totalPrice;
    private PaymentDTO paymentDTO;
    private LocalDate orderDate;
    private String status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDTO orderDTO = (OrderDTO) o;
        return Objects.equals(id, orderDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
