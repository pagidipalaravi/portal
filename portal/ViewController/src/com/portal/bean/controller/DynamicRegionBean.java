package com.portal.bean.controller;

import javax.faces.event.ActionEvent;

import oracle.adf.controller.TaskFlowId;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;
import oracle.adf.view.rich.component.rich.nav.RichCommandImageLink;

public class DynamicRegionBean {
    private RichRegion dynamicRichRegion;
    private String taskFlowId;
    private String emptyTaskFlowId =      "/taskflows/emptyTF.xml#emptyTF";
    private String employeesTaskFlowId =  "/taskflows/employeesTF.xml#employeesTF";
    private String departmentTaskFlowId = "/taskflows/departmentsTF.xml#departmentsTF";
    private String locationsTaskFlowId =  "/taskflows/locationsTF.xml#locationsTF";
    private String taskFlowId1 = "/taskflows/emptyTF.xml#emptyTF";

    public DynamicRegionBean() {
        super();
        System.out.println(" inside DynamicRegionBean Constructor");
        setTaskFlowId(emptyTaskFlowId);
    }
    public void loadRegion(ActionEvent actionEvent){
        RichCommandImageLink cil = (RichCommandImageLink)actionEvent.getComponent();
        try{
        String cilId = cil.getId();
        if("employees".equals(cilId)){
            setTaskFlowId(employeesTaskFlowId);
                //setDynamicRichRegion()
            }
        
        else if("departments".equals(cilId)){
            setTaskFlowId(departmentTaskFlowId);
                //setDynamicRichRegion()
            }
        else if("locations".equals(cilId)){
            setTaskFlowId(locationsTaskFlowId);
                //setDynamicRichRegion()
            }
        }catch(Exception e){
        System.out.println("in side catch");
        e.printStackTrace();
        }
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
        
    }

    public void setDynamicRichRegion(RichRegion dynamicRichRegion) {
        this.dynamicRichRegion = dynamicRichRegion;
    }

    public RichRegion getDynamicRichRegion() {
        return dynamicRichRegion;
    }

    public void setTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public String getTaskFlowId() {
        return taskFlowId;
    }

    public void setEmployeesTaskFlowId(String employeesTaskFlowId) {
        this.employeesTaskFlowId = employeesTaskFlowId;
    }

    public String getEmployeesTaskFlowId() {
        return employeesTaskFlowId;
    }

    public void setDepartmentTaskFlowId(String departmentTaskFlowId) {
        this.departmentTaskFlowId = departmentTaskFlowId;
    }

    public String getDepartmentTaskFlowId() {
        return departmentTaskFlowId;
    }

    public void setEmptyTaskFlowId(String emptyTaskFlowId) {
        this.emptyTaskFlowId = emptyTaskFlowId;
    }

    public String getEmptyTaskFlowId() {
        return emptyTaskFlowId;
    }

    public void setLocationsTaskFlowId(String locationsTaskFlowId) {
        this.locationsTaskFlowId = locationsTaskFlowId;
    }

    public String getLocationsTaskFlowId() {
        return locationsTaskFlowId;
    }

    public TaskFlowId getDynamicTaskFlowId1() {
        return TaskFlowId.parse(taskFlowId1);
    }

    public void setDynamicTaskFlowId1(String taskFlowId) {
        this.taskFlowId1 = taskFlowId;
    }
}
