package com.dbCLM;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dbCLM.entities.Nace;
import com.dbCLM.repository.NaceRepository;

@SpringBootTest
class DbClmApplicationTests {

	@Autowired
	private NaceRepository NaceRepo;
	
	@Test
	public void testsave() {
		Nace n=new Nace();
		n.setId(398481L);
		n.setLevel(1L);
		n.setCode('A');
		n.setParent("");
		n.setDescription("Business");
		n.setThisItemIncludes("This includes marketing");
		n.setThisItemAlsoIncludes("This also includes strategies");
		n.setRulings("");
		n.setThisItemExcludes("");
		n.setReferenceToISIC("A");
		NaceRepo.save(n);
		assertNotNull(NaceRepo.findById(398481L).get());
		
	}
	
		@Test
	      public void testUpdate() {
			Nace n=NaceRepo.findById(398481L).get();
			n.setCode('B');
			NaceRepo.save(n);
		}	

}
