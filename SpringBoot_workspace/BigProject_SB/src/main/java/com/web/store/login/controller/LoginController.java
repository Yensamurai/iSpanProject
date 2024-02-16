//package com.web.store.login.controller;
//
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.CookieValue;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.SessionAttributes;
//
//import com.web.store.common.GlobalService;
//import com.web.store.login.model.LoginBean;
//import com.web.store.login.validator.LoginBeanValidator;
//import com.web.store.register.model.registerBean;
//import com.web.store.register.service.RegisterService;
//
//import jakarta.servlet.http.Cookie;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//
//@Controller
//@RequestMapping("/login")
//@SessionAttributes({"LoginOK"}) 
//public class LoginController {
//	
//	private static Logger log = LoggerFactory.getLogger(LoginController.class);
//	
//	String loginForm = "login\\loginForm";
//	String loginOut = "login\\logout";
//	
//	RegisterService registerService;
//	
////	@Autowired
//	public LoginController(RegisterService registerService) {
//		this.registerService = registerService;
//	}
//
//	@GetMapping("/login")
//	public String login00(HttpServletRequest request, Model model, 
//		@CookieValue(value="user", required = false) String user,
//		@CookieValue(value="password", required = false) String password, 
//		@CookieValue(value="rm", required = false) Boolean rm 
//			) {
//		if (user == null)
//			user = "";
//		if (password == null) {
//			password = "";
//		} else {
//			password = GlobalService.decryptString(GlobalService.KEY, password);
//		}
//		
//		if (rm != null) {
//			rm = Boolean.valueOf(rm);
//		} else {
//			rm = false;
//		}
//			
//		LoginBean bean = new LoginBean(user, password, rm);
//		model.addAttribute(bean);	 // 
//		log.info("送出登入表單, account=" + user);
//		return loginForm;
//	}
//	
//	@PostMapping("/login")
//	public String checkAccount(
//			@ModelAttribute("loginBean") LoginBean bean,
//			BindingResult result, Model model,
//			HttpServletRequest request, HttpServletResponse response) {
//		
//		LoginBeanValidator validator = new LoginBeanValidator();
//		validator.validate(bean, result);
//		if (result.hasErrors()) {
//			return loginForm;
//		}
//		String password = bean.getPassword();
//		registerBean member = null;
//		try {
//			// 呼叫 loginService物件的 checkIDPassword()，傳入account與password兩個參數
//			member = registerService.findByAccountAndPassword(bean.getAccount(),  
//					               password);
//			if (member != null) {
//				// OK, 登入成功, 將mb物件放入Session範圍內，識別字串為"LoginOK"
//				model.addAttribute("LoginOK", member);
//				log.info("登入成功，MemberBean=" + member);
//			} else {
//				// NG, 登入失敗, account與密碼的組合錯誤，放相關的錯誤訊息到 errorMsgMap 之內
//				result.rejectValue("invalidCredentials", "", "該帳號不存在或密碼錯誤");
//				log.info("登入失敗，userid=" + bean.getAccount() + ", 密碼=" + password);
//				return loginForm;
//			}
//		} catch (RuntimeException ex) {
//			result.rejectValue("invalidCredentials", "", ex.getMessage());
//			ex.printStackTrace();
//			return loginForm;
//		}
//		HttpSession session = request.getSession();
//		processCookies(bean, request, response);
//		String nextPath = (String)session.getAttribute("requestURI");
//		System.out.println("nextPath=" + nextPath);
//		if (nextPath == null) {
//			nextPath = "/";
////			nextPath = request.getContextPath();
//		}
//		return "redirect:" + nextPath;
//	}
//
//	
//	private void processCookies(LoginBean bean, HttpServletRequest request, HttpServletResponse response) {
//		Cookie cookieUser = null;
//		Cookie cookiePassword = null;
//		Cookie cookieRememberMe = null;
//		String account = bean.getAccount();
//		String password = bean.getPassword();
//		
//		// rm存放瀏覽器送來之RememberMe的選項，如果使用者對RememberMe打勾，rm就不會是null
//		if (bean.isRememberMe()) {
//			cookieUser = new Cookie("user", account);
//			cookieUser.setMaxAge(7 * 24 * 60 * 60);       // Cookie的存活期: 七天
//			cookieUser.setPath(request.getContextPath());
//
//			String encodePassword = GlobalService.encryptString(password);
//			cookiePassword = new Cookie("password", encodePassword);
//			cookiePassword.setMaxAge(7 * 24 * 60 * 60);
//			cookiePassword.setPath(request.getContextPath());
//
//			cookieRememberMe = new Cookie("rm", "true");
//			cookieRememberMe.setMaxAge(7 * 24 * 60 * 60);
//			cookieRememberMe.setPath(request.getContextPath());
//		} else { // 使用者沒有對 RememberMe 打勾
//			cookieUser = new Cookie("user", account);
//			cookieUser.setMaxAge(0); // MaxAge==0 表示要請瀏覽器刪除此Cookie
//			cookieUser.setPath(request.getContextPath());
//
//			String encodePassword = GlobalService.encryptString(password);
//			cookiePassword = new Cookie("password", encodePassword);
//			cookiePassword.setMaxAge(0);
//			cookiePassword.setPath(request.getContextPath());
//
//			cookieRememberMe = new Cookie("rm", "true");
//			cookieRememberMe.setMaxAge(0);
//			cookieRememberMe.setPath(request.getContextPath());
//		}
//		response.addCookie(cookieUser);
//		response.addCookie(cookiePassword);
//		response.addCookie(cookieRememberMe);
//		
//	}
//}
