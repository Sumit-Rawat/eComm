package org.ecommerce.dto;

import lombok.*;

import java.util.List;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FakeStoreCartDto {
    private Integer id;
    private Integer userId;
    private List<ItemDto> products;
}
