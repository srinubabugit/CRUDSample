package com.palle;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A
{
	
		private static final String url ="jdbc:mysql://localhost:3306/palle";
		private static Connection con = null;
		private static java.sql.Statement  s= null;
	    private static PreparedStatement ps = null;
		private static ResultSet rs = null;
		

		
			

		
		public void creating()
		
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				con=DriverManager.getConnection(url,"root","srinu");
				
				s=con.createStatement();
				
				s.executeUpdate("create table employee(eno int primary key,ename varchar(30),esal int)");
						
				
				
				
			}
			catch (ClassNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			finally 
			{
				try {
					if(s!=null)
					{
					s.close();
				} 
					if(con!=null)
					{
						con.close();
					}
				}catch (SQLException e) {
					
					e.printStackTrace();
				}
				}
				
			
			
			
		}
		public void inserting(int num,String name,int salary)
		
		
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				con=DriverManager.getConnection(url,"root","srinu");
				
				ps=con.prepareStatement("insert into employee(eno,ename,esal) values(?,?,?)");
				
				ps.setInt(1,num);
				ps.setString(2, name);
				ps.setInt(3, salary);
				
				ps.executeUpdate();
				
				
			}
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			finally 
			{
				try {
					if(ps!=null)
					{
					ps.close();
				} 
					if(con!=null)
					{
						con.close();
					}
				}catch (SQLException e) {
					
					e.printStackTrace();
				}
				}
				
				
				
			}
			
			
		
	 public void updating(int eno, String name,int Salary)
		
		
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				con=DriverManager.getConnection(url,"root","srinu");
				
				ps=con.prepareStatement("update employee set esal=? where ename=?");
				
				ps.setString(2, name);
				ps.setInt(1,Salary);
				
				ps.executeUpdate();
				
				
			}
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			finally 
			{
				try {
					if(ps!=null)
					{
					ps.close();
				} 
					if(con!=null)
					{
						con.close();
					}
				}catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				
					}
				
				
				
			

	   public void deleting(int d)
		
		
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				con=DriverManager.getConnection(url,"root","srinu");
				
				ps=con.prepareStatement("delete from employee  where eno =?");
				
				ps.setInt(1,d);
				
				
				ps.executeUpdate();
				
				
			}
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			finally 
			{
				try {
					if(ps!=null)
					{
					ps.close();
				} 
					if(con!=null)
					{
						con.close();
					}
				}catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				
			}
	   public void exit()
	   {
		   System.exit(0);
	   }

}
