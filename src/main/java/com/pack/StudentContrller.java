package com.pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentContrller {

	@Autowired
	StudentDAO studentDAO;
	@GetMapping("/student")
	String home() {
		return "student";
	}
	
	@GetMapping("/student-list")
	String getAllStudents(Model model) {
		
		List studentList =studentDAO.getAllStudents();
		model.addAttribute( "studentlist",studentList);
		  return "student-list";
	  }
	// DELETE STUDENT
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("id") int id) {

	    studentDAO.deleteStudent(id);

	    return "redirect:/student-list";
	}
	// EDIT STUDENT
	@GetMapping("/editStudent")
	public String editStudent(@RequestParam("id") int id, Model model) {

	    Student student = studentDAO.getStudentById(id);

	    model.addAttribute("student", student);

	    return "editStudent";
	}
	
	 
	@PostMapping("/saveStudent")
	  String saveStudent(@ModelAttribute Student student) {
		 studentDAO.saveStudent(student);
		  return"redirect:/student-list";
	  }

@PostMapping("/updateStudent")
public String updateStudent(
        @RequestParam("id") int id,
        @RequestParam("fname") String fname,
        @RequestParam("lname") String lname,
        @RequestParam("email") String email,
        @RequestParam("age") int age,
        @RequestParam("city") String city,
        @RequestParam("state") String state) {

    Student student = new Student(
        id,fname, lname, email, age, city, state
    );

    student.setId(id);

    studentDAO.updateStudent(student);

    return "redirect:/student-list";
}

}
