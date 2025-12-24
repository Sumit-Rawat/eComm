package org.ecommerce.dto;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemDto {
    private Integer productId;
    private Integer quantity;
}
