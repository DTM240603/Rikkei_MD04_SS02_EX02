package ra.edu.hw.microservice.ss02.ex02.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ra.edu.hw.microservice.ss02.ex02.dto.ProductResponseDTO;
import ra.edu.hw.microservice.ss02.ex02.entity.ProductEntity;
import ra.edu.hw.microservice.ss02.ex02.repository.ProductRepository;
import ra.edu.hw.microservice.ss02.ex02.service.ProductService;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public ProductResponseDTO getProductById(Long id) {
        ProductEntity entity = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy sản phẩm với id: " + id));

        return ProductResponseDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .sellPrice(entity.getSellPrice())
                .build();
    }
}