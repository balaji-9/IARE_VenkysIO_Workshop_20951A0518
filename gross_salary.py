Gross_salary = float(input("Enter Gross Salary:"))
Federal_Deduction = float(input("Enter Federal Deduction:"))
State_Deduction = float(input("Enter state Deduction:"))
Pension_Plan = float(input("Enter Pension Plan:"))
No_of_weeks = int(input("Enter no of weeks:"))
Total_Deductions = (Federal_Deduction+State_Deduction+Pension_Plan)*Gross_salary/100
print("Gross salary for",No_of_weeks,"Weeks:",(Gross_salary-Total_Deductions)*No_of_weeks)