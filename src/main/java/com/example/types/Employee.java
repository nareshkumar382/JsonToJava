
package com.example.types;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Employee
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "employeeName",
    "employeeId",
    "departmentName",
    "age"
})
public class Employee {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("employeeName")
    private String employeeName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("employeeId")
    private String employeeId;
    @JsonProperty("departmentName")
    private String departmentName;
    /**
     * Age in years
     * 
     */
    @JsonProperty("age")
    @JsonPropertyDescription("Age in years")
    private Integer age;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("employeeName")
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("employeeName")
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Employee withEmployeeName(String employeeName) {
        this.employeeName = employeeName;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("employeeId")
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("employeeId")
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Employee withEmployeeId(String employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    @JsonProperty("departmentName")
    public String getDepartmentName() {
        return departmentName;
    }

    @JsonProperty("departmentName")
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee withDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        return this;
    }

    /**
     * Age in years
     * 
     */
    @JsonProperty("age")
    public Integer getAge() {
        return age;
    }

    /**
     * Age in years
     * 
     */
    @JsonProperty("age")
    public void setAge(Integer age) {
        this.age = age;
    }

    public Employee withAge(Integer age) {
        this.age = age;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Employee withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Employee.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("employeeName");
        sb.append('=');
        sb.append(((this.employeeName == null)?"<null>":this.employeeName));
        sb.append(',');
        sb.append("employeeId");
        sb.append('=');
        sb.append(((this.employeeId == null)?"<null>":this.employeeId));
        sb.append(',');
        sb.append("departmentName");
        sb.append('=');
        sb.append(((this.departmentName == null)?"<null>":this.departmentName));
        sb.append(',');
        sb.append("age");
        sb.append('=');
        sb.append(((this.age == null)?"<null>":this.age));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.departmentName == null)? 0 :this.departmentName.hashCode()));
        result = ((result* 31)+((this.employeeName == null)? 0 :this.employeeName.hashCode()));
        result = ((result* 31)+((this.employeeId == null)? 0 :this.employeeId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.age == null)? 0 :this.age.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Employee) == false) {
            return false;
        }
        Employee rhs = ((Employee) other);
        return ((((((this.departmentName == rhs.departmentName)||((this.departmentName!= null)&&this.departmentName.equals(rhs.departmentName)))&&((this.employeeName == rhs.employeeName)||((this.employeeName!= null)&&this.employeeName.equals(rhs.employeeName))))&&((this.employeeId == rhs.employeeId)||((this.employeeId!= null)&&this.employeeId.equals(rhs.employeeId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.age == rhs.age)||((this.age!= null)&&this.age.equals(rhs.age))));
    }

}
