package cdit.ptit.java.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Report", schema = "dbo", catalog = "ezlife")
public class Report {
    private int id;
    private ReportType reportType;
    private Resident resident;
    private String content;
    private String imageUrl;
    private int status;
    private Date time;
    private long latitude;
    private long longtitude;
    private int view;

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
    @JoinColumn(name = "ReportTypeId")
    public ReportType getReportType() {
		return reportType;
	}
    public void setReportType(ReportType reportType) {
		this.reportType = reportType;
	}
    @ManyToOne
    @JoinColumn(name = "ResidentId")
    public Resident getResident() {
		return resident;
	}
    public void setResident(Resident resident) {
		this.resident = resident;
	}

    @Column(name = "Content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Column(name = "ImageUrl")
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Column(name = "Status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Column(name = "Times")
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Column(name = "Latitude")
    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    @Column(name = "Longtitude")
    public long getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(long longtitude) {
        this.longtitude = longtitude;
    }

    @Column(name = "Viewes")
    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }


}
