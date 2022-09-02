package com.mycom.word;

public interface ICRUD {
    public Object add();//데이터 추가, 객체를 return
    public int update(Object obj);//데이터 수정
    public int delete(Object obj);//데이터 삭제
    public void selectOne(int id);//데이터 한개 조회

}