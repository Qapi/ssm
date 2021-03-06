package com.FangBianMian.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FangBianMian.dao.IMemberDao;
import com.FangBianMian.domain.Member;
import com.FangBianMian.service.IMemberService;

@Service
public class MemberServiceImpl implements IMemberService {

	@Autowired
	private IMemberDao memberDao;

	@Override
	public void insertMember(Member m) {
		memberDao.insertMember(m);
	}
	
	@Override
	public void updateMember(Member m) {
		memberDao.updateMember(m);
	}
	
	@Override
	public List<Member> queryMembersByParam(Map<String, Object> param) {
		return memberDao.queryMembersByParam(param);
	}

	@Override
	public int queryMembersByParamTotal(Map<String, Object> param) {
		return memberDao.queryMembersByParamTotal(param);
	}
	
	@Override
	public Member queryMemberByUsername(String phone) {
		return memberDao.queryMemberByUsername(phone);
	}
}
