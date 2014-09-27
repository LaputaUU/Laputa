package GOD;

public class Proj_student_data {
	
	private String stu_number;
	private String stu_name;
	private String stu_age;
	private String stu_post;
	
	Proj_student_data(String stu_number,String stu_name,String stu_age,String stu_post)
	{
		this.stu_number = stu_number;
		this.stu_name = stu_name;
		this.stu_age = stu_age;
		this.stu_post = stu_post;
	}
	
	public void print()
	{
		System.out.println("学号："+this.stu_number+"       姓名："+this.stu_name+"       年龄："+this.stu_age+"       职位："+this.stu_post);
	}
	
	public void setStuNumber(String number)
	{
		this.stu_number = number;
	}
	
	public String getStuNumber()
	{
		return stu_number;
	}
	
	public void setStuName(String name)
	{
		this.stu_name = name;
	}
	
	public String getStuName()
	{
		return stu_name;
	}
	
	public void setStuAge(String age)
	{
		this.stu_age = age;
	}
	
	public String getStuAge()
	{
		return stu_age;
	}
	
	public void setStuPost(String post)
	{
		this.stu_post = post;
	}
	
	public String getStuPost()
	{
		return stu_post;
	}

}
