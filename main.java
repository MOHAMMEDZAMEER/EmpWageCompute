package com.bridegelabz;

class Main_class_emp_wage {
   public static void main(String[] args) {
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM.\n");
      EmpWageProblem obj = new EmpWageProblem();

      
      //calling company 1

      obj.computation_of_emp_wage("BridgeLabz" , 22 , 80 , 50);

		// calling company-2

      obj.computation_of_emp_wage("Tech-Mahindra" , 21 , 100 , 30);

		// calling  company-3

      obj.computation_of_emp_wage("Infosys" , 25 , 70 , 60);
   }
}