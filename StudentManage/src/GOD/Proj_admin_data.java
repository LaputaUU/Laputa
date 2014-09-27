package GOD;

public class Proj_admin_data {

	private String adm_name;
	private String adm_password;
	
	Proj_admin_data(String adm_name,String adm_password)
	{
		this.adm_name = adm_name;
		this.adm_password = adm_password;
	}
	
	public boolean isright(String adm_name,String adm_password)
	{
		if(this.adm_name.equals(adm_name)&&this.adm_password.equals(adm_password))
			return true;
		else
			return false;
	}
	
	public void setAdmName(String name)
	{
		this.adm_name = name;
	}
	
	public String getAdmName()
	{
		return adm_name;
	}
	
	public void setAdmPassWord(String password)
	{
		this.adm_password = password;
	}
	
	public String getAdmPassWord()
	{
		return adm_password;
	}
}
