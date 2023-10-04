package com.oracle.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
import java.util.UUID;

import com.oracle.entity.Customer;
import com.oracle.repository.DBConnection;

public class CustomerDaoImp implements CustomerDao{
	public Optional<Customer> findById(String id){
		Connection con=	DBConnection.connect();
		String sql="select * from customer where customer_ID=?";
		try {
			//Connection con=	DBConnection.connect();
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1,id);
			ResultSet rss=pstmt.executeQuery(sql);
			if(rss.next())
			{
			System.out.print("id:  "+rss.getInt("custId")+" , ");
			System.out.print("name:  "+rss.getString("custName")+" , ");
			System.out.print("loc:  "+rss.getString("Address"));
			}
			else
				System.out.println("Record not found");

				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Record not found");
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
		return ;
		
	}}}}
	


