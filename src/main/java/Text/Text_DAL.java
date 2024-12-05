package Text;

import DAO.Model.Organization;
import DAO.MySQLDAL.DAL;
import DAO.MySQLDAL.OrganizationDAL;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Text_DAL {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //Organization organization = new Organization("2","1","1","1","1","1");
        OrganizationDAL organizationDAL = new OrganizationDAL();
        String strWhere = " ";
        List<Organization> organizationList = organizationDAL.QueryModelList(strWhere);
        System.out.println(organizationList);
    }
}