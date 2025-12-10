package org.example.courseaccess.controller;

import org.example.courseaccess.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }

    @GetMapping("/courses/{courseId}/lessons")
    public List<String> getLessons(@PathVariable Long courseId,
                                   @RequestParam Long userId) {

        if (!service.isEnrolled(userId, courseId)) {
            throw new ResponseStatusException(HttpStatus.FORBIDDEN, "Access denied");
        }

        return service.getLessons(courseId);
    }
}
