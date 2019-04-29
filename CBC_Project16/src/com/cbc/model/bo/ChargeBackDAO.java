package com.cbc.model.bo;

import java.util.List;

import com.cbc.model.pojo.ChargeBack;
import com.cbc.model.pojo.Refund;

public interface ChargeBackDAO {

	public int insertCBC(ChargeBack cbc);
	public ChargeBack calculateChargeback(int loanid);
	public List<ChargeBack> showAll();
	public ChargeBack showById(long accno);
	public int updateCbc(ChargeBack cbc);
	public int insertRefund(Refund cbc);
}
