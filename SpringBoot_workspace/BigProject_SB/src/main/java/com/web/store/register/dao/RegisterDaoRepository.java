//package com.web.store.register.dao;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.web.store.model.MemberBean;
//
//import jakarta.transaction.Transactional;
//@Repository
//@Transactional
//public interface RegisterDaoRepository extends JpaRepository<MemberBean, Integer> {
//
//	MemberBean findByAccount(String account);
//////	@Modifying
//////	@Query("UPDATE MemberEntity SET unpaid_amount = unpaid_amount + :totalAmount "
//////	 	 + " WHERE memberId = :mid")
//////    public void updateUnpaidAmount(@Param("totalAmount") Double totalAmount, 
//////    		                 @Param("mid") String mid);
//	
//	
//	
//
//	
//	
////	@Query("SELECT e FROM YourEntity e WHERE e.someField = :someValue")	
////	List<YourEntity> findBySomeField(@Param("someValue") String someValue);
////	@Query("select rb1_0.id,rb1_0.account,rb1_0.birthday,rb1_0.mail,rb1_0.password,rb1_0.phone,rb1_0.username from `member` rb1_0 where rb1_0.account = :account")
////	registerBean findByAccount(@Param("account") String account);
//
//////	Member findByMemberIdAndPassword(String memberId, String password);	
//}