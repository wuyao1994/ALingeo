package com.alingeo.controller;

import java.util.Calendar;
import java.util.Date;

import com.alingeo.domin.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.alingeo.domin.Center;
import com.alingeo.domin.News;
import com.alingeo.domin.Teacher;
import com.alingeo.service.*;
import com.alingeo.util.FileUtil;

@Controller
public class AdminController {
	@Autowired
	private JoinService joinService;

	@Autowired
	private NewsService newsService;

	@Autowired
	private CenterService mCenterService;

	@Autowired
	private TeacherService mTeacherService;

	@Autowired
	private OrderService mOrderService;
	@Value("${img.newsImageLocation}")
	private String newsImageLocation;
	@Value("${img.centerImageLocation}")
	private String centerImageLocation;
	@Value("${img.teacherImageLocation}")
	private String teacherImageLocation;
	@Value("${img.orderImageLocation}")
	private String orderImageLocation;

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String homePage(Model model) {
		model.addAttribute("joins", joinService.findAll());
		return "admin";
	}

	@RequestMapping(value = "/admin/news", method = RequestMethod.GET)
	public String getMessage(Model model) {
		model.addAttribute("news", newsService.findAll());
		return "news";
	}

	@RequestMapping(value = "/admin/message", method = RequestMethod.GET)
	public String getNews(Model model) {
		model.addAttribute("joins", joinService.findAll());
		return "admin";
	}

