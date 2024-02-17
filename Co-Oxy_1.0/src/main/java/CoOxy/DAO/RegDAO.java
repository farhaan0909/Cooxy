package CoOxy.DAO;

import CoOxy.DB.DBConnection;
import CoOxy.DTO.RegDTO;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

	public class RegDAO {	
	static	Connection con=null;
	
	int uniq=1;
	//----check duplicat user name start
			public int uniquser(RegDTO r1){
					try{
							String ch_user="select * from registration where Cunm=?";
							con=DBConnection.getConn();
							PreparedStatement ps1=con.prepareStatement(ch_user);
											  ps1.setString(1, r1.getUnm());
							ResultSet rs1=ps1.executeQuery();
							if(rs1.next())
							{//----check duplicat user name
								if(rs1.getString(7).equals(r1.getUnm())){
									//System.out.println("match "+rs1.getString(7)+" == "+r1.getUnm());
									uniq=0;
								}else{
									//System.out.println("not match "+rs1.getString(7)+" == "+r1.getUnm());
									uniq=1;
									}
							}
						}catch(Exception ee) {System.out.println(ee+" DAO Registration uniq erorr---");}
				return uniq;
			}
	/*---start new user Register function*/
		public int insert(RegDTO r1) {
		 int x=0;
		 if(uniq==1){
			 	try{//start new user Register function
		 
				String Nreg="insert into registration(Cname,Cmob,Cemail,Cgender,Cadd,Cunm,Cpwd)"+" values(?,?,?,?,?,?,?)";
				
				con=DBConnection.getConn();
				PreparedStatement ps=con.prepareStatement(Nreg);
				ps.setString(1, r1.getName());
				ps.setString(2, r1.getMob());
				ps.setString(3, r1.getEmail());
				ps.setString(4, r1.getGender());
				ps.setString(5, r1.getAdd());
				ps.setString(6, r1.getUnm());
				ps.setString(7, r1.getPwd());
					x=ps.executeUpdate();
			 		}catch(Exception ee) {System.out.println(ee+" DAO new Registration if erorr---");}
		 	}else{x=2; 	
		 		//System.out.println(" DAO new Registration else( Username already exists )");
		 	}
		  return x;
		}
		
	/*--- End new user Register function*/
		
		/*--- Start login & check data from user function*/
		public int check(RegDTO r1){
			
		  int y=0;
			try{
				String log="select * from registration where Cunm=? and Cpwd=?";
				
				con=DBConnection.getConn();
				PreparedStatement ps1=con.prepareStatement(log);
				ps1.setString(1, r1.getUnm());
				ps1.setString(2, r1.getPwd());
				
				ResultSet rs1=ps1.executeQuery();
				if(rs1.next())
				{	
					if(rs1.getInt(12)==4)
					{
						y=4;
					}else{
						y=1;
					  }	
				}
			}catch(Exception ee) {System.out.println(ee+" DAO login erorr---");}
		return y;
		
		}
	/*---End login & check data from user function*/
		
		/*-- Start note code*/
		public RegDTO notice(RegDTO n1){
		 RegDTO n=new RegDTO();
			try{
				String sql="select * from aquery where Qid=1";
				con=DBConnection.getConn();
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				
				if(rs.next()){
					n.setAnote(rs.getString(3));
				}
				else {n.setAnote(rs.getString(3));}
			}catch(Exception ee){System.out.println(ee+" note erorr");}
		return n;
		}
		/*-- end note code*/
		
		/*---Start Search data from user function*/
		public RegDTO serme(RegDTO r1){
			RegDTO k1=new RegDTO();
			try{
				String ser="select * from registration where Cunm=?";
				con=DBConnection.getConn();
				PreparedStatement ps=con.prepareStatement(ser);
				ps.setString(1, r1.getUnm());
				ResultSet rs=ps.executeQuery();
				
				if(rs.next()){
					k1.setCid(rs.getInt(1));
					k1.setName(rs.getString(2));
					k1.setMob(rs.getString(3));
					k1.setEmail(rs.getString(4));
					k1.setGender(rs.getString(5));
					k1.setAdd(rs.getString(6));
					k1.setUnm(rs.getString(7));
					k1.setFname(rs.getString(9));	
				}
				else{
					k1=null;
				}
			}catch(Exception ee) {System.out.println(ee+" DAO sere erorr--");}
		return k1;
		}
	/*---End Search data from user function*/
		
		/*---Start update data from user function*/
		public int update(RegDTO u1){
		 int u=0;
		  try{
			  String update="update registration set Cname=?,Cmob=?,Cemail=?,Cgender=?,Cadd=? where Cunm=?";
			  con=DBConnection.getConn();
			  PreparedStatement ps=con.prepareStatement(update);
			  
			    ps.setString(1, u1.getName());
				ps.setString(2, u1.getMob());
				ps.setString(3, u1.getEmail());
				ps.setString(4, u1.getGender());
				ps.setString(5, u1.getAdd());
				ps.setString(6, u1.getUnm());
				u=ps.executeUpdate();
				
		  }catch(Exception ee) {System.out.println(ee+" : update Dao erorr");}		
		return u;
		}		
	/*---end update data from user function*/
	
		/*--Start profile image upload-------*/
		public int uploadFile(String unm ,String fname , String fpath , InputStream in){
		 int save=0;
			try {
				String sql="update registration set Fname=?,Fpath=?,Fimg=? where Cunm=? ";
				con=DBConnection.getConn();
				PreparedStatement ps=con.prepareStatement(sql);
				try{
					ps.setString(4, unm);
					ps.setString(1, fname);
					ps.setString(2, fpath);
						if(in != null)
						{
							ps.setBlob(3, in);
							save=ps.executeUpdate();
						}
				}catch(Exception ee) {System.out.println(ee+" DAO upload file erorr---");}
			}catch(Exception ee) {System.out.println(ee+" : DAO profile image erorr---");}
		return save;
		}
	/*--End profile image upload-------*/
		
	/*--Start Query submit function*/
	public int qsend(RegDTO q1){	
	  int qr=0;
		try {
			String Qdata="insert into query(qno,qname,qmob,qtype,qwrite)"+" values(?,?,?,?,?)";
			
			con=DBConnection.getConn();
			PreparedStatement ps=con.prepareStatement(Qdata);
			ps.setString(1, q1.getQno());
			ps.setString(2, q1.getName());
			ps.setString(3, q1.getMob());
			ps.setString(4, q1.getQt());
			ps.setString(5, q1.getQw());
			qr=ps.executeUpdate();
			
		}catch(Exception ee) {System.out.println(ee+" DAO Query send erorr---");}
	return qr;
	}
	
	// qurey reply
	public RegDTO answ(RegDTO q1){
		 RegDTO an=new RegDTO();
			try{
				String sql="select * from aquery where Qid=1";
				con=DBConnection.getConn();
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				
				if(rs.next()){
					an.setQans(rs.getString(2));
				}
				else {an.setQans(rs.getString(2));}
			}catch(Exception ee){System.out.println(ee+" Qurey reply erorr");}
		return an;
		}
	/*---Start Query submit function*/
	
	/*---Start feedback submit function*/
	public int fsend(RegDTO f1){
	  int fe=0;
		try{
			String fdata="insert into feed(fno,fname,fmob,ftype,fwrite) "+" values(?,?,?,?,?)";
			
			con=DBConnection.getConn();
			PreparedStatement ps=con.prepareStatement(fdata);
			ps.setString(1, f1.getFno());
			ps.setString(2, f1.getName());
			ps.setString(3, f1.getMob());
			ps.setString(4, f1.getFt());
			ps.setString(5, f1.getFd());
			
			fe=ps.executeUpdate();
		}catch(Exception ee) {System.out.println(ee+ " DAO Feed send erorr---");}
	return fe;
	}	
	/*---End feedback submit function*/
	
	/*================================ Admin Methods===================*/
	
	/*---Start Search data from Admin function*/
	public RegDTO search(RegDTO r1){
		RegDTO z=new RegDTO();
		try {
			String ser="select * from registration where Cid=?";
			con=DBConnection.getConn();
			PreparedStatement ps= con.prepareStatement(ser);
			ps.setInt(1, r1.getUid());
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				//z.setUid(rs.getInt(1));
				z.setName(rs.getString(2));
				z.setMob(rs.getString(3));
				z.setEmail(rs.getString(4));
				z.setGender(rs.getString(5));
				z.setAdd(rs.getString(6));
				z.setUnm(rs.getString(7));
			}
			else{
				z=null;
			}
		}catch(Exception ee) {System.out.println(ee+" DAO search erorr---");}
	return z;
	}
	/*---End Search data from Admin function*/
	
	/*---Start Admin feed ---*/
	
	public RegDTO feed(RegDTO f1){
	  RegDTO f=new RegDTO();
		try{
			String fd="select * from feed where fid=?";
			con=DBConnection.getConn();
			PreparedStatement ps=con.prepareStatement(fd);
			ps.setInt(1, f1.getFid());
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){	
				f.setFid(rs.getInt(1));
				f.setFno(rs.getString(2));
				f.setFnm(rs.getString(3));
				f.setFmob(rs.getString(4));
				f.setFt(rs.getString(5));
				f.setFd(rs.getString(6));
			}
			else{	
				f=null;
			}
		}catch(Exception ee) {System.out.println(ee+" DAO Admin feed erorr--");}
	return f;
	}
	/*---End Admin feed ---*/
	
	/*----Start Admin Query */
	public RegDTO aquery(RegDTO q1){
	 RegDTO q=new RegDTO();
	 try{
		 String qury="select * from query where qid=?";
		 con=DBConnection.getConn();
		 PreparedStatement ps=con.prepareStatement(qury);
		 ps.setInt(1, q1.getQid());
		 ResultSet rs=ps.executeQuery();
		 
		 if(rs.next()){
			 q.setQid(rs.getInt(1));
			 q.setQno(rs.getString(2));
			 q.setName(rs.getString(3));
			 q.setMob(rs.getString(4));
			 q.setQt(rs.getString(5));
			 q.setQw(rs.getString(6));	 
		 }
		 else{
			 q=null;
		 }
	 }catch(Exception ee) {System.out.println(ee+" : dao admin reorr");}	
	return q;	
	}
	/*----end Admin Query */
}
