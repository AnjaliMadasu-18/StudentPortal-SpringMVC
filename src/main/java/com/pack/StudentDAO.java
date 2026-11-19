package com.pack;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDAO {

	
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	List getAllStudents() {
		String sql="select * from students71";
		RowMapper rowMapper =(rs, rowNum) -> new Student(
				rs.getInt("id"),
				rs.getString("fname"),
				rs.getString("lname"),
				rs.getString("email"),
				rs.getInt("age"),
				rs.getString("city"),
				rs.getString("state")
				);
		return jdbcTemplate.query(sql,rowMapper);
	}
	public int saveStudent(Student student) {
		String sql="insert into students71"+
	               "(fname, lname, email, age, city, state)"
				  +"values(?,?,?,?,?,?)";
		return jdbcTemplate.update(sql, student.getFname(),
				                        student.getLname(),
				                        student.getEmail(),
				                        student.getAge(),
				                        student.getCity(),
				                        student.getState()
				                        );

	}
	// DELETE STUDENT
	public void deleteStudent(int id) {

	    String sql = "DELETE FROM students71 WHERE id = ?";

	    jdbcTemplate.update(sql, id);
	}

	// GET STUDENT BY ID
	public Student getStudentById(int id) {

	    String sql = "SELECT * FROM students71 WHERE id = ?";

	    return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {

	        Student student = new Student(
	        		rs.getInt(id),
	            rs.getString("fname"),
	            rs.getString("lname"),
	            rs.getString("email"),
	            rs.getInt("age"),
	            rs.getString("city"),
	            rs.getString("state")
	        );

	        student.setId(rs.getInt("id"));

	        return student;
	    }, id);
	}

public int updateStudent(Student student) {

    String sql = "UPDATE students71 SET fname=?, lname=?, email=?, age=?, city=?, state=? WHERE id=?";

    return jdbcTemplate.update(
        sql,
        student.getFname(),
        student.getLname(),
        student.getEmail(),
        student.getAge(),
        student.getCity(),
        student.getState(),
        student.getId()
    );
}


}
