package cdit.ptit.java.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ReportType", schema = "dbo", catalog = "ezlife")
public class ReportType {
    private int id;
    private String name;
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

    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @OneToMany(mappedBy = "reportType",  cascade = CascadeType.ALL)
    @JsonIgnore
    public List<Report> getReports() {
		return reports;
	}
    public void setReports(List<Report> reports) {
		this.reports = reports;
	}
}
