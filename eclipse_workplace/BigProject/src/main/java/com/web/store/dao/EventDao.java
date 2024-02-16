package com.web.store.dao;

import java.util.List;

import com.web.store.model.EventBean;

public interface EventDao {
	List<EventBean> getAllEvents();
}
