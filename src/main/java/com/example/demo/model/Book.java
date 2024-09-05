package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Data
@Slf4j
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @JsonIgnore
    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String author;

    private String title;
}
