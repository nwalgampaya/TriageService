package au.uni.mel.ColonoscopyTriage.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import au.uni.mel.ColonoscopyTriage.model.IFOBT;
import au.uni.mel.ColonoscopyTriage.model.Symptoms;
import au.uni.mel.ColonoscopyTriage.repo.IFOBTRepository;

@CrossOrigin(origins = {"${cross.origin.path}"})
@RestController
@RequestMapping("/api")
public class SymptomsController {

	
	@Autowired
	IFOBTRepository ifobtRepository;
	
	@PostMapping("/getCategory")
	public String triageCategory(@Valid @RequestBody Symptoms symptoms) {
		System.out.println("In triageCategory");
		String selectedCategory = "test";
		
		findSuitableCategory(symptoms);
		
		return selectedCategory;
	}
	
	@PostMapping("/getIfobtCategory")
	public String triageIfobtCategory(@Valid @RequestBody IFOBT ifobt) {
		System.out.println("In triageCategory");
		String selectedCategory = "test";
		Symptoms symptoms= new Symptoms();
		
		symptoms.setIfobt(ifobt);
		
		findSuitableCategory(symptoms);
		
		return selectedCategory;
	}
	
	public void findSuitableCategory(Symptoms symptoms) {
		System.out.println("In findSuitableCategory");
		IFOBT ifobtClient = symptoms.getIfobt();
		
		Iterable<IFOBT> ifobtServerList = ifobtRepository.findAll();
		
		for (IFOBT ifobtServer : ifobtServerList) {
			
			System.out.println("ifobt client value = "+ ifobtClient.isPositiveIFOBT());
			System.out.println("NBCSPOrOther client  value = "+ ifobtClient.isNBCSPOrOther());
			System.out.println("ifobt Server  value = "+ ifobtServer.isPositiveIFOBT());
			System.out.println("NBCSPOrOther Server  value = "+ ifobtServer.isNBCSPOrOther());
			
			if(Boolean.valueOf(ifobtClient.isPositiveIFOBT()).equals(ifobtServer.isPositiveIFOBT()) && 
					Boolean.valueOf(ifobtClient.isNBCSPOrOther()).equals(ifobtServer.isNBCSPOrOther()))
			{
				System.out.println("in 1"+ ifobtServer.getId());
			}else {
				System.out.println("in else"+ ifobtServer.getId());
			}
		}
//		
//		if(ifobt.isIspositiveIFOBT() && ifobt.isNBCSPOrOther()) {
//			
//		}
	}
}
