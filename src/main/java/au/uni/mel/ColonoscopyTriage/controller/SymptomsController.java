package au.uni.mel.ColonoscopyTriage.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import au.uni.mel.ColonoscopyTriage.model.IFOBT;
import au.uni.mel.ColonoscopyTriage.model.Symptoms;

@CrossOrigin(origins = {"${cross.origin.path}"})
@RestController
@RequestMapping("/api")
public class SymptomsController {

	
	
	@GetMapping("/getCategory")
	public String triageCategory(@Valid @RequestBody Symptoms symptoms) {
		String selectedCategory = null;
		
		
		return selectedCategory;
	}
	
	public void findSuitableCategory(Symptoms symptoms) {
		
		IFOBT ifobt = symptoms.getIfobt();
		
		
//		
//		if(ifobt.isIspositiveIFOBT() && ifobt.isNBCSPOrOther()) {
//			
//		}
	}
}
