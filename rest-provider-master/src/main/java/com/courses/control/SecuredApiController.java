package com.courses.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.courses.model.Reviews;
import com.courses.repository.ReviewsRepository;

@RestController
@RequestMapping("/secured-api")
public class SecuredApiController {
	
	@Autowired
	 ReviewsRepository rrepo;
	
	@RequestMapping("/reviews")
	public List<Reviews> getReviews(){
		return (List<Reviews>) rrepo.findAll();
	}

}