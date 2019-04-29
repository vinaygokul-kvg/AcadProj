package com.cbc.model.bo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cbc.connection.ConnectionFactory;
import com.cbc.model.pojo.Loan;

public class LoanDAOImpl implements LoanDAO {
	
	Connection con=null;
	public LoanDAOImpl() {
	this.con=ConnectionFactory.openConn();
	}

	@Override
	public int addLoan(Loan l) {
		
		int status=0;
		try {
			PreparedStatement ps=con.prepareStatement("insert into loan(account_number,customer_name,emi_amount,interest_rate,loan_amount,no_of_years,sanction_date) values(?,?,?,?,?,?,?)");
			ps.setLong(1, l.getAccountNumber());
			ps.setString(2, l.getCustomer_name());
			ps.setDouble(3, l.getEmiAmount());
			ps.setDouble(4, l.getInterestRate());
			ps.setDouble(5, l.getLoanAmount());
			ps.setInt(6, l.getNoOfYears());
			ps.setDate(7, new Date(l.getSanctionDate().getTime()));
			status=ps.executeUpdate();
		}catch (Exception e) {
			System.out.println("Error in Add Loan "+e);
		}
		
		return status;
	}

	@Override
	public List<Loan> showAll() {
		List<Loan> loan_list=new ArrayList<Loan>();
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from loan");
			while(rs.next())
			{
				Loan l=new Loan();
				l.setLoadId(rs.getInt(1));
				l.setAccountNumber(rs.getLong(2));
				l.setCustomer_name(rs.getString(3));
				l.setEmiAmount(rs.getDouble(4));
				l.setInterestRate(rs.getDouble(5));
				l.setLoanAmount(rs.getDouble(6));
				l.setNoOfYears(rs.getInt(7));
				l.setSanctionDate(rs.getDate(8));
				loan_list.add(l);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return loan_list;
	}

	@Override
	public Loan showByLoanId(int loanid) {
		Loan l=null;
		try {
			PreparedStatement st=con.prepareStatement("select * from loan where loan_id=?");
			st.setInt(1, loanid);
			ResultSet rs=st.executeQuery();
			
			if(rs.next())
			{				
				l=new Loan();
				l.setLoadId(rs.getInt(1));
				l.setAccountNumber(rs.getLong(2));
				l.setCustomer_name(rs.getString(3));
				l.setEmiAmount(rs.getDouble(4));
				l.setInterestRate(rs.getDouble(5));
				l.setLoanAmount(rs.getDouble(6));
				l.setNoOfYears(rs.getInt(7));
				l.setSanctionDate(rs.getDate(8));			
				System.out.println(l);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return l;
	}

}
