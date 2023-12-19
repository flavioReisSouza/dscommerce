package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Payment;
import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PaymentDTO {

    private Long id;
    private Instant moment;

    public PaymentDTO(Payment entity) {
        id = entity.getId();
        moment = entity.getMoment();
    }
}
