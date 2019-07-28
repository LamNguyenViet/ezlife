package cdit.ptit.java.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "NewsType", schema = "dbo", catalog = "ezlife")
public class NewsType {
    private int id;
    private String name;
    private List<News> newses;

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
    @OneToMany(mappedBy = "newsType", cascade = CascadeType.ALL)
    @JsonIgnore
    public List<News> getNewses() {
		return newses;
	}
    public void setNewses(List<News> newses) {
		this.newses = newses;
	}

    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
