package com.isai.demoapigardening_spring.app.exceptions;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
public class ErrorResponse {
    private String codeError;
    private HttpStatus httpStatus;
    private String messageError;
    private List<String> detailsError;
    private LocalDateTime dateTimeError;
}
