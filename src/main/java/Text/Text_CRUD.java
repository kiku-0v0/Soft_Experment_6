package Text;

import DAO.Model.Organization;
import DAO.Model.User;
import DAO.MySQLDAL.DAL;
import Service.TreeService;
import com.sun.source.tree.Tree;

import java.sql.SQLException;
import java.util.List;
/*
测试Service的功能
 */
public class Text_CRUD {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        TreeService treeService = new TreeService();
        Organization neworganization = new Organization("01040304","嵌入式工程师","|1391||4936||7814||3010|","010403","嵌入式工程师兼经理","1234123-124889sdka-32132");

        treeService.addOrganization(neworganization);
        System.out.println(treeService.getOrganizationByID("01040304"));

        neworganization.setfRemark("嵌入式工程师");
        treeService.UpdateOrganization(neworganization);
        System.out.println(treeService.getOrganizationByID("01040304"));

        treeService.deleteOrganization(neworganization);
        System.out.println(treeService.getOrganizationByID("01040304"));

        User newUser = new User("261","|01||01020205|","2131224-sadjnnv-3213","202225220699","e10adc3949ba59abbe56e057f20f883e","22统计R1");
        treeService.addUser(newUser);
        System.out.println(treeService.getUserByID("261"));

        newUser.setfRemark("22软工6班");
        treeService.updateUser(newUser);
        System.out.println(treeService.getUserByID("261"));

        treeService.deleteUser(newUser);
        System.out.println(treeService.getUserByID("261"));


    }
}