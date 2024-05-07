/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhom08.bookstore.DAO;

import com.nhom08.bookstore.Models.BookModel;
import com.nhom08.bookstore.Models.IReceiptDetailsModel;
import com.nhom08.bookstore.Models.IReceiptModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quythuong
 */
public class IReceiptDAO {
	private Connection con = null;
	public IReceiptDAO() {
		con = (new DBConnection()).GetDBConnection();
	}
	public List<IReceiptModel> getAll() {
		List<IReceiptModel> iReceiptList = new ArrayList<>();
		PreparedStatement statement = null;
		ResultSet rs = null;
		try {
			statement = con.prepareStatement("select * from PhieuNhap");
			rs = statement.executeQuery();
			while(rs.next()) {
				IReceiptModel iReceipt = new IReceiptModel();
				
				iReceipt.setId(rs.getString(1));
				iReceipt.setPublisherId(rs.getString(2));
				iReceipt.setDate(rs.getDate(3));
				
				iReceiptList.add(iReceipt);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return iReceiptList;
	}
	public boolean save(IReceiptModel iReceipt) throws SQLException {
		PreparedStatement st = null;
		
		try {
        
            String sql = "insert into PhieuNhap(MaPhieuNhap, MaNXB, NgayNhap) values(?, ?, ?);";	
		st = con.prepareStatement(sql);
		st.setString(1, iReceipt.getId());
		st.setString(2, iReceipt.getPublisherId());
		st.setDate(3, iReceipt.getDate());
            } catch(SQLException e) {
		    e.printStackTrace();
	    }
		return st.execute();
	}
	public boolean update(IReceiptModel iReceipt) throws SQLException {
		PreparedStatement st = null;
		
		try {
        
            String sql = "update PhieuNhap set MaNXB=?, NgayNhap=? where MaPhieuNhap=?;";	
		st = con.prepareStatement(sql);
		st.setString(3, iReceipt.getId());
		st.setString(1, iReceipt.getPublisherId());
		st.setDate(2, iReceipt.getDate());
            } catch(SQLException e) {
		    e.printStackTrace();
	    }
		return st.execute();
	}
	public boolean delete(String Id) throws SQLException {
		PreparedStatement st = null;
		
		try {
        
            String sql = "delete from PhieuNhap where MaPhieuNhap=?;";	
		st = con.prepareStatement(sql);
		st.setString(1, Id);
            } catch(SQLException e) {
		    e.printStackTrace();
	    }
		return st.execute();
	}
}
