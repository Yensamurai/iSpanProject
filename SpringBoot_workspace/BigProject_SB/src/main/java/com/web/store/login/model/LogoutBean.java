package com.web.store.login.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.web.store.model.MemberBean;

import jakarta.servlet.http.HttpSession;
// 登出時需要做的事寫在這裡，如session.invalidate()
public class LogoutBean {
   
	private static Logger log = LoggerFactory.getLogger(LogoutBean.class);
	HttpSession session;
	
	public LogoutBean(HttpSession session) {
		this.session = session;
	}

	public LogoutBean() {
	}

	public HttpSession getSession() {
		return session;
	}
	
	public void setSession(HttpSession session) {
		this.session = session;
	}

	public Integer getLogout() {
		MemberBean member = (MemberBean)session.getAttribute("LoginOK");
		String account = "";
		if (member != null) {
			account = member.getAccount();
		} else {
			account = "(未知)";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		log.info("使用者:" + account + "已於 " + sdf.format(new Date())  + " 登出...");
		session.invalidate();
		return 0;
	}
}
