//package com.web.store.register.dao;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.web.store.register.model.registerBean;
//
//public interface regDaoRepository extends JpaRepository<registerBean, Integer>{
//	
//	registerBean findByAccount(String account);
//	
//	@Transactional
//    @Modifying
//    @Query("INSERT INTO member (account, mail, password, phone, username) " +
//           "VALUES (:account, :mail, :password, :phone, :username)")
//    void insertMember(@Param("account") String account,
//                      @Param("mail") String mail,
//                      @Param("password") String password,
//                      @Param("phone") String phone,
//                      @Param("username") String username);
//	
//}
