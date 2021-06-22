package javacamp.hrms;

import com.cloudinary.utils.ObjectUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import com.cloudinary.*;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@SpringBootApplication
@EnableSwagger2
public class HrmsApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(HrmsApplication.class, args);

//		Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
//				"cloud_name", "geminusf",
//				"api_key", "716597157215126",
//				"api_secret", "SCj5a2Az8YnNr4cjEHTLBpmJpeE"));
//
//		File file = new File("src/main/java/javacamp/hrms/b.jpg");
//		Map uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("javacamp.hrms")).build();
    }
}
