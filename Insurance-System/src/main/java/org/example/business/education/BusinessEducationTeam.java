package org.example.business.education;

import org.example.Team;
import org.example.business.design.controller.dto.Request;
import org.example.business.design.controller.dto.Response;
import org.example.business.education.model.Education;
import org.example.business.education.model.EducationListImpl;

/**
 * @author USER
 * @version 1.0
 * @created 21-5-2024 ���� 11:14:31
 */
public class BusinessEducationTeam extends Team {

	public Education m_Education;
	public EducationListImpl m_EducationListImpl;

	public BusinessEducationTeam(){

	}

	@Override
	public void manage() {

	}

	@Override
	public Response process(int function, Request request) {
		return null;
	}

	@Override
	public void register() {

	}

	@Override
	public void remove() {

	}

	@Override
	public Object retrieve() {
		return null;
	}

}