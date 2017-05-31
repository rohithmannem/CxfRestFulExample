package com.cxfRestApi.example.resource;

import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.springframework.stereotype.Service;

import com.cxfRestApi.example.beans.UserBean;

import in.benchresources.cdm.user.User;

@Service("userResource")
public class IUserResourceImpl implements IUserResource {
	
	

	@Override
	public User getUserInfo(int userId) {
		
		System.out.println("In IUserResourceImpl class and getUserInfo() method *************");
		String username = "Siddharth";
		
		GregorianCalendar gcal = new GregorianCalendar();
		
		User user = new User();
		user.setUserId(userId);
		user.setFirstName("Siddharth");
		user.setLastName("Mannem");
		user.setMatches(1);
		user.setSalary(5000.00);
		try {
			user.setDob(DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal));
			
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public UserBean getUserDetails(int userId) {

		System.out.println("In IUserResourceImpl class and getUserDetails() method #############");

		UserBean userBean = new UserBean();
		userBean.setUserId(userId);
		userBean.setFirstName("Goutham");
		userBean.setLastName("Mannem");
		
		return userBean;
	}

	@Override
	public List<UserBean> getAllUsers() {

		

		return null;
	}
}
