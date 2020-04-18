package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
//@PropertySource({"classpath:message00.properties","classpath:message99.properties"})
public class HfhFrameWorkApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HfhFrameWorkApplication.class, args);
	}

	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public void run(String... args) throws Exception {
		// 初期データの導入
		jdbc.execute("Drop table tbl_sample if Exists");
		jdbc.execute(
				"create table tbl_sample(id Integer(11) primary key auto_increment, name varchar(20),remark varchar(200))");

		for (int i = 0; i < 10; i++) {
			jdbc.update("insert into tbl_sample(name,remark) values('Persona 000" + i + "','あいうえお')");
		}
	}

}
