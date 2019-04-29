package com.cbc.model.bo;
import java.sql.Date;

import com.cbc.model.pojo.ChargeBack;
import com.cbc.model.pojo.Emi;

public interface EmiDAO {
			
		public int saveForm(Emi emi);
		public Date calculateDueDate(int loanid);		
	}


