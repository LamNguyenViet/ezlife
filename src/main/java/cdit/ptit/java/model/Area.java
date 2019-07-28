package cdit.ptit.java.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "`Area`", schema = "dbo", catalog = "ezlife")
public class Area implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
    private String name;
    private int pid;
    private List<News> newses;
    private List<Resident> residents;
    private List<Government> governments;

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
    @Column(name = "Pid")
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
    @OneToMany(mappedBy = "area", cascade = CascadeType.ALL)
	@JsonIgnore
	public List<News> getNewses() {
		return newses;
	}
    public void setNewses(List<News> newses) {
		this.newses = newses;
	}
    @OneToMany(mappedBy = "area", cascade = CascadeType.ALL)
	@JsonIgnore
	public List<Government> getGovernments() {
		return governments;
	}
    public void setGovernments(List<Government> governments) {
		this.governments = governments;
	}
    @OneToMany(mappedBy = "area", cascade = CascadeType.ALL)
	@JsonIgnore
	public List<Resident> getResidents() {
		return residents;
	}
    public void setResidents(List<Resident> residents) {
		this.residents = residents;
	}

}
