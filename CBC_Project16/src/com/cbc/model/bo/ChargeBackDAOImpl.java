package com.cbc.model.bo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cbc.connection.ConnectionFactory;
import com.cbc.model.pojo.ChargeBack;
import com.cbc.model.pojo.Loan;
import com.cbc.model.pojo.Refund;

public class ChargeBackDAOImpl implements ChargeBackDAO {

	Connection con=null;
	public ChargeBackDAOImpl() {
		con=ConnectionFactory.openConn();

	}
	@Override
	public ChargeBack calculateChargeback(int loanid) {
		
		double chargeback = 0;
		ChargeBack cb=null;
		
		try {
			PreparedStatement ps=con.prepareStatement("select e.dueDate,e.paidDate, l.emi_amount, l.account_number, l.customer_name from emi e,loan l where e.loan_id =? and l.loan_id=?");
			ps.setInt(1, loanid);
			ps.setInt(2, loanid);				
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				Date dueDate=rs.getDate(1);
				Date paidDate=rs.getDate(2);
				double cbc=rs.getDouble(3);
				long accountNumber=rs.getLong(4);
				String customerName=rs.getString(5);
				System.out.println("Due Date in CalculateChargeBack :"+dueDate);
				System.out.println("Due Date in CalculateChargeBack :"+paidDate);
				System.out.println("Due Date in CalculateChargeBack :"+cbc);
				LocalDate dueDateLocal = LocalDate.of(dueDate.getYear(), dueDate.getMonth(), dueDate.getDate());
				LocalDate paidDateLocal = LocalDate.of(paidDate.getYear(), paidDate.getMonth(), paidDate.getDate());
				
				if (dueDateLocal.isBefore(paidDateLocal)) {
					chargeback = cbc * 0.001;
					cb=new ChargeBack(customerName, accountNumber, chargeback, new java.util.Date(), "Late Fees");
					System.out.println("CBC in IMple : "+cb);
				}					
			}
		} catch (Exception e2) {
			System.out.println(e2);
		}									
		return cb;
	}
	@Override
	public int insertCBC(ChargeBack cbc) {
		int status=0;
		try {
			PreparedStatement ps=con.prepareStatement("insert into chargeback values(?,?,?,?,?)");
			ps.setLong(1, cbc.getAccountNumber());
			ps.setDouble(2, cbc.getChargebackAmount());
			ps.setDate(3, new Date(cbc.getChargebackDate().getTime()));
			ps.setString(4, cbc.getCustomerName());
			ps.setString(5, cbc.getReason());				
			
			status=ps.executeUpdate();
		}catch (Exception e) {
			System.out.println("Error in Insert CBC "+e);
			status=2;
		}
		return status;
	}
	
	@Override
	public int insertRefund(Refund cbc) {
		int status=0;
		try {
			PreparedStatement ps=con.prepareStatement("insert into refund (customer_name,account_number,chargeback_amount,refund_date,reason,refund_status,refund_amount,comments)values(?,?,?,?,?,?,?,?)");
			ps.setString(1, cbc.getCustomer_name());
			ps.setLong(2, cbc.getAccount_number());
			ps.setDouble(3, cbc.getChargeback_amount());
			ps.setDate(4, new Date(cbc.getRefund_date().getTime()));
			ps.setString(5, cbc.getReason());
			ps.setString(6, cbc.getRefund_status());

			ps.setDouble(7, cbc.getRefund_amount());
		
			ps.setString(8, cbc.getComments());
						
			
			status=ps.executeUpdate();
		}catch (Exception e) {
			System.out.println("Error in Insert Refund "+e);
			status=2;
		}
		return status;
	}
	
	@Override
	public List<ChargeBack> showAll() {
		List<ChargeBack> cbc_list=new ArrayList<ChargeBack>();
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from chargeback");
			while(rs.next())
			{
				ChargeBack cbc=new ChargeBack();
				cbc.setAccountNumber(rs.getLong(1));
				cbc.setChargebackAmount(rs.getDouble(2));
				cbc.setChargebackDate(rs.getDate(3));
				cbc.setCustomerName(rs.getString(4));
				cbc.setReason(rs.getString(5));				
				cbc_list.add(cbc);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return cbc_list;
	}
	@Override
	public ChargeBack showById(long accno) {
		ChargeBack cbc=null;
		try {
			PreparedStatement st=con.prepareStatement("select * from chargeback where account_number=?");
			st.setLong(1, accno);
			ResultSet rs=st.executeQuery();
			
			while(rs.next())
			{
				cbc=new ChargeBack();
				cbc.setAccountNumber(rs.getLong(1));
				cbc.setChargebackAmount(rs.getDouble(2));
				cbc.setChargebackDate(rs.getDate(3));
				cbc.setCustomerName(rs.getString(4));
				cbc.setReason(rs.getString(5));								
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return cbc;
	}
	@Override
	public int updateCbc(ChargeBack cbc) {
		int status=0;
		try {
			PreparedStatement ps=con.prepareStatement("update chargeback set chargeback_amount=?, chargeback_date=?, reason=? where account_number=?");			
			ps.setDouble(1, cbc.getChargebackAmount());
			ps.setDate(2, new Date(cbc.getChargebackDate().getTime()));		
			ps.setString(3, cbc.getReason());				
			ps.setLong(4, cbc.getAccountNumber());
			status=ps.executeUpdate();
		}catch (Exception e) {
			System.out.println("Error in Update CBC "+e);			
		}
		return status;
	}


}
