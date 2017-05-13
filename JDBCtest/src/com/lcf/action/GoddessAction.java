package com.lcf.action;

import java.util.List;

import com.lcf.dao.GoddessDao;
import com.lcf.model.Goddess;


public class GoddessAction {
	
    public static void main(String[] args) throws Exception {
    	
    	GoddessDao g=new GoddessDao();
    	List<Goddess> gs=g.query();
    	//遍历集合
    	for (Goddess goddess : gs) {
			System.out.println(goddess.getUser_name()+","+goddess.getAge());
		}
	}
	
}
