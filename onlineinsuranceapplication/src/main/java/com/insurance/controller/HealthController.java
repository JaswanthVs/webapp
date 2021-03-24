package com.insurance.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.insurance.model.Insurance;
import com.insurance.model.Health;
import com.insurance.service.HealthService;

@Controller
public class HealthController {
	@Autowired
	private HealthService customerService;
	

	@GetMapping("/home")
	public ModelAndView goHome() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("customer_home");
		return mv;
	}
	
	
	

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView sayHello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("customer_home");
		return mv;
	}

	
	
	
	@GetMapping("/viewinsurances")
	public String listStudents1(Model model) {
		List<Insurance> healthInsurances = customerService.getAllHealthInsurances();
		model.addAttribute("listInsurance", healthInsurances);
		return "availableinsurances";
	}
	
	
	


	@GetMapping("/applyMedicalInsurance")
	public String registerPage(Model model){
		model.addAttribute("health", new Health());
		
		return "medicalform";
		}
	
	@GetMapping("/applyFamilyInsurance")
	public String registerPagefamily(Model model){
		model.addAttribute("health", new Health());
		
		return "familyform";
		}
	
	
	
	
	
	
	@RequestMapping(value="/appliedSuccessfully", method = RequestMethod.POST)
	public ModelAndView listGrade(@ModelAttribute Health health) {
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   health.setAppliedon(dtf.format(now));
		   health.setInsurance_name("Health-Medical");
		health.setStatus("Pending");
		customerService.saveApplication(health);

		ModelAndView mv = new ModelAndView();
//		List<Health> listInsurance=healthService.getAllInsurances();
//		mv.addObject("listInsurance",listInsurance);
		mv.setViewName("applied");
		return mv;
	}
	
	
	@RequestMapping("/logout")
	public ModelAndView logout() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("index1");
		return mv;
	}
	
	
	
	
	@RequestMapping("/viewmyapplications")
	public String listApplications(Model model) {
		List<Health> studentList = customerService.getAllApplications();
		model.addAttribute("listInsurance", studentList);
		return "healthApplications";
	}
	
	

	
	
	



}