package com.fathur.ecommerce.upload;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpSession;

@Service
public class UploadServiceImpl implements UploadService {

    @Override
    public boolean isImageFile(MultipartFile file) {
        if (ObjectUtils.isEmpty(file) || file.isEmpty()) {
            return false;
        }
        String contentType = file.getContentType();
        return "image/jpeg".equals(contentType) || "image/png".equals(contentType);
    }

    @Override
    public String resolveFileName(MultipartFile file, String defaultName) {
        if (ObjectUtils.isEmpty(file) || file.isEmpty()) {
            return defaultName;
        }
        return file.getOriginalFilename();
    }

    @Override
    public String storeFile(MultipartFile file, String folder) throws IOException {
        if (ObjectUtils.isEmpty(file) || file.isEmpty()) {
            return null;
        }
        if (!isImageFile(file)) {
            throw new IllegalArgumentException("Only JPEG and PNG image uploads are supported.");
        }

        String uploadDir = "./uploads/" + folder;
        Path uploadPath = Paths.get(uploadDir);
        System.out.println("uploadPath is: " + uploadPath);
        
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }
        Path destination = uploadPath.resolve(file.getOriginalFilename());
        System.out.println("destination is: " + destination);

        // Files.createDirectories(destination.getParent());
        Files.copy(file.getInputStream(), destination, StandardCopyOption.REPLACE_EXISTING);
        return file.getOriginalFilename();
    }
}
