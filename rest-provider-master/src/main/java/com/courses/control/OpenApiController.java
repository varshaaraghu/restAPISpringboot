package com.courses.control;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.courses.model.Course;
import com.courses.model.User;
import com.courses.repository.CourseRepository;
import com.courses.repository.UserRepository;
import com.courses.services.DataService;

@RestController
@RequestMapping("/open-api")
public class OpenApiController {
	@Autowired
	  CourseRepository crepo;
	@Autowired
	 DataService dservice;
	@Autowired
	 UserRepository urepo;
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ResponseEntity<User> addUser(@RequestBody User user){
		try {
			urepo.save(user);
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@RequestMapping("/ufiles")
	public String[] getFiles() {
		return dservice.getImages();
	}
	@RequestMapping("/courses")
	public List<Course> getCourses(){
       return (List<Course>)crepo.findAll();
	}
	

	@RequestMapping(
			  value = "/images/{filename}",
			  produces = MediaType.IMAGE_JPEG_VALUE
			)
			public @ResponseBody byte[] getImageWithMediaType(@PathVariable String filename) throws IOException {
		     File f=new File("C:\\Users\\Admin\\Downloads\\projectimages\\"+filename);
			    FileInputStream in = new FileInputStream(f);
			    return IOUtils.toByteArray(in);
			}
	

	@RequestMapping(
			  value = "/userimages/{filename}",
			  produces = MediaType.IMAGE_JPEG_VALUE
			)
			public @ResponseBody byte[] getUserImageWithMediaType(@PathVariable String filename) throws IOException {
		     File f=new File("C:\\Users\\Admin\\Downloads\\projectimages\\users\\"+filename);
			    FileInputStream in = new FileInputStream(f);
			    return IOUtils.toByteArray(in);
			}

}
