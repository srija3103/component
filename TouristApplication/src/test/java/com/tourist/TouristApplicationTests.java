package com.tourist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import com.tourist.entity.Tourist;
import com.tourist.repository.TouristRepository;

@SpringBootTest
class TouristApplicationTests {

	
@Autowired
TouristRepository trepo;
@SuppressWarnings("deprecation")
@Test
public void testCreate() {
	Tourist t=new Tourist();
			t.setTid(1251);
			t.setFirstname("venkat");
			t.setLastname("Krishna");
			t.setAge(52);
			t.setGender("male");
			t.setFplace("jangaon");
			t.setNodv(5);
			trepo.save(t);
			Assert.notNull(trepo.findById(1251).get());
}
@Test
public void testUpdate() {
	Tourist t= trepo.findById(1251).get();
	t.setAge(45);
	trepo.save(t);
	Assertions.assertNotEquals(52,trepo.findById(1251).get().getAge());
}
}
