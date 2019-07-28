package cdit.ptit.java.model;

import javax.persistence.*;

@Entity
@Table(name = "Government", schema = "dbo", catalog = "ezlife")
public class Government {
    private int id;
    private Area area;
    private String name;
    private String hotLine;

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

    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "HotLine")
    public String getHotLine() {
        return hotLine;
    }

    public void setHotLine(String hotLine) {
        this.hotLine = hotLine;
    }

}
