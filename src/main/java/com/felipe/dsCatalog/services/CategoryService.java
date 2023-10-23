package com.felipe.dsCatalog.services;

import com.felipe.dsCatalog.dto.CategoryDTO;
import com.felipe.dsCatalog.entities.Category;
import com.felipe.dsCatalog.repositories.CategoryRepository;
import com.felipe.dsCatalog.services.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> list = repository.findAll();
        return list.stream().map(x -> new CategoryDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public CategoryDTO findById(Long id) {
       Optional<Category> obj = repository.findById(id);
       Category entity = obj.orElseThrow(() -> new EntityNotFoundException("Recurso não encontrado"));
       return new CategoryDTO(entity);
    }

    @Transactional
    public CategoryDTO insert(CategoryDTO dto) {
        Category entity = new Category();
        entity.setName(dto.getName());
        entity =  repository.save(entity);
        return new CategoryDTO(entity);
    }
}
