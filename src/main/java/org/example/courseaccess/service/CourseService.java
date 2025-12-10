package org.example.courseaccess.service;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CourseService {

    // Mock enrollment storage (userId_courseId)
    private final Set<String> enrollments = new HashSet<>();

    // Mock lessons per course
    private final Map<Long, List<String>> lessons = Map.of(
            101L, List.of("Intro", "Basics", "Advanced Topics"),
            102L, List.of("Lesson A", "Lesson B")
    );

    // Mock enrollment (simulated)
    public CourseService() {
        enrollments.add("1_101"); // user 1 is enrolled in course 101
    }

    public boolean isEnrolled(Long userId, Long courseId) {
        String key = userId + "_" + courseId;
        return enrollments.contains(key);
    }

    public List<String> getLessons(Long courseId) {
        return lessons.getOrDefault(courseId, Collections.emptyList());
    }
}
