package cdit.ptit.java.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "News", schema = "dbo", catalog = "ezlife")
public class News {
    private int id;
    private Area area;
    private NewsType newsType;
    private String content;
    private Date time;
    private Date deadTime;
    private int status;
    private int view;
    private List<Social> socials;
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
    @ManyToOne
    @JoinColumn(name = "NewsTypeId")
    public NewsType getNewsType() {
		return newsType;
	}
    
    public void setNewsType(NewsType newsType) {
		this.newsType = newsType;
	}
    
    @OneToMany(mappedBy = "news", cascade = CascadeType.ALL)
    @JsonIgnore
    public List<Social> getSocials() {
		return socials;
	}
    
    public void setSocials(List<Social> socials) {
		this.socials = socials;
	}
    
    @Column(name = "Content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Column(name = "Times")
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Column(name = "DeadTime")
    public Date getDeadTime() {
        return deadTime;
    }

    public void setDeadTime(Date deadTime) {
        this.deadTime = deadTime;
    }

    @Column(name = "Status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Column(name = "Viewes")
    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

}
