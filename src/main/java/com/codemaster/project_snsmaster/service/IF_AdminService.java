package com.codemaster.project_snsmaster.service;

import com.codemaster.project_snsmaster.vo.MemberVO;

public interface IF_AdminService {

    public void insert(MemberVO memberVO)throws Exception;

    public int overlappedID(String id) throws Exception;

    public int overlappedEmail(String email) throws Exception;


}
