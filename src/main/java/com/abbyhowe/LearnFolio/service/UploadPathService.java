package com.abbyhowe.LearnFolio.service;

import java.io.File;

public interface UploadPathService {
    File getFilePath(String modifiedFileName, String path);
}
