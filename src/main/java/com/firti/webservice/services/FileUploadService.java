package com.firti.webservice.services;

import com.firti.webservice.entities.pojo.UploadProperties;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileUploadService {
    UploadProperties uploadFile(MultipartFile file, String namespace, String uniqueProperty, boolean scaled) throws IOException;
}
