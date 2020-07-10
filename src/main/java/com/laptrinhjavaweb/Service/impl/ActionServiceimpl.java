package com.laptrinhjavaweb.Service.impl;

import com.laptrinhjavaweb.DAO.IActionDAO;
import com.laptrinhjavaweb.Service.IActionService;
import com.laptrinhjavaweb.entity.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionServiceimpl implements IActionService {
    @Autowired
    IActionDAO iActionDAO;
    @Override
    public List<Action> getAll() {
        return iActionDAO.getAll();
    }
}
