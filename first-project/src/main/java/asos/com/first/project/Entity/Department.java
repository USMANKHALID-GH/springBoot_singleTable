package asos.com.first.project.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departid;
    private String departName;
    private  String departAdress;
    private  String departCode;
    private String departEmail;
   public Department(){

    }

    public Department(Long departid, String departName, String departAdress, String departCode, String departEmail) {
//        this.departid = departid;
        this.departName = departName;
        this.departAdress = departAdress;
        this.departCode = departCode;
        this.departEmail = departEmail;
    }



    @Override
    public String toString() {
        return "Department{" +
                "departid=" + departid +
                ", departName='" + departName + '\'' +
                ", departAdress='" + departAdress + '\'' +
                ", departCode='" + departCode + '\'' +
                ", departEmail='" + departEmail + '\'' +
                '}';
    }

    public Long getDepartid() {
        return departid;
    }

    public void setDepartid(Long departid) {
        this.departid = departid;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getDepartAdress() {
        return departAdress;
    }

    public void setDepartAdress(String departAdress) {
        this.departAdress = departAdress;
    }

    public String getDepartCode() {
        return departCode;
    }

    public void setDepartCode(String departCode) {
        this.departCode = departCode;
    }

    public String getDepartEmail() {
        return departEmail;
    }

    public void setDepartEmail(String departEmail) {
        this.departEmail = departEmail;
    }
}
