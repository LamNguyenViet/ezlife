package cdit.ptit.java.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Resident", schema = "dbo", catalog = "ezlife")
public class Resident {
    private int id;
    private Area area;
    private String name;
    private String phone;
    private String imageUrl;
    private String userName;
    private String password;
    private List<Social> socials;
    private List<Report> reports;

    @Id
    @TableGenerator(name = "gen_id", table = "HIBERNATE_GEN_ID", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VALUE", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "gen_id")
    @Column(name = "Id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @ManyToOne
    @JoinColumn(name = "AreaId")
    public Area getArea() {
		return area;
	}
    public void setArea(Area area) {
		this.area = area;
	}
    
    @OneToMany(mappedBy = "resident", cascade = CascadeType.ALL)
    @JsonIgnore
    public List<Social> getSocials() {
		return socials;
	}
    public void setSocials(List<Social> socials) {
		this.socials = socials;
	}
    @OneToMany(mappedBy = "resident", cascade = CascadeType.ALL)
    @JsonIgnore
    public List<Report> getReports() {
		return reports;
	}
    public void setReports(List<Report> reports) {
		this.reports = reports;
	}
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "Phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "ImageUrl")
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Column(name = "UserName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "Password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
