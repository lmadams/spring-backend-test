package br.com.bb.service;

import br.com.bb.domain.Category;
import br.com.bb.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryService {

  private final CategoryRepository repository;

  public List<Category> list() {
    return repository.findAll();
  }

  public Category occurrence(final char letter) {
    return list()
        .stream()
        .collect(
            Collectors.toMap(
                category -> category,
                category -> category.getName().chars().filter(ch -> ch == letter).count()))
        .entrySet()
        .stream()
        .max(Comparator.comparing(Map.Entry::getValue))
        .orElseGet(null)
        .getKey();
  }
}
