package com.spring.jdbc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
@Configuration
public class JdbcConfig {
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Prity@1996");
		return ds;
	}
	@Bean(name={"jdbcTemplate"})
	public JdbcTemplate getTemplate() {
		 JdbcTemplate jdbcTemplate=new JdbcTemplate();
		 jdbcTemplate.setDataSource(getDataSource());
		 return jdbcTemplate;
	}
	@Bean("studentDao")
	public StudentDao getStudentDao() {
		StudentDao studentDao=new StudentDaoImpl();
		((StudentDaoImpl) studentDao).setJdbcTemplate(getTemplate());
		return studentDao;
	}
}
