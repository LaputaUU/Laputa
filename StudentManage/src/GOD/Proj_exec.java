package GOD;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Proj_exec {

	public boolean login(Proj_admin_data pad)
	{
		Proj_print print = new Proj_print();
		print.printlogin();
		String admname,admpassword;
		Scanner sc = new Scanner(System.in); 
		System.out.print("��ѡ���������֣�");
		if(sc.next().equals("1"))
		{
			System.out.print("�������û�����");
			admname = sc.next();
			System.out.print("���������룺");
			admpassword = sc.next();
		} else {
			return false;
		}
		if(pad.isright(admname, admpassword))
		{
			return true;
		}
		else
		{
			while(!pad.isright(admname, admpassword))
			{
				System.out.print("�û���������������������룺");
				System.out.println();
				System.out.print("�������û�����");
				admname = sc.next();
				System.out.println();
				System.out.print("���������룺");
				admpassword = sc.next();
			}
		}
		return true;	
	}
	
	public void lookover(ArrayList<Proj_student_data> list)
	{
		Iterator<Proj_student_data> it=list.iterator();
		while(it.hasNext())
		{
			it.next().print();
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("������0������һ�˵�-->:");
		while(!sc.next().equals("0"))
		{
			System.out.print("������0������һ�˵�-->:");
		}
	}
	
	public void printchooselist()
	{
		Proj_print print = new Proj_print();
		print.printchooselist();
	}
	
	public void addstuinfo(ArrayList<Proj_student_data> list)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ѧ��:");
		String stu_number = sc.next();
		System.out.print("����������:");
		String stu_name = sc.next();
		System.out.print("����������:");
		String stu_age = sc.next();
		System.out.print("������ְ��:");
		String stu_post = sc.next();
		System.out.println();
		Proj_student_data p = new Proj_student_data(stu_number, stu_name, stu_age, stu_post);
		list.add(p);
	}
	
	public void modifystuinfo(ArrayList<Proj_student_data> list)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������Ҫ�޸ĵ�ѧ��ѧ��:");
		while(sc.hasNext())
		{
			Iterator<Proj_student_data> it=list.iterator();
			String stu_number = sc.next();
			boolean flag = false;
			while(it.hasNext())
			{
				Proj_student_data p = it.next();
				if(p.getStuNumber().equals(stu_number))
				{
					flag = true;
					System.out.print("������������:");
					p.setStuName(sc.next());
					System.out.print("������������:");
					p.setStuAge(sc.next());
					System.out.print("��������ְ��:");
					p.setStuPost(sc.next());
					break;
				}
			}
			if(flag)
				break;
			else
			{
				System.out.print("���޴��ˣ�����������Ҫ�޸ĵ�ѧ��ѧ��:");
			}
			
		}
		System.out.println();
	}
	
	public void searchstuinfo(ArrayList<Proj_student_data> list)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������Ҫ��ѯ��ѧ��ѧ��:");
		while(sc.hasNext())
		{
			Iterator<Proj_student_data> it=list.iterator();
			String stu_number = sc.next();
			boolean flag = false;
			while(it.hasNext())
			{
				Proj_student_data p = it.next();
				if(p.getStuNumber().equals(stu_number))
				{
					flag = true;
					System.out.println("��Ҫ��ѯ��ѧ����Ϣ��:");
					p.print();
					break;
				}
			}
			if(flag)
				break;
			else
			{
				System.out.print("���޴��ˣ�����������Ҫ��ѯ��ѧ��ѧ��:");
			}
			
		}
		System.out.print("������0������һ�˵�-->:");
		while(!sc.next().equals("0"))
		{
			System.out.print("������0������һ�˵�-->:");
		}
	}
	
	public void delstuinfo(ArrayList<Proj_student_data> list)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������Ҫɾ����ѧ��ѧ��:");
		while(sc.hasNext())
		{
			Iterator<Proj_student_data> it=list.iterator();
			String stu_number = sc.next();
			boolean flag = false;
			while(it.hasNext())
			{
				int i = 0;
				Proj_student_data p = it.next();
				if(p.getStuNumber().equals(stu_number))
				{
					flag = true;
					list.remove(i);
					break;
				}
			}
			if(flag)
				break;
			else
			{
				System.out.print("���޴��ˣ�����������Ҫɾ����ѧ��ѧ��:");
			}
			
		}
		System.out.println();
	}
	
	
}
