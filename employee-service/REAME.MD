
NAME OF SERVICE : EMPLOYEE-SERVICE

PORT NUMBER     : 6001



THE FOLLOWING ENDS POINT OF EMPLOYEE
---------------------------------------------

1.

METHOD NAME: POST

URL        : http://localhost:6001/employee/save

PURPOSE    : To store the employee details

BODY      :

{
"employeeId":1001,
"employeeName":"RAJU",
"employeeEmail":"RAJU@GMAIL.COM",
"departmentId":1
}
----------------------------------------------------------
2.
METHOD NAME: GET

URL        : http://localhost:6002/employee/1001

PURPOSE    : To fetch the employee + department details employee id

----------------------------------------------------------------------
The following is the table of department service


