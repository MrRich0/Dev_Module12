package com.example;

import com.example.entity.Note;
import com.example.service.NodeService;
import com.example.service.RandomIdGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.random.RandomGenerator;

@SpringBootApplication
public class Module12DevApplication {

	public static void main(String[] args) {
		//SpringApplication.run(Module12DevApplication.class, args);
		NodeService nodeService = new NodeService();

		nodeService.add(new Note("A","B"));

		nodeService.add(new Note("C","G"));

		System.out.println("ListAll = " + nodeService.listAll());
		nodeService.deleteById(nodeService.listAll().get(1).getId());

		nodeService.update(nodeService.listAll().get(0),"F","Q");

		System.out.println("ListAll = " + nodeService.listAll());
		nodeService.getById(nodeService.listAll().get(0).getId());

		}

}
