package com.courses.services;

import org.springframework.stereotype.Service;

@Service
public class DataService {
	public String[] getImages() {
		String []filenames= {"asian.gif","female2.gif","female3.jpg","female5.jpg","man1.jpg","man2.jpg",
				"man4.jpg","man5.jpg","female1.png","female2.png","man3.png","man4.png"
				};
		return filenames;
}
}