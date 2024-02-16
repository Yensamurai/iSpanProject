package com.web.store.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.store.dao.EventDao;
import com.web.store.model.EventBean;
@Repository
public class EventDaoImpl implements EventDao {
	SessionFactory factory;
	@Autowired
	public EventDaoImpl(SessionFactory factory) {
		this.factory = factory;
	}
	@Override
	public List<EventBean> getAllEvents() {
		
		Session session = factory.getCurrentSession();
	    String hql = "FROM EventBean";
	    List<EventBean> list = session.createQuery(hql,EventBean.class)//只在執行查詢(SELECT)時加BookBean.class
	    		.getResultList();
	    return list;
	}

}
