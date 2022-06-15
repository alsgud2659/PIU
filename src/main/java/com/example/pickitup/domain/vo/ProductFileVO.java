package com.example.pickitup.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data

public class ProductFileVO {
    private String uuid;
    private String uploadPath;
    private String fileName;
    private Long productNum;

}
