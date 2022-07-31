package com.example.eadexamsem4.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class SaleId implements Serializable {

    @Column(name = "product_id")
    private String productId;
}
