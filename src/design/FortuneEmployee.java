package design;

public class FortuneEmployee extends EmployeeInfo{

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

		EmployeeInfo einfo1 = new EmployeeInfo();

		EmployeeInfo einfo2   = new EmployeeInfo(101);
		einfo2.AllDepart();
		einfo2.assignDepartment();
		einfo2.calculateSalary();
		einfo2.calculateEmployeeBonus(2);
		einfo2.calculateEmployeePension();

		EmployeeInfo einfo3    = new EmployeeInfo("Siddique",102);



	}

}