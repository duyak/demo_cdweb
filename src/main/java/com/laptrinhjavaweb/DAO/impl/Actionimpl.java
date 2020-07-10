package com.laptrinhjavaweb.DAO.impl;

import com.laptrinhjavaweb.DAO.IActionDAO;
import com.laptrinhjavaweb.entity.Action;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Actionimpl implements IActionDAO {
    @Autowired
    SessionFactory sessionFactory;
    @Override
    @Transactional
    public List<Action> getAll() {
        Session session=sessionFactory.getCurrentSession();
        List<Action> actionLists=session.createQuery("from Action").getResultList();
        return actionLists;
    }
}
