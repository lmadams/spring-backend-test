package br.com.bb.service;

import br.com.bb.domain.Product;
import br.com.bb.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

  private final ProductRepository repository;

  public List<Product> listByCategory(final Integer categoryId) {
    return repository.findAllByCategory_Id(categoryId);
  }
}
