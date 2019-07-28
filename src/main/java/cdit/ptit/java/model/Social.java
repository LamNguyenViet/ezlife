package cdit.ptit.java.model;

import javax.persistence.*;
@Entity
@Table(name = "Social", schema = "dbo", catalog = "ezlife")
public class Social {
    private int id;
    private News news;
    private Resident resident;
    private boolean like;
    private boolean bookmark;

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
    @JoinColumn(name = "NewsId")
    public News getNews() {
		return news;
	}
    public void setNews(News news) {
		this.news = news;
	}

    @ManyToOne
    @JoinColumn(name = "ResidentId")
    public Resident getResident() {
		return resident;
	}
    public void setResident(Resident resident) {
		this.resident = resident;
	}

    @Column(name = "Likes")
    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    @Column(name = "Bookmark")
    public boolean isBookmark() {
        return bookmark;
    }

    public void setBookmark(boolean bookmark) {
        this.bookmark = bookmark;
    }

}
