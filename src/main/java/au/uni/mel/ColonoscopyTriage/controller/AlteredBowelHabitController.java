package au.uni.mel.ColonoscopyTriage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import au.uni.mel.ColonoscopyTriage.repo.AlteredBowelHabitRepository;

@CrossOrigin(origins = {"${cross.origin.path}"})
@RestController
@RequestMapping("/api")
public class AlteredBowelHabitController {

//	@Autowired
//	AlteredBowelHabitRepository alteredBowelHabitRepo;
	
	@GetMapping("/getAlteredBH")
	public int getAlteredBH() {
		int alteredBHCategory = 0;
		
		return alteredBHCategory;
		
	}
}
