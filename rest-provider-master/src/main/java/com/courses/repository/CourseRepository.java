package com.courses.repository;

import org.springframework.data.repository.CrudRepository;

import com.courses.model.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {

}
