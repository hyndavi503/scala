package MicroService.MicroServiceBackend.Service;

import MicroService.MicroServiceBackend.Model.Student;

public class StudentService 
{

	Student s=new Student();

	
	public void getDetails()
	{
		s.setSid(21);
		s.setSname("hyndavi");
		s.setAge(21);
		s.setCollege("kits");
		System.out.println(s.getSid() + " " + s.getSname() + " " + s.getAge() + " " + s.getCollege());
	}
}
