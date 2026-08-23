package com.fathur.ecommerce.upload;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpSession;

public interface UploadService {

    boolean isImageFile(MultipartFile file);

    String resolveFileName(MultipartFile file, String defaultName);

    String storeFile(MultipartFile file, String folder) throws IOException;
}
