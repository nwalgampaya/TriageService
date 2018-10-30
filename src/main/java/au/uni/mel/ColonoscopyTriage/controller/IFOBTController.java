package au.uni.mel.ColonoscopyTriage.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import au.uni.mel.ColonoscopyTriage.model.IFOBT;
import au.uni.mel.ColonoscopyTriage.repo.IFOBTRepository;

@CrossOrigin(origins = {"${cross.origin.path}"})
@RestController
@RequestMapping("/api")
public class IFOBTController {
	
	@Autowired
	IFOBTRepository ifobtRopository;
	
	@GetMapping("/ifobt")
	private List<IFOBT>  getIFOBT() {
		System.out.println("Get all IFOBT...");
		int iFOBTategory=0;
		List<IFOBT> ifobtArray = new ArrayList<>();
		Iterable<IFOBT> ifobt = ifobtRopository.findAll();
		
//		Iterable<IFOBT> ifobt = ifobtRopository.findAllifobt();		
//		IFOBT chooseAge = new IFOBT();
//		chooseAge.setNBCSPOrOther(true);
//		chooseAge.setPositiveIFOBT(true);
//		
//		ifobtArray.add(chooseAge);
		for (IFOBT ifobt2 : ifobt) {
			System.out.println("ifobt :"+ ifobt2);
		}
		ifobt.forEach(ifobtArray::add);
		
//		ages.forEach(list::add);
		return ifobtArray;
	}

}
