package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.MemberRepository;

@Service
public class MemberService {
		
	@Autowired
	MemberRepository memberRepository;
}