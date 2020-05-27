package com.mapping.jsontype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private MyTableRepository repository;

	@GetMapping("/getData")
	public Iterable<MyTable> getData() {

		return repository.findAll();
	}

	@PostMapping("/addData")
	public void addData(@RequestBody MyTable tableData) {

		repository.save(tableData);
	}

}
