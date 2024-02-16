//package com.web.store.register.service.impl;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.web.store.common.GlobalService;
//import com.web.store.register.dao.regDaoRepository;
//import com.web.store.register.model.registerBean;
//import com.web.store.register.service.regService;
//@Service
//@Transactional
//public class regServiceImpl implements regService {
//	private static Logger log = LoggerFactory.getLogger(regServiceImpl.class);
//	
//	regDaoRepository regdaorepository;
//	
//	public regServiceImpl(regDaoRepository regdaorepository) {
//		this.regdaorepository = regdaorepository;
//	}
//
//	@Override
//	public void save(registerBean rb) {
//		log.info("會員註冊功能之Service: 儲存會員資料");
//		regdaorepository.save(rb);
//	}
//
//	@Override
//	public registerBean findByAccount(String account) {
//		log.info("會員註冊功能之Service: 由會員編號找出對應的會員");
//		registerBean member = regdaorepository.findByAccount(account);
//		return member;
//	}
//
//	@Override
//	public registerBean findByAccountAndPassword(String account, String password) {
//		registerBean member = regdaorepository.findByAccount(account);
//		if (member != null && GlobalService.checkBCryptPassword(password, member.getPassword())) {
//			;
//		}else {
//			member = null;
//		};
//		log.info("會員登入功能之Service: 檢查帳號/密碼結果:" 
//		+ (member == null? "帳號/密碼正確" : "帳號/密碼錯誤"));
//		
//		return member;
//	}
//
//	@Override
//	public boolean exsistByAccount(String account) {
//		log.info("會員註冊功能之Service: 檢查會員輸入的帳號是否已被使用");
//		registerBean member = regdaorepository.findByAccount(account);
//		boolean exist = member !=null;
//		return exist;
//	}
//	@Override
//	public void insertMember(registerBean member) {
//        // 調用自定義的 INSERT INTO 方法
//		regdaorepository.insertMember(
//            member.getAccount(),
//            member.getMail(),
//            member.getPassword(),
//            member.getPhone(),
//            member.getUsername()
//        );
//		}
//	
//}
