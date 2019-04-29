package com.cbc.model.bo;
import java.util.List;

//import com.cbc.model.pojo.CustomerDetails;
import com.cbc.model.pojo.BankUser;;
public interface FormDAO {
	
		
		public int saveForm(BankUser bu);
		public int validateUser(String user,String pwd);
		//public List<CustomerDetails> getAllCustomer();
		//public CustomerDetails getByuserId(int fmid);
	/*	public int updateForm(Form fm);
		public List<Form> getAllForm();
		public int deleteForm(int fmid);
		
*/
	}


