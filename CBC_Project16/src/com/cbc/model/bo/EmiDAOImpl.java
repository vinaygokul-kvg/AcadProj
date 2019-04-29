package com.cbc.model.bo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cbc.connection.ConnectionFactory;
import com.cbc.model.pojo.Emi;;

	public class EmiDAOImpl implements EmiDAO {

		Connection con=null;
		public EmiDAOImpl() {
			con=ConnectionFactory.openConn();
		}
		@Override
		public int saveForm(Emi fm) {
			int status=0;
			try {
				PreparedStatement ps=con.prepareStatement("insert into emi values(?,?,?)");
				ps.setInt(1, fm.getLoanId());
				ps.setDate(2, new Date(fm.getDueDate().getTime()));
				ps.setDate(3, new Date(fm.getPaidDate().getTime()));
				
				status=ps.executeUpdate();
			}catch (Exception e) {
				System.out.println("Error in Insert form "+e);
			}
			return status;
		}
		@Override
		public java.sql.Date calculateDueDate(int loanid) {
			
			Date d=null;
			try {
				PreparedStatement ps=con.prepareStatement("select sanction_date from loan where loan_id=?");
				ps.setInt(1, loanid);
				ResultSet rs=ps.executeQuery();
				if(rs.next())
				{
					d=rs.getDate(1);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			return d;
		}
}
