package com.insurance.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.insurance.model.Health;
import com.insurance.model.Insurance;

import com.insurance.service.HealthService;

@Controller
public class ManagerController {

	@Autowired
	private HealthService customerService;


	
	@GetMapping(value = "/manager")
	public ModelAndView sayHello1() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("Managerscreen");
		return mv;
	}
	
	
	
	@RequestMapping("/newinsurance")
	public String newCustomerForm1(Map<String, Object> model) {
		Insurance insurance = new Insurance();
		model.put("insurance", insurance);
		return "new_insurance";
	}
	
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveCustomer(@ModelAttribute Insurance insurance){
		customerService.addInsurance(insurance);
		ModelAndView mv = new ModelAndView();
		List<Insurance> studentList = customerService.getAllInsurances();
		mv.addObject("listInsurance", studentList);
		mv.setViewName("insurances");
		return mv;
	}
	
	
	
	
	@RequestMapping("/insurances")
	public String listStudents(Model model) {
		List<Insurance> studentList = customerService.getAllInsurances();
		model.addAttribute("listInsurance", studentList);
		return "insurances";
	}


	

	
	@RequestMapping("/viewApplications")
	public String viewApplications(Model model) {

		return "customerApplications";
	}
	
	@RequestMapping("/viewHealthApplications")
	public String listApplications(Model model) {
		List<Health> studentList = customerService.getAllApplications();
		model.addAttribute("listInsurance", studentList);
		return "ManagerHealthApplications";
	}
	

	
	
	
	@RequestMapping(value="delete/{id}")
	public String deleteCourse(@PathVariable("id") String id) {

		int i = Integer.parseInt(id);
		customerService.delete(i);
		return "redirect:/insurances.mvc";
	}
	
	
	
	 @GetMapping("/accept/{id}") 
	 public String acceptApp(@PathVariable("id") String id) {
		 int i = Integer.parseInt(id); 
	 System.out.println(i);
	 customerService.update(i); 

	 return "customerApplications";
	 } 
	 
	 
	 @GetMapping("/reject/{id}") 
	 public String RejectApp(@PathVariable("id") String id) {
		 int i = Integer.parseInt(id); 
	 System.out.println(i);
	 customerService.reject(i); 

	 return "customerApplications";
	 } 
	 
//		@RequestMapping(value="delete/{id}")
//		public String deleteCourse(@PathVariable("id") String id) {
//
//			int i = Integer.parseInt(id);
//			customerService.updatestatus(i);
//			return "redirect:/ManagerHealthApplications.mvc";
//		}
	 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	


	


//	@RequestMapping(value = "/saveUserForm", method = RequestMethod.POST)
//	public ModelAndView saveUserForm(@ModelAttribute User user){
//		customerService.saveUserForm(user);
//		ModelAndView mv = new ModelAndView();
//		List<Insurance> userForm = customerService.getAllInsurances();
//		mv.addObject("listInsurance", userForm);
//		mv.setViewName("userResult");
//		return mv;
//	}
	
	
//	@RequestMapping(value = "/resultuser",method = RequestMethod.POST)
//	public ModelAndView processUser(@ModelAttribute User user) {
//		customerService.saveUserForm(user);
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("userResult");
//		
////		user.setName("Hi Nikhil");
//		
//		modelAndView.addObject("u", user);
//		
//		return modelAndView;
//	}
	
	




//@RequestMapping("/edit")
//public ModelAndView editdetails(@RequestParam("id") int id) {
//
//	ModelAndView mv = new ModelAndView("/edit", "insurance", new Insurance());
//	Insurance insurance = insurance.(id);
//	mv.addObject("u", insurance);
//
//	return mv;
//}

	
	
	
	
	
	
	
	
	
	
//	@RequestMapping(value = "/edit", method = RequestMethod.POST)
//	public ModelAndView editCustomer(@ModelAttribute Insurance insurance) {
//		customerService.(insurance);
//		ModelAndView mv = new ModelAndView();
//		List<Insurance> studentList = customerService.getAllInsurances();
//		mv.addObject("listInsurance", studentList);
//		mv.setViewName("insurances");
//		return mv;
//	}
//    @RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
//    public ModelAndView deleteEmployee(HttpServletRequest request) {
//        int employeeId = Integer.parseInt(request.getParameter("id"));
//        employeeService.deleteEmployee(employeeId);
//        return new ModelAndView("redirect:/");
//    }
//
//    @RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
//    public ModelAndView deleteEmployee(HttpServletRequest request) {
//        int employeeId = Integer.parseInt(request.getParameter("id"));
//        employeeService.deleteEmployee(employeeId);
//        return new ModelAndView("redirect:/");
//    }
	
//    @RequestMapping(value = "/editEmployee", method = RequestMethod.GET)
//    public ModelAndView editContact(HttpServletRequest request) {
//        int id = Integer.parseInt(request.getParameter("id"));
//        Insurance insurance = customerService.findCustomerId(id);
//        employeeService.updateEmployee(employee);
//        ModelAndView model = new ModelAndView("InsuranceForm");
//        model.addObject("employee", insurance);
// 
//        return model;
//    }



