package com.school.controller;

import com.school.service.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 但凡是 DepartmentController 的方法抛出的异常，都由【我】这个类负责处理。
 * 它具体抛出什么异常，就触发下面对应的那个方法执行。
 * 至于各个方法的具体内容，这就是你程序员负责去实现的代码。
 */
@ControllerAdvice(assignableTypes = DepartmentController.class)
public class DepartmentControllerExceptionHandler {

    @ExceptionHandler(DepartmentService.DepartmentNotFoundException.class)
    public ResponseEntity<String> handleDepartmentNotFoundException(DepartmentService.DepartmentNotFoundException e) {
        return ResponseEntity.ok("Department Not Found");
    }

/*
    @ExceptionHandler(A-Exception.class)
    public ResponseEntity<String> handleDepartmentNotFoundException(DepartmentService.DepartmentNotFoundException e) {
        如果发生了 A 错误，接下来这种情况下的处理流程。
    }

    @ExceptionHandler(B-Exception.class)
    public ResponseEntity<String> handleDepartmentNotFoundException(DepartmentService.DepartmentNotFoundException e) {
        如果发生了 B 错误，接下来这种情况下的处理流程。
    }

    @ExceptionHandler(C-Exception.class)
    public ResponseEntity<String> handleDepartmentNotFoundException(DepartmentService.DepartmentNotFoundException e) {
        如果发生了 C 错误，接下来这种情况下的处理流程。
    }

*/

}
