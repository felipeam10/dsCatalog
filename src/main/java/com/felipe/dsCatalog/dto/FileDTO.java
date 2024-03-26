package com.felipe.dsCatalog.dto;

import com.felipe.dsCatalog.entities.Category;
import com.felipe.dsCatalog.entities.Product;
import jakarta.validation.constraints.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FileDTO {
    private MultipartFile file;
    public FileDTO(){}
    public MultipartFile getFile() {
        return file;
    }
    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
