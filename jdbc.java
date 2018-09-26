public static void main(String[] args){
 String url = "jdbc:mysql://localhost:3306/demo";
 String user = "root";
 String password= "30091997";
  try {
    // get connection
    Connection myconn = DriverManager.getConnection(url,user,password);
    // create statement
    Statement st1 = myconn.createStatement();
    // execute sql query
    String sql = "insert into employees"+"(last_name,first_name,email)"+"values('brown','david',brown@gmaiil.com)";
    st1.executeUpdate(sql);
    System.out.println("insertion completed");


  }

}