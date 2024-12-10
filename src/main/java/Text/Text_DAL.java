package Text;

import DAO.Model.Organization;
import DAO.MySQLDAL.DAL;
import DAO.MySQLDAL.OrganizationDAL;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/*
测试DAL的功能，strwhere是SQL语句中的条件语句
 */
public class Text_DAL {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //Organization organization = new Organization("2","1","1","1","1","1");
        OrganizationDAL organizationDAL = new OrganizationDAL();
        String strWhere = "WHERE fID LIKE '0101%'";
        List<Organization> organizationList = organizationDAL.QueryModelList(strWhere);
        for(Organization organization : organizationList){
            System.out.println(organization);
        }
    }
}