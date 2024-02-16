//package com.web.store.register.service.impl;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.web.store.common.GlobalService;
//import com.web.store.model.MemberBean;
//import com.web.store.register.dao.RegisterDaoRepository;
//import com.web.store.register.service.RegisterService;
//
//
//
//@Service
//@Transactional
//public class RegisterServiceImpl implements RegisterService {
//	
//	RegisterDaoRepository registerDaoRepository;
//	
//	private static Logger log = LoggerFactory.getLogger(RegisterServiceImpl.class);
//	
//	public RegisterServiceImpl(RegisterDaoRepository registerDaoRepository) {
//		this.registerDaoRepository = registerDaoRepository;
//	}
//
//	@Override
//	public void save(MemberBean rb) {
//		log.info("會員註冊功能之Service: 儲存會員資料");
//		registerDaoRepository.save(rb);
//	}
//	
//	@Override
//	public boolean existsByAccount(String account) {
//		log.info("會員註冊功能之Service: 檢查會員輸入的編號是否已被使用");
//		MemberBean reg = registerDaoRepository.findByAccount(account);
//		boolean exist = reg != null;
//		return exist;
//	}
//	
//	@Override
//	public MemberBean findByAccount(String account) {
//		log.info("會員註冊功能之Service: 由會員編號找出對應的會員");
//		MemberBean reg = registerDaoRepository.findByAccount(account);
//		return reg;
//	}
//
////	@Override
////	public void update(registerBean rb) {
////		
////		registerDaoRepository.update(rb);
////	}
//
//
//
//	@Override
//	public MemberBean findByAccountAndPassword(String account, String password) {
//		MemberBean reg = registerDaoRepository.findByAccount(account);
//		
//		if (reg !=  null && GlobalService.checkBCryptPassword(password, reg.getPassword())) {
//			;
//		} else {
//			reg = null;
//		};
//	    log.info("會員登入功能之Service: 檢查帳號/密碼結果:" 
//					+ (reg == null? "帳號/密碼正確" : "帳號/密碼錯誤"));
//		
//		return null;
//	}
//
//
//
//
//
//
//}
