package com.felipe.dsCatalog.resources;

import com.felipe.dsCatalog.dto.ProductDTO;
import com.felipe.dsCatalog.services.ProductService;
import com.felipe.dsCatalog.tests.Factory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.PageImpl;
import org.springframework.test.web.servlet.MockMvc;


import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductResource.class)
public class ProductResourcesTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService service;

    private ProductDTO productDTO;
    private PageImpl<ProductDTO> page;

    @BeforeEach
    public void setUp() throws Exception {

        productDTO = Factory.createProductDTO();
        page = new PageImpl<>(List.of(productDTO));

        when(service.findAllPaged(ArgumentMatchers.any())).thenReturn(page);

    }

    @Test
    public void findAllShouldReturnPage() throws Exception {
        mockMvc.perform(get("/products")).andExpect(status().isOk());
    }
}
