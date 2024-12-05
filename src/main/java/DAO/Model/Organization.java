package DAO.Model;

import java.lang.invoke.CallSite;
import java.util.List;

/*
表记录的具体实现类,机构类，对应表t_organization中的一条记录
 */
public class Organization{
    private String fID;
    private String fName;
    private String fPermission;//权限字段
    private String fHigherUpfIDs;//上级机构
    private String fRemark;
    private String fOrgGUID;

    private List<Organization> ChildOrganization;//存放机构的下属机构,用来实现树形结构

    private List<User> ChildUser;//存放该机构的下属成员

    public Organization(String fID, String fName, String fPermission, String fHigherUpfIDs, String fRemark, String fOrgGUID) {
        this.fID = fID;
        this.fName = fName;
        this.fPermission = fPermission;
        this.fHigherUpfIDs = fHigherUpfIDs;
        this.fRemark = fRemark;
        this.fOrgGUID = fOrgGUID;
    }

    public Organization(String fID, String fName, String fPermission, String fHigherUpfIDs, String fRemark, String fOrgGUID, List<Organization> childOrganization, List<User> childUser) {
        this.fID = fID;
        this.fName = fName;
        this.fPermission = fPermission;
        this.fHigherUpfIDs = fHigherUpfIDs;
        this.fRemark = fRemark;
        this.fOrgGUID = fOrgGUID;
        ChildOrganization = childOrganization;
        ChildUser = childUser;
    }

    public String getfID() {
        return fID;
    }

    public void setfID(String fID) {
        this.fID = fID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfPermission() {
        return fPermission;
    }

    public void setfPermission(String fPermission) {
        this.fPermission = fPermission;
    }

    public String getfHigherUpfIDs() {
        return fHigherUpfIDs;
    }

    public void setfHigherUpfIDs(String fHigherUpfIDs) {
        this.fHigherUpfIDs = fHigherUpfIDs;
    }

    public String getfRemark() {
        return fRemark;
    }

    public void setfRemark(String fRemark) {
        this.fRemark = fRemark;
    }

    public String getfOrgGUID() {
        return fOrgGUID;
    }

    public void setfOrgGUID(String fOrgGUID) {
        this.fOrgGUID = fOrgGUID;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "fID='" + fID + '\'' +
                ", fName='" + fName + '\'' +
                ", fHigherUpIDs='" + fHigherUpfIDs + '\'' +
                ", fPermission='" + fPermission + '\'' +
                ", fRemark='" + fRemark + '\'' +
                ", fOrgGUID='" + fOrgGUID + '\'' +
                '}';
    }

    public void addOrg(Organization org) {
        ChildOrganization.add(org);
    }
}
