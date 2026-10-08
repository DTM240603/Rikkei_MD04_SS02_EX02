package ra.edu.hw.microservice.ss02.ex02.service;

import ra.edu.hw.microservice.ss02.ex02.dto.ProductResponseDTO;

public interface ProductService {

    ProductResponseDTO getProductById(Long id);
}