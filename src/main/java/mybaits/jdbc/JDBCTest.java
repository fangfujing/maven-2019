package mybaits.jdbc;

import oracle.jdbc.OracleDriver;

import java.sql.*;

public class JDBCTest {

    public static void main(String[] args) {
        //oracleTest();
        Connection connection = null;
        PreparedStatement ps = null;

        //连接
        try {

            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fang", "root", "123");

            connection.setAutoCommit(false);
            ps = connection.prepareStatement("insert into ims_test (id, name) values (?, ?)");

            ps.setInt(1, 4);
            ps.setString(2, "admin4");

            boolean execute = ps.execute();
            System.out.println(execute);
            System.out.println(connection);
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    private static void oracleTest() {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
//            Class.forName("oracle.jdbc.OracleDriver");
            OracleDriver oracleDriver = new OracleDriver();
            connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE",
                    "weblogic", "weblogic1");
            //query
            ps = connection.prepareStatement("select * from menu where id = ?");
            ps.setString(1, "1234");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3)+rs.getInt(4));
            }


            //insert
//            connection.setAutoCommit(false);
//            String sql = "insert into t_stu values (?)";
//            ps = connection.prepareStatement(sql);
//            ps.setString(1, null);
//            System.out.println(ps.executeUpdate());

//            connection.setAutoCommit(false);
//            String sql = "insert into menu (id,parent_id, name, depth) values (?,?,?,?)";
//            ps = connection.prepareStatement(sql);
//            ps.setString(1, "324");
//            ps.setString(2, "2323");
//            ps.setString(3, "ffjj");
//            ps.setInt(4, 10);
//            Date date = new Date(System.currentTimeMillis());
//            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//            ps.setTimestamp(2, timestamp);
            System.out.println(ps.executeUpdate());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(null != ps){
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(null != connection){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
