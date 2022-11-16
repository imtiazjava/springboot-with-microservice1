
NAME OF SERVICE : DEPARTMENT-SERVICE

PORT NUMBER     : 6002



THEY ARE FOLLOWING ENDS POINT OF DEPARTMENT
---------------------------------------------

1.

METHOD NAME: POST

URL        : http://localhost:6002/department/save

PURPOSE    : To store the department details

BODY      :

{
"departmentId":1,
"departmentName":"HR",
"departmentLocation":"HYD"
}
----------------------------------------------------------
2.
METHOD NAME: GET

URL        : http://localhost:6002/department/1

PURPOSE    : To fetch the departmenet details based on department id

----------------------------------------------------------------------
The following is the table of department service

mysql> SELECT * FROM DEPARTMENT;

+---------------+---------------------+-----------------+
| department_id | department_location | department_name |
+---------------+---------------------+-----------------+
|             1 | HYD                 | HR              |
|             2 | HYD                 | OPERATION       |
|             3 | SEC                 | TECH            |
+---------------+---------------------+-----------------+


