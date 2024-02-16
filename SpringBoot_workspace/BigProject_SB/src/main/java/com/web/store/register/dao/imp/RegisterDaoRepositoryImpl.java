//package com.web.store.register.dao.imp;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.function.Function;
//
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
//
//import com.web.store.register.dao.RegisterDaoRepository;
//import com.web.store.register.model.registerBean;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//
//public class RegisterDaoRepositoryImpl implements RegisterDaoRepository {
//	
//	@PersistenceContext
//	EntityManager  entityManager;
//	
//	@Override
//	public void flush() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public <S extends registerBean> S saveAndFlush(S entity) {
//		// TODO Auto-generated method stub
//		return entity;
//	}
//
//	@Override
//	public <S extends registerBean> List<S> saveAllAndFlush(Iterable<S> entities) {
//		// TODO Auto-generated method stub
//		return (List<S>) entities;
//	}
//
//	@Override
//	public void deleteAllInBatch(Iterable<registerBean> entities) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void deleteAllInBatch() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public registerBean getOne(Integer id) {
//		// TODO Auto-generated method stub
//		return entityManager.getReference(registerBean.class, id);
//	}
//
//	@Override
//	public registerBean getById(Integer id) {
//		// TODO Auto-generated method stub
//		return entityManager.find(registerBean.class, id);
//	}
//
//	@Override
//	public registerBean getReferenceById(Integer id) {
//		// TODO Auto-generated method stub
//		return entityManager.getReference(registerBean.class, id);
//	}
//
//	@Override
//	public <S extends registerBean> List<S> findAll(Example<S> example) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends registerBean> List<S> findAll(Example<S> example, Sort sort) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends registerBean> List<S> saveAll(Iterable<S> entities) {
//		// TODO Auto-generated method stub
//		return (List<S>) entities;
//	}
//
//	@Override
//	public List<registerBean> findAll() {
//	    return entityManager.createQuery("SELECT r FROM registerBean r", registerBean.class).getResultList();
//	}
//
//
//	@Override
//	public List<registerBean> findAllById(Iterable<Integer> ids) {
//		// TODO Auto-generated method stub
//		return findAllById(ids);
//	}
//
//	@Override
//	public <S extends registerBean> S save(S entity) {
//		// TODO Auto-generated method stub
//		return save(entity);
//	}
//
////	@Override
////	public Optional<registerBean> findById(Integer id) {
////		registerBean result = entityManager.find(registerBean.class, id);
////		return result;
////	}
//
//	@Override
//	public boolean existsById(Integer id) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public long count() {
//	    return entityManager.createQuery("SELECT COUNT(r) FROM registerBean r", Long.class).getSingleResult();
//	}
//
//	@Override
//	public void deleteById(Integer id) {
//		// TODO Auto-generated method stub
//		deleteById(id);
//	}
//
//	@Override
//	public void delete(registerBean entity) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void deleteAllById(Iterable<? extends Integer> ids) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void deleteAll(Iterable<? extends registerBean> entities) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void deleteAll() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public List<registerBean> findAll(Sort sort) {
//	    return entityManager.createQuery("SELECT r FROM registerBean r ORDER BY " + sort.toString(), registerBean.class).getResultList();
//	}
//
//	@Override
//	public Page<registerBean> findAll(Pageable pageable) {
//	    // 使用 Spring Data 提供的方法來執行分頁查詢
//	    return findAll(pageable);
//	}
//
//	@Override
//	public <S extends registerBean> Optional<S> findOne(Example<S> example) {
//		// TODO Auto-generated method stub
//		return Optional.empty();
//	}
//
//	@Override
//	public <S extends registerBean> Page<S> findAll(Example<S> example, Pageable pageable) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends registerBean> long count(Example<S> example) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public <S extends registerBean> boolean exists(Example<S> example) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public <S extends registerBean, R> R findBy(Example<S> example,
//			Function<FetchableFluentQuery<S>, R> queryFunction) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public registerBean findByAccount(String account) {
//		// TODO Auto-generated method stub
//		return findByAccount(account);
//	}
//
//	@Override
//	public registerBean findByName(String username) {
//		// TODO Auto-generated method stub
//		return findByName(username);
//	}
//
//	@Override
//	public void update(registerBean rb) {
//		entityManager.merge(rb);
//		
//	}
//	
//	@Override
//	public Optional<registerBean> findById(Integer id) {
//		registerBean result = entityManager.find(registerBean.class, id);
//		return Optional.of(result);
//	}
//
//	@Override
//	public boolean isPersist(registerBean rb) {
//		// 判斷參數rb是否為entityManager控管的永續物件
//		boolean ans = entityManager.contains(rb); 
//		if (ans)
//		   return true;
//		else 
//			return false;
//	}
//
//
//}
