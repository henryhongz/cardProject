package com.card.demo.constant;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

@Configuration
public class MulterFile {

	/**
     * 文件上传配置
     * @return
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        DataSize dateSize = DataSize.ofBytes(104857600);
        //文件最大
        factory.setMaxFileSize(dateSize); //KB,MB
        /// 设置总上传数据总大小
        factory.setMaxRequestSize(dateSize);
        return factory.createMultipartConfig();
    }
}
