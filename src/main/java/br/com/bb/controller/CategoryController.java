package br.com.bb.controller;

import br.com.bb.domain.Category;
import br.com.bb.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/category")
public class CategoryController {

  private final CategoryService service;

  @GetMapping(value = "listAll")
  public List<Category> list() {
    return service.list();
  }

  @GetMapping("/occurrence/{letter}")
  public Category occurrenceValidator(@PathVariable final char letter) {
    return service.occurrence(letter);
  }
}
