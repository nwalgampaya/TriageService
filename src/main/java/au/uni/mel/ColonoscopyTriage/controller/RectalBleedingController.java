package au.uni.mel.ColonoscopyTriage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import au.uni.mel.ColonoscopyTriage.repo.RectalBleedingRepo;

@CrossOrigin(origins = {"${cross.origin.path}"})
@RestController
@RequestMapping("/api")
public class RectalBleedingController {

	
//	@Autowired
//	RectalBleedingRepo rectalBleedingRepo;
	
	@GetMapping("/rectalBleeding")
	public int getRectalBleeding() {
		int rectalBleedingCategory=0;
		
		return rectalBleedingCategory;
	}
}
