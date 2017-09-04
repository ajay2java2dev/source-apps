package io.developer.contacts.sp;

import io.developer.contacts.vo.Employee;
import org.apache.ibatis.io.Resources;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by AjayMenon on 6/3/2017.
 */
public class EmployeeDetailsSP {

    private List<Employee> getEmployeeDetails(final String employeeId) throws IOException, SQLException{
        if (!StringUtils.isEmpty(employeeId)) {

            /*Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
            SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

            int id = 1;
            System.out.println("Going to read employee name.....");
            Employee e = (Employee) smc.queryForObject ("Employee.getEmpInfo", id);

            System.out.println("First Name:  " + e.getFirstName());
            System.out.println("Record name Successfully ");
            */
        }
        return null;
    }

    public static void main(String[] args) {
        EmployeeDetailsSP detailsSP = new EmployeeDetailsSP();
        try {
            detailsSP.getEmployeeDetails("2");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
