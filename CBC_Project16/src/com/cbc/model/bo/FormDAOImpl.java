package com.cbc.model.bo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cbc.connection.ConnectionFactory;
//import com.cbc.model.pojo.CustomerDetails;
//import com.cbc.model.pojo.CustomerTransactions;
import com.cbc.model.pojo.BankUser;;

	public class FormDAOImpl implements FormDAO {

		Connection con=null;
		public FormDAOImpl() {
			con=ConnectionFactory.openConn();
		}
		@Override
		public int saveForm(BankUser fm) {
			int status=0;
			try {
				PreparedStatement ps=con.prepareStatement("insert into bank_user values(?,?,?,?,?,?,?,?,?)");
				ps.setString(1, fm.getFirstname());
				ps.setString(2, fm.getLastname());
				ps.setInt(3, fm.getAge());
				ps.setString(4, fm.getGender());
				ps.setString(5, fm.getContactnumber());
				ps.setString(6, fm.getCity());
				ps.setString(7, fm.getState());
				ps.setString(8, fm.getUserid());
				ps.setString(9, fm.getPassword());
				status=ps.executeUpdate();
			}catch (Exception e) {
				System.out.println("Error in Insert form "+e);
			}
			return status;
		}
		@Override
		public int validateUser(String user, String pwd) {
			int status=0;
			try {
				PreparedStatement ps=con.prepareStatement("select user_id,password from bank_user where user_id=? and password=?");
				ps.setString(1, user);
				ps.setString(2, pwd);
				ResultSet rs=ps.executeQuery();
				if(rs.next())
					status=1;
				else
					status=0;
			}catch (Exception e) {
				System.out.println("Error in validate form "+e);
			}
			
			return status;
		}

	/*	@Override
		public int updateForm(Form fm) {
			int status=0;
			try {
				PreparedStatement ps=con.prepareStatement("update Form set firstname=?,lastname=?,age=? where empid=?");
				ps.setInt(4, emp.getEmpid());
				ps.setString(1, emp.getEmpname());
				ps.setInt(2, emp.getEmpage());
				ps.setDouble(3, emp.getEmpsalary());
				status=ps.executeUpdate();
			}catch (Exception e) {
				System.out.println("Error in Update Employee "+e);
			}
			return status;
		}
*/
		
		/*public List<CustomerDetails> getAllCustomer() {
			List<CustomerDetails> listEmp=new ArrayList<CustomerDetails>();
			try {			
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from customerdetails");
				while(rs.next())
				{
					CustomerDetails cd=new CustomerDetails();
					cd.setAccountnumber(rs.getInt(1));
					cd.setCustomername(rs.getString(2));
					cd.setContactnumber(rs.getString(3));
					
					listEmp.add(cd);
				}
			} catch (Exception e) {
				System.out.println("Error in getAll Employee "+e);
			}
			return listEmp;
		}*/
		
		
		
		
		
		/*public List<CustomerDetails> getTransaction() {
			List<CustomerTransactions> indcusdet=new ArrayList<CustomerTransactions>();	
			try {			
				PreparedStatement psth= con1.prepareStatement("select * from transactions where accountnumber=?");
				ResultSet rsth=psth.executeQuery();
				while(rsth.next())
				{
					CustomerDetails cd=new CustomerDetails();
					cd.setAccountnumber(rs.getInt(1));
					cd.setCustomername(rs.getString(2));
					cd.setContactnumber(rs.getString(3));
					
					listEmp.add(cd);
				}
			} catch (Exception e) {
				System.out.println("Error in getAll Employee "+e);
			}
			return listEmp;
		}
		
		*/
		
		
	/*
		@Override
		public int deleteForm(int fmid) {
			// TODO Auto-generated method stub
			return 0;
		}*/
	/*	@Override
		public CustomerDetails getByuserId(int cus_id) {
			
			CustomerDetails customer=null;
			try {			
			PreparedStatement ps= con.prepareStatement("select * from customerdetails where accountnumber=?");
			ps.setInt(1, cus_id);
			ResultSet rs= ps.executeQuery();
			if(rs.next())
			{
				customer=new CustomerDetails();
				customer.setAccountnumber(rs.getInt(1));
				customer.setCustomername(rs.getString(2));
				customer.setEmail(rs.getString(4));
				customer.setContactnumber(rs.getString(3));
				customer.setAcc_type(rs.getString(5));
			}
			}catch (Exception e) {
				System.out.println();
			}
			
			return customer;
		}*/

	
	

		
}
