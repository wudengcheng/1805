package com.es.sys.pojo;

public class AdminRoles {
    private Integer id;

    private Integer adminId;

    private Integer departmentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

	@Override
	public String toString() {
		return "AdminRoles [id=" + id + ", adminId=" + adminId + ", departmentId=" + departmentId + ", getId()="
				+ getId() + ", getAdminId()=" + getAdminId() + ", getDepartmentId()=" + getDepartmentId()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
    
}