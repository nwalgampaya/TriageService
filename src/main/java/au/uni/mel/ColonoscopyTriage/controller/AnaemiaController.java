package au.uni.mel.ColonoscopyTriage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import au.uni.mel.ColonoscopyTriage.repo.AnaemiaRepository;

@CrossOrigin(origins = {"${cross.origin.path}"})
@RestController
@RequestMapping("/api")
public class AnaemiaController {

//	@Autowired
//	AnaemiaRepository anaemiaRepository;
//	
	
	@GetMapping("/anaemia")
	public int getAnaemia() {
		int anaemiaCategory = 0;
		
		return anaemiaCategory;
	}
}
