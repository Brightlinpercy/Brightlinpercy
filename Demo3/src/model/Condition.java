package model;

public class Condition {
String loginname;
String password;
public String getLoginname() {
	return loginname;
}
public void setLoginname(String loginname) {
	this.loginname = loginname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public boolean check()
{
	if(loginname.equals("percy")&&password.equals("1234"))
	{
		return true;
}
else
{
	return false;
}
}}
