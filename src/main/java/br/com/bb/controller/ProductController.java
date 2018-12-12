package br.com.bb.controller;

import br.com.bb.domain.Product;
import br.com.bb.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/product")
public class ProductController {

  private final ProductService service;

  @GetMapping(value = "listByCategory/{categoryId}")
  public List<Product> list(@PathVariable final Integer categoryId) {
    return service.listByCategory(categoryId);
  }
}
