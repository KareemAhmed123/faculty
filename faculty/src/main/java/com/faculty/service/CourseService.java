package com.faculty.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faculty.domain.Course;
import com.faculty.repository.CourseRepository;

@Service
@Transactional
public class CourseService {

	@Autowired
	CourseRepository courseRepository;

	public Course create(Course course) {
		return courseRepository.save(course);
	}
	
	public Course update(Course course) {
		return courseRepository.save(course);
	}

}