	@RequestMapping(value = "/imageUpload", method = RequestMethod.POST)
	public String upLoadAccessory(@RequestParam("file") MultipartFile file,
			@RequestParam("id") Long id) {
		String fileName = file.getOriginalFilename();
		try {
			FileUtil.uploadFile(file.getBytes(), newsImageLocation, fileName);
			String imagePath = newsImageLocation + fileName;
			News news = newsService.findNewsById(id);
			news.setImagePath("/news/" + fileName);
			newsService.udpateNews(news);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:/admin/news";
	}

	@RequestMapping(value = "/admin/deleteNews/{id}", method = RequestMethod.GET)
	public String deleteNews(@PathVariable("id") Long id, Model model) {
		newsService.deleteNewsById(id);
		return "redirect:/admin/news";
	}

	@RequestMapping(value = "/admin/addNews", method = RequestMethod.GET)
	public String addNewsPage(Model model) {
		return "addNews";
	}

	@RequestMapping(value = "/admin/addNews", method = RequestMethod.POST)
	public String addNews(Model model, @RequestParam("file") MultipartFile file,
			@RequestParam("brief") String brief,
			@RequestParam("content1") String content1,
			@RequestParam("content2") String content2,
			@RequestParam("imageTitle") String imageTitle,
			@RequestParam("type") String type, @RequestParam("title") String title) {
		News news = new News();
		news.setContent1(content1);
		news.setContent2(content2);
		news.setBrief(brief);
		news.setImageTitle(imageTitle);
		news.setTitle(title);
		news.setType(type);
		Calendar cal = Calendar.getInstance();
		news.setDate(new Date());
		news.setYear(cal.get(Calendar.YEAR));
		news.setMonth(cal.get(Calendar.MONTH));
		news.setDay(cal.get(Calendar.DATE));
		if (!file.isEmpty()) {
			String fileName = file.getOriginalFilename();
			try {
				FileUtil.uploadFile(file.getBytes(), newsImageLocation, fileName);
				String imagePath = newsImageLocation + fileName;
				news.setImagePath("/news/" + fileName);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		newsService.createNews(news);
		return "redirect:/admin/news";
	}

	@RequestMapping(value = "/admin/teacher", method = RequestMethod.GET)
	private String adminTeacherPage(Model model) {
		model.addAttribute("teacherList", mTeacherService.findAll());
		return "teacher";
	}

	@RequestMapping(value = "/admin/deleteTeacher/{id}", method = RequestMethod.GET)
	private String deleteTeacherById(@PathVariable("id") Long id, Model model) {
		mTeacherService.deleteTeacherById(id);
		return "redirect:/admin/teacher";
	}

	@RequestMapping(value = "/admin/addTeacher", method = RequestMethod.GET)
	private String addTeacherPage(Model model) {
		return "addTeacher";
	}

	@RequestMapping(value = "/admin/addTeacher", method = RequestMethod.POST)
	private String addTeacher(Model model, @RequestParam("introduce") String introduce,
			@RequestParam("file") MultipartFile file) {
		Teacher teacher = new Teacher();
		teacher.setIntroduce(introduce);
		if (!file.isEmpty()) {
			String fileName = file.getOriginalFilename();
			try {
				FileUtil.uploadFile(file.getBytes(), teacherImageLocation, fileName);
				String imagePath = teacherImageLocation + fileName;
				teacher.setImagePath("/teacher/" + fileName);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		mTeacherService.create(teacher);
		return "redirect:/admin/teacher";
	}

	@RequestMapping(value = "/admin/center", method = RequestMethod.GET)
	private String adminCenterPage(Model model) {
		model.addAttribute("centerList", mCenterService.findAll());
		return "center";
	}

	@RequestMapping(value = "/admin/deleteCenter/{id}", method = RequestMethod.GET)
	private String deleteCenterById(@PathVariable("id") Long id, Model model) {
		mCenterService.deleteCenterById(id);
		return "redirect:/admin/center";
	}

	@RequestMapping(value = "/admin/addCenter", method = RequestMethod.GET)
	private String addCenterPage(Model model) {
		return "addCenter";
	}

	@RequestMapping(value = "/admin/addCenter", method = RequestMethod.POST)
	private String addCenter(Model model, @RequestParam("name") String name,
			@RequestParam("address") String address,
			@RequestParam("telephone") String telephone,
			@RequestParam("city") String city, @RequestParam("file") MultipartFile file) {
		Center center = new Center();
		center.setName(name);
		center.setAddress(address);
		center.setCity(city);
		center.setTelephone(telephone);
		if (!file.isEmpty()) {
			String fileName = file.getOriginalFilename();
			try {
				FileUtil.uploadFile(file.getBytes(), centerImageLocation, fileName);
				String imagePath = centerImageLocation + fileName;
				center.setImagePath("/center/" + fileName);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		mCenterService.create(center);
		return "redirect:/admin/center";
	}


	@RequestMapping(value = "/admin/order", method = RequestMethod.GET)
	private String adminOrderPage(Model model) {
		model.addAttribute("orders", mOrderService.findAll());
		return "order";
	}

	@RequestMapping(value = "/admin/deleteOrder/{id}", method = RequestMethod.GET)
	private String deleteOrderById(@PathVariable("id") Long id, Model model) {
		mOrderService.deleteOrderById(id);
		return "redirect:/admin/order";
	}

	@RequestMapping(value = "/admin/addOrder", method = RequestMethod.GET)
	private String addOrderPage(Model model) {
		return "addOrder";
	}

	@RequestMapping(value = "/admin/addOrder", method = RequestMethod.POST)
	private String addOrder(Model model, @RequestParam("pins") String pins,
							 @RequestParam("lines") String lines,
							 @RequestParam("weight") String weight,
							 @RequestParam("phone") String phone, @RequestParam("orderNumber") String orderNumber, @RequestParam("file") MultipartFile file) {
		Order order = new Order();
		order.setOrderLines(lines);
		order.setOrderPins(pins);
		order.setOrderWeight(weight);
		order.setOrderPhone(phone);
		order.setOrderNumber(orderNumber);
		if (!file.isEmpty()) {
			String fileName = file.getOriginalFilename();
			try {
				String currentTime = String.valueOf(System.currentTimeMillis());
				FileUtil.uploadFile(file.getBytes(), orderImageLocation, currentTime +fileName);
				String imagePath = orderImageLocation + currentTime + fileName;
				order.setImagePath(imagePath);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		mOrderService.create(order);
		return "redirect:/admin/order";
	}

}
