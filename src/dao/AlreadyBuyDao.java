package dao;

import java.util.List;

import bean.AlreadyBuy;

public interface AlreadyBuyDao {

	// ���ﳵ�����Ʒ
	public boolean addBuyGoods(int uid, int gid, int number) throws Exception;

	// ��ȡָ���û��Ĺ��ﳵ�ڵ�������Ʒ
	public List<AlreadyBuy> getAllBuyGoods(int uid) throws Exception;

}
