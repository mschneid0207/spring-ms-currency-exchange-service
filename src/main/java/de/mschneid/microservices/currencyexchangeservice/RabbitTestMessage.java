package de.mschneid.microservices.currencyexchangeservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RabbitTestMessage implements Serializable {

    private static final long serialVersionUID = -2736911235490297622L;

    private Integer id;
    private String firstName;
    private String lastName;
}
