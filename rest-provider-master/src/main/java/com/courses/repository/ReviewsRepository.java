package com.courses.repository;

import org.springframework.data.repository.CrudRepository;

import com.courses.model.Reviews;

public interface ReviewsRepository extends CrudRepository<Reviews,Long> {

}