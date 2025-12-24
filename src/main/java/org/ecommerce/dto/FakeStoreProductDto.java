package org.ecommerce.dto;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FakeStoreProductDto {

    private Integer id;
    private String title;
    private String price;
    private String description;
    private String category;
}
